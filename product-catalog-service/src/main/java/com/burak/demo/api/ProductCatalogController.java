package com.burak.demo.api;

import com.burak.demo.model.ProductDetails;
import com.burak.demo.model.Request;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;

@RestController
public class ProductCatalogController {

    private static HashMap<String, ProductDetails> catalog = new HashMap<>();

    static {
        catalog.put("PRODUCT001", new ProductDetails("PRODUCT001", "Sandisk UFM 16GB USB 3.0 Usb Drive", 100, new BigDecimal("39.90")));
        catalog.put("PRODUCT002", new ProductDetails("PRODUCT002", "Calvin Klein Perfume", 50, new BigDecimal("125.50")));
        catalog.put("PRODUCT003", new ProductDetails("PRODUCT003", "Samsung Headphone Set", 200, new BigDecimal("60.00")));
    }

    // get by product id
    // /cart?productId=PRODUCT001
    @RequestMapping(name = "/catalog", method = RequestMethod.POST)
    public ProductDetails getProductDetail(@RequestBody Request request) {
        return find(request.getId());
    }

    private ProductDetails find(String productId) {
        return catalog.get(productId);
    }

}
