package uz.pdp.pcmarketrestapp.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbsComputer extends AbsProduct{
    private String processor;
    private String ssd;
    private String hdd;
    private String ram;


}
