package uz.pdp.pcmarketrestapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.pcmarketrestapp.entity.Product;
import uz.pdp.pcmarketrestapp.repository.ProductRepository;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class CategoryService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> filtered(Map<String, String> params) {
        StringBuilder forQueryValues = new StringBuilder("(");
        StringBuilder forQueryKeys = new StringBuilder();
        Set<String> keySet = params.keySet();

        for (String key : keySet) {
            forQueryKeys.append(key).append(" in ");
            String values = params.get(key);
            String[] split = values.split(",");
            for (int i = 0; i < split.length; i++) {
                if (i == split.length - 1){
                    forQueryValues.append("'").append(split[i]).append("')");
                }else {
                    forQueryValues.append("'").append(split[i]).append("', ");
                }
            }
            forQueryKeys = forQueryKeys.append(" ").append(forQueryValues).append(" and ");
            forQueryValues=new StringBuilder("(");
        }
        String query = forQueryKeys.toString();
        if (query.endsWith("and ")) {
            query = query.substring(0, query.length() - 4);
        }
        List<Product> products = productRepository.filteredProducts(query);
        return products;
    }


}
