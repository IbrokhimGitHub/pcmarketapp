package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pcmarketrestapp.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    List<Product> findAllByCategoryId(Integer category_id);
}
