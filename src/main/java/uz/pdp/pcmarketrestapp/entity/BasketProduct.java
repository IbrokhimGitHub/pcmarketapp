package uz.pdp.pcmarketrestapp.entity;

import javax.persistence.ManyToOne;

public class BasketProduct {
    @ManyToOne
    private Basket basket;
    @ManyToOne
    private Product product;
    private Integer amount;

}
