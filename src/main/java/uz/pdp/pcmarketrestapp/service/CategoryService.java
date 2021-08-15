package uz.pdp.pcmarketrestapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.pcmarketrestapp.entity.FilterResult;
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

    public List<FilterResult> filtered(Map<String, String> params) {
        Set<String> keySet = params.keySet();
        Collection<String> values = params.values();
        String strValues="";
        for (String value : values) {
            strValues+=value+",";
        }
        strValues = strValues.substring(0, strValues.length() - 1);
        String[] split = strValues.split(",");



        String keyString=" ('";
        String valueString=" ('";
        for (String key : keySet) {
            keyString+=key+"', '";
        }
        keyString=keyString.substring(0,keyString.length()-3)+")";

        for (String value : split) {
            valueString+=value+"', '";
        }
        valueString=valueString.substring(0,valueString.length()-3)+")";

        System.out.println(keyString);
        System.out.println(valueString);
        keyString="property=ram";
        valueString="value =18GB";
        List<FilterResult> products = productRepository.filteredProducts(keyString,valueString);

        return products;
    }


}
