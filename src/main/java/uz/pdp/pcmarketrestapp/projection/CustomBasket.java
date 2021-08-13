package uz.pdp.pcmarketrestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarketrestapp.entity.Basket;
import uz.pdp.pcmarketrestapp.entity.Order;
import uz.pdp.pcmarketrestapp.entity.Product;

import java.util.List;

@Projection(types = Basket.class)
public interface CustomBasket {
    List<Product> getProducts();
}
