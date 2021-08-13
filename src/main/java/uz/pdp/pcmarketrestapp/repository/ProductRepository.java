package uz.pdp.pcmarketrestapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarketrestapp.entity.Product;

import java.util.List;
@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query(nativeQuery = true,
    value = "select * from product p join character_key ck on p.id = ck.product_id join character_value cv on ck.id = cv.character_key_id\n" +
            "where :=myParametres")
    List<Product> filteredProducts(@Param("myParametres") String query);




    List<Product> findAllByCategoryId(Integer category_id);
}
