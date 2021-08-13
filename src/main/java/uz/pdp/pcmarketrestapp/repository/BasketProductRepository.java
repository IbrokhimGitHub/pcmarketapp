package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarketrestapp.entity.Basket;
import uz.pdp.pcmarketrestapp.entity.BasketProduct;


@RepositoryRestResource(path = "basketProduct")
public interface BasketProductRepository extends JpaRepository<BasketProduct,Integer> {
}
