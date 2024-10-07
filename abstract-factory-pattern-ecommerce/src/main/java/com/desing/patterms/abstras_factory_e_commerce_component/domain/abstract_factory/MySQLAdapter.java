package com.desing.patterms.abstras_factory_e_commerce_component.domain.abstract_factory;

import org.springframework.stereotype.Component;

@Component
public class MySQLAdapter implements DBAdapter {

    @Override
    public ProductoDAO createProductoDAO() {
        return new MySQLProductoDAO(); // Crea el DAO para MySQL
    }
}