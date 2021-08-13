package uz.pdp.pcmarketrestapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    @ManyToOne
//    private BasketProduct basket;
    private String fullName;
    private String address;
    private String phoneNumber;
    private String email;
    private String notes;

}
