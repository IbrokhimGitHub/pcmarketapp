package uz.pdp.pcmarketrestapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.lang.reflect.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //all product values
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    @ManyToOne
    private Category category;
    private String description;

}
