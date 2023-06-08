package javaLombok;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class Products15 {
    private  Long id;
    private String name;
    //@Singular digunakan pada data collection pada class yang diberi annoation builder, agar data collection tersebut
    //bisa di build juga pada saat pembuatan object nya.
    @Singular
    private List<String> sellers;
    public Products15(Long id, String name, List<String> sellers) {
        this.id = id;
        this.name = name;
        this.sellers = sellers;
    }
}
