package com.desing.patterms.abstras_factory_e_commerce_component.domain.abstract_factory;

import org.springframework.stereotype.Component;

@Component
public class OracleAdapter implements DBAdapter {

    @Override
    public ProductoDAO createProductoDAO() {
        return new OracleProductoDAO(); // Crea el DAO para Oracle
    }
}