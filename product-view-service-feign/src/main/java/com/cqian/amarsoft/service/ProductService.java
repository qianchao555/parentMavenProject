package java.com.cqian.amarsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.com.cqian.amarsoft.client.ProductClientFeign;
import java.com.cqian.amarsoft.pojo.Product;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return
                productClientFeign.listProducts();

    }
}
