package uz.pdp.pcmarketrestapp.entity;

import javax.persistence.ManyToOne;

public class CharacterValue {
    private Integer id;
    private String property;
    @ManyToOne
    private CharacterKey characterKey;
}
