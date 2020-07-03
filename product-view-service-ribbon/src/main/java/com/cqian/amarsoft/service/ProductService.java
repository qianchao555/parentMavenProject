package com.cqian.amarsoft.service;

import com.cqian.amarsoft.client.ProductClientRibbon;
import com.cqian.amarsoft.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProducts() {
        return productClientRibbon.listProducts();

    }
}
