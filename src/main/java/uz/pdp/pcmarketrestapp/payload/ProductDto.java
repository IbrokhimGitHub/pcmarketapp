package uz.pdp.pcmarketrestapp.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.pcmarketrestapp.entity.Category;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private String name;
    private String brand;
    private Integer price;
    private boolean isActive = true;
    private Integer categoryId;
    private String describe;
    private String processor;
    private String ssd;
    private String hdd;
    private String ram;
    private String motherBoard;
    private String graphicProcessor;
    private boolean colorFull;
    private boolean doubleSidedPrinting;
    private String functions;
    private String displayRefreshHz;
    private boolean curved;
    private String displayInch;
    private String videoConnectorType;
    private String responseTime;
    private String liftingCapacity;
    private String color;
    private boolean headrest;
    private boolean wireless;
    private boolean gaming;
    private boolean silentButtons;
    private String otherFields;
}


