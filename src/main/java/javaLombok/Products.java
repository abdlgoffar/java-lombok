package javaLombok;

import lombok.Getter;
import lombok.Setter;

//cara pembuatan setter dan getter menggunakan lombok
@Setter
@Getter
public class Products {
    private Long id;
    private String name;
    private Long price;
    private Integer quantity;
    private String description;
}
