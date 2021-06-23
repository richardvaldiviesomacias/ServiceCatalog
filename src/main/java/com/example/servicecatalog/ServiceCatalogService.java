package com.example.servicecatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCatalogService {
    private ServiceCatalogRepository serviceCatalogRepository;

    @Autowired
    public ServiceCatalogService(ServiceCatalogRepository serviceCatalogRepository) {
        this.serviceCatalogRepository = serviceCatalogRepository;
    }

    public ServiceCatalog getServiceCatalogDetails(String serviceName) {
        return serviceCatalogRepository.findByName(serviceName);
    }
}
