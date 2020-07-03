package com.cqian.amarsoft.client;

import com.cqian.amarsoft.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Component
public class ProductClientRibbon {
    //"http://product-data-service/products"

    @Autowired
    RestTemplate restTemplate;
    public List<Product> listProducts(){
        return
                restTemplate.getForObject("http://product-data-service/products",List.class);

    }
}

