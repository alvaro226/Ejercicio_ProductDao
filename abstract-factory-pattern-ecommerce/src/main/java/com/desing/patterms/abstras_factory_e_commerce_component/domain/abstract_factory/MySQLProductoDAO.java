package com.desing.patterms.abstras_factory_e_commerce_component.domain.abstract_factory;

import com.desing.patterms.abstras_factory_e_commerce_component.domain.models.Producto;
import java.util.ArrayList;
import java.util.List;


public class MySQLProductoDAO implements ProductoDAO {
    private List<Producto> productos = new ArrayList<>();

    @Override
    public void crearProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto creado en MySQL: " + producto);
    }

    @Override
    public Producto leerProducto(int id) {
        return productos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        productos.replaceAll(p -> p.getId() == producto.getId() ? producto : p);
    }

    @Override
    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }

    @Override
    public List<Producto> listarProductos() {
        return productos;
    }

   
}