package com.desing.patterms.abstras_factory_e_commerce_component.domain.abstract_factory;
import com.desing.patterms.abstras_factory_e_commerce_component.domain.models.Producto;
import java.util.List;



public interface ProductoDAO {
    void crearProducto(Producto producto);
    Producto leerProducto(int id);
    void actualizarProducto(Producto producto);
    void eliminarProducto(int id);
    List<Producto> listarProductos();
}
