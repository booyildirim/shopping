package com.burak.demo.api;

import com.burak.demo.client.CatalogClient;
import com.burak.demo.model.GetProductDetailsRequest;
import com.burak.demo.model.Item;
import com.burak.demo.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CartController {

    @Autowired
    private CatalogClient productCatalog;

    // /cart?userId=1
    @RequestMapping("/cart")
    public ShoppingCart getCart(@RequestParam (value = "userId") String userId) {
        return fillMockChart();
    }

    private ShoppingCart fillMockChart() {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("PRODUCT001", 1, "Sandisk UFM 16GB USB 3.0 Usb Drive");
        Item item2 = new Item("PRODUCT002", 2, "Calvin Klein Perfume");
        Item item3 = new Item("PRODUCT003", 1, "Samsung Headphone Set");

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        BigDecimal total = BigDecimal.ZERO;
        for(Item i: cart.getItems()) {
            GetProductDetailsRequest detailsRequest = new GetProductDetailsRequest();
            detailsRequest.setId(i.getId());
            BigDecimal itemPrice = productCatalog.details(detailsRequest).getSinglePrice();
            total = total.add(itemPrice);
        }
        cart.setTotalPrice(total);
        return cart;
    }

}
