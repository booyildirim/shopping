package com.burak.demo.client;

import com.burak.demo.model.GetProductDetailsRequest;
import com.burak.demo.model.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class CatalogClient {

    @Autowired
    private LBClient client;

    @FeignClient(name = "product-catalog")
    interface LBClient {
        @RequestMapping(value = "/catalog", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
        @ResponseBody
        ProductDetails getDetails(@RequestBody GetProductDetailsRequest request);
    }

    public ProductDetails details(GetProductDetailsRequest request) {
        return client.getDetails(request);
    }
}
