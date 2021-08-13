package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pcmarketrestapp.entity.Category;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
