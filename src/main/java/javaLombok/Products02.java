package javaLombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
//cara pembuatan setter dengan acces levelnya juga menggunakan lombok
//jika setter diberikan acces level maka visibility method setternya sama seperti yang di acces levelnya
@Getter
public class Products02 {
    @Setter(value = AccessLevel.PRIVATE)
    private Long id;
    @Setter(value = AccessLevel.PRIVATE)
    private String name;
    @Setter(value = AccessLevel.PRIVATE)
    private Long price;
}
