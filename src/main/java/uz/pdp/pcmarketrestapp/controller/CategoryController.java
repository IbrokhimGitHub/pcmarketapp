package uz.pdp.pcmarketrestapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.pcmarketrestapp.entity.Product;
import uz.pdp.pcmarketrestapp.service.CategoryService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/swoof")
    public HttpEntity<?> getByFilter(@RequestParam Map<String,String> params){

        List<Product> filtered = categoryService.filtered(params);
        return ResponseEntity.ok(filtered);
    }

}
