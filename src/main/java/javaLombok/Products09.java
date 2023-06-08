package javaLombok;

import javaLombok.helpers.Sellers;
import lombok.EqualsAndHashCode;

//cara untuk membuat method overwrite equals and hashCode yang juga menggunakan field dari parentnya atau field supernya
//karena secara default method overwrite equals and hashCode hanya terbuat dari field lokal
// maka cukup tambahkan parameter callSuper = true pada annotationnya
@EqualsAndHashCode(callSuper = true)
public class Products09 extends Sellers {
    private  Long id;
    private String name;
    private Long price;
}
