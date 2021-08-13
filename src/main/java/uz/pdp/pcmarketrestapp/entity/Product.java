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
    private String brand;
    @Column(nullable = false)
    private Integer price;
    @Column(nullable = false)
    private boolean isActive=true;
    @Column(nullable = false)
    @ManyToOne
    private Category category;


    //describes of product to show in site
    private String describe;


    //computer values
    private String processor;
    private String ssd;
    private String hdd;
    private String ram;
    private String motherBoard;
    private String graphicProcessor;

    //printer values
    private boolean colorFull;
    private boolean doubleSidedPrinting;
    private String functions;

    //monitor values
    private String displayRefreshHz;
    private boolean curved;
    private String displayInch;
    private String videoConnectorType;
    private String responseTime;

    //armchair values
    private String liftingCapacity;
    private String color;
    private boolean headrest;

    //periferiya values

    private boolean wireless;
    private boolean gaming;
    private boolean silentButtons;
    private String otherFields;




    public String describeThisProduct(){
        String returner = "";
        Field[] fields = Product.class.getDeclaredFields();

        for (Field field : fields) {


            field.setAccessible(true);

            String name = field.getName();


            Object value = null;
            try {
                value = field.get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (value != null) {
                returner += name + ": "  + value + ",\n";
            }

        }
        returner = returner.substring(0, returner.length() - 2);
        return returner;
    }


}
