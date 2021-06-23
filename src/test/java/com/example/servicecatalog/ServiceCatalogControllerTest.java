package com.example.servicecatalog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ServiceCatalogController.class)
public class ServiceCatalogControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ServiceCatalogService serviceCatalogService;

    @Test
    void getServiceCatalog_returnsDetails() throws Exception {
        given(serviceCatalogService.getServiceCatalogDetails(anyString())).willReturn(new ServiceCatalog("everydollar-api"));
        mockMvc.perform(MockMvcRequestBuilders.get("/services/details/everydollar-api"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("serviceName").value("everydollar-api"));
    }
}
