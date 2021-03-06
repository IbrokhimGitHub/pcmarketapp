package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarketrestapp.entity.Basket;


@RepositoryRestResource(path = "basket")
public interface BasketRepository extends JpaRepository<Basket,Integer> {
}
