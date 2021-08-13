package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarketrestapp.entity.Basket;
import uz.pdp.pcmarketrestapp.entity.Order;
import uz.pdp.pcmarketrestapp.projection.CustomBasket;
import uz.pdp.pcmarketrestapp.projection.CustomOrder;

@RepositoryRestResource(path = "basket",excerptProjection = CustomBasket.class)
public interface BasketRepository extends JpaRepository<Basket,Integer> {
}
