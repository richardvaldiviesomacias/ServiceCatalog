package com.example.servicecatalog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
public class ServiceCatalog {
   @Getter @Setter
    private String serviceName;

    public ServiceCatalog(String serviceName) {
        this.serviceName = serviceName;
    }
}
