package uz.pdp.pcmarketrestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarketrestapp.entity.Basket;
import uz.pdp.pcmarketrestapp.entity.BasketProduct;
import uz.pdp.pcmarketrestapp.entity.Category;
import uz.pdp.pcmarketrestapp.entity.Product;

@Projection(types = BasketProduct.class)
public interface CustomProduct {
    String getName();

    String getDescription();

    Integer getPrice();

    Category getCategory();


}
