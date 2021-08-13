package uz.pdp.pcmarketrestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarketrestapp.entity.Basket;
import uz.pdp.pcmarketrestapp.entity.Product;
import uz.pdp.pcmarketrestapp.entity.User;

import java.util.List;

@Projection(types = User.class)
public interface CustomUser {
     String getFullName();
     String getPhoneNumber();
     String getPassword();
}
