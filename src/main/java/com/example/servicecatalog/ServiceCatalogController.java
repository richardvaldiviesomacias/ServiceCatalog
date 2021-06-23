package com.example.servicecatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceCatalogController {
    private ServiceCatalogService serviceCatalogService;

    @Autowired
    public ServiceCatalogController(ServiceCatalogService serviceCatalogService) {
        this.serviceCatalogService = serviceCatalogService;
    }

    @GetMapping("/services/details/{serviceName}")
    public ServiceCatalog getService(@PathVariable String serviceName) {
        return serviceCatalogService.getServiceCatalogDetails(serviceName);
    }
}
