package uz.pdp.pcmarketrestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarketrestapp.entity.Basket;
import uz.pdp.pcmarketrestapp.entity.Category;
import uz.pdp.pcmarketrestapp.entity.Order;

@Projection(types = Order.class)
public interface CustomOrder {
    Basket getBasket();
    String getFullName();
    String getAddress();
    String getPhoneNumber();
    String getEmail();
    String getNotes();
}
