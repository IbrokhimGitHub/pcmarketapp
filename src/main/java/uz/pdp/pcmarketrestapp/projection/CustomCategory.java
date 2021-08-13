package uz.pdp.pcmarketrestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarketrestapp.entity.Category;

//@Projection(types = Category.class)
public interface CustomCategory {
    String getName();
}
