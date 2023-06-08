package javaLombok;

import lombok.EqualsAndHashCode;

//cara pembuatan method overwrite equals dan hashCode menggunakan lombok
@EqualsAndHashCode
public class Products08 {
    private  Long id;
    private String name;
    private Long price;
}
