package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarketrestapp.entity.Order;


@RepositoryRestResource(path = "order")
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
