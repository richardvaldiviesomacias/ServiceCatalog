package com.example.servicecatalog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ServiceCatalogApplicationTests {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void getServiceCatalog_returnsName() {
        ResponseEntity<ServiceCatalog> response = restTemplate.getForEntity("/services/details/everydollar-api", ServiceCatalog.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().getServiceName()).isEqualTo("everydollar-api");
    }
}
