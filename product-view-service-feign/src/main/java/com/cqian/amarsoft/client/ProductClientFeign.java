package java.com.cqian.amarsoft.client;

import org.springframework.cloud.openfeign.FeignClient;

import java.com.cqian.amarsoft.pojo.Product;
import java.util.List;

@FeignClient(value = "product-data-service")
public interface ProductClientFeign {
    public List<Product> listProducts();
}
