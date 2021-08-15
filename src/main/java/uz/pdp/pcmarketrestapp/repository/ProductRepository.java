package uz.pdp.pcmarketrestapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarketrestapp.entity.FilterResult;
import uz.pdp.pcmarketrestapp.entity.Product;

import java.util.List;
@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query(nativeQuery = true,
    value = "select p.name, price, ck.property , value, p.description from product p join character_key ck on p.id = ck.product_id join character_value cv on ck.id = cv.character_key_id "+
    "where property in :properties1 and value  in :values1 ")
    List<FilterResult> filteredProducts(@Param("properties1") String properties, @Param("values1") String values);




    List<Product> findAllByCategoryId(Integer category_id);
}
