package com.example.servicecatalog;

import org.springframework.stereotype.Repository;

@Repository
public class ServiceCatalogRepository {
    public ServiceCatalog findByName(String name) {
        return new ServiceCatalog(name);
    }
}
