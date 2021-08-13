package uz.pdp.pcmarketrestapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.pcmarketrestapp.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/{id}")
    public String getOne(@PathVariable Integer id){
        String one = productService.getOne(id);
        return one;

    }
    @GetMapping("/category/{id}")
    public  List<String> getByCategory(@PathVariable(value = "id") Integer categoryId){
        List<String> byCategory = productService.getByCategory(categoryId);
        return byCategory;

    }
}
