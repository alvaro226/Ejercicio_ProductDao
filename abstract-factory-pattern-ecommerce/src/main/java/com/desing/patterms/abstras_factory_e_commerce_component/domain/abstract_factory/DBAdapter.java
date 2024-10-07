package com.desing.patterms.abstras_factory_e_commerce_component.domain.abstract_factory;

public interface DBAdapter {
    ProductoDAO createProductoDAO();  // Método para crear un DAO de productos
}