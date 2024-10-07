package com.desing.patterms.abstras_factory_e_commerce_component.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.desing.patterms.abstras_factory_e_commerce_component.domain.abstract_factory.DBAdapter;
import com.desing.patterms.abstras_factory_e_commerce_component.domain.abstract_factory.ProductoDAO;
import com.desing.patterms.abstras_factory_e_commerce_component.domain.models.Producto;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final DBAdapter dbAdapter;

    @Autowired
    public ProductoController(DBAdapter dbAdapter) {
        this.dbAdapter = dbAdapter;
    }

    @PostMapping("/crear")
    public void crearProducto(@RequestBody Producto producto) {
        ProductoDAO productoDAO = dbAdapter.createProductoDAO();
        productoDAO.crearProducto(producto);
    }

    @GetMapping("/{id}")
    public Producto leerProducto(@PathVariable int id) {
        ProductoDAO productoDAO = dbAdapter.createProductoDAO();
        return productoDAO.leerProducto(id);
    }

    @PutMapping("/actualizar")
    public void actualizarProducto(@RequestBody Producto producto) {
        ProductoDAO productoDAO = dbAdapter.createProductoDAO();
        productoDAO.actualizarProducto(producto);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable int id) {
        ProductoDAO productoDAO = dbAdapter.createProductoDAO();
        productoDAO.eliminarProducto(id);
    }

    @GetMapping("/listar")
    public List<Producto> listarProductos() {
        ProductoDAO productoDAO = dbAdapter.createProductoDAO();
        return productoDAO.listarProductos();
    }
}
