package uz.pdp.pcmarketrestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarketrestapp.entity.Basket;
import uz.pdp.pcmarketrestapp.entity.BasketProduct;
import uz.pdp.pcmarketrestapp.entity.Product;

import java.util.List;

@Projection(types = BasketProduct.class)
public interface CustomBasketProduct {
    Product getProduct();
    Basket getBasket();
    Integer getAmount();
}
