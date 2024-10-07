package com.desing.patterms.abstras_factory_e_commerce_component.domain.abstract_factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.desing.patterms.abstras_factory_e_commerce_component.domain.models.Producto;

public class OracleProductoDAO implements ProductoDAO {
    private Map<Integer, Producto> productos = new HashMap<>();

    @Override
    public void crearProducto(Producto producto) {
        productos.put(producto.getId(), producto);
        System.out.println("Producto creado en Oracle: " + producto);
    }

    @Override
    public Producto leerProducto(int id) {
        return productos.get(id);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public void eliminarProducto(int id) {
        productos.remove(id);
    }

    @Override
    public List<Producto> listarProductos() {
        return productos.values().stream().collect(Collectors.toList());
    }
}