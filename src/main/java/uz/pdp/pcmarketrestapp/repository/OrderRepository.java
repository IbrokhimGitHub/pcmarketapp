package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarketrestapp.entity.Category;
import uz.pdp.pcmarketrestapp.entity.Order;
import uz.pdp.pcmarketrestapp.projection.CustomCategory;
import uz.pdp.pcmarketrestapp.projection.CustomOrder;

@RepositoryRestResource(path = "order",excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
