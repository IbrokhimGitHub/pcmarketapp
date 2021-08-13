package uz.pdp.pcmarketrestapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.pcmarketrestapp.template.AbsComputer;


import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Computer extends AbsComputer {
private String motherBoard;
private String graphicProcessor;






}