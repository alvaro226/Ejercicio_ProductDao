package com.desing.patterms.abstras_factory_e_commerce_component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.desing.patterms.abstras_factory_e_commerce_component.domain.abstract_factory.DBAdapter;
import com.desing.patterms.abstras_factory_e_commerce_component.domain.abstract_factory.MySQLAdapter;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    public DBAdapter dbAdapter() {
        // Aquí puedes seleccionar la implementación: MySQLAdapter o OracleAdapter
        return new MySQLAdapter();  // Cambia según la base de datos que quieras usar
    }
}
