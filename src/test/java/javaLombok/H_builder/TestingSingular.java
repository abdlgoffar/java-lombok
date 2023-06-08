package javaLombok.H_builder;


import javaLombok.Products14;
import javaLombok.Products15;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestingSingular {
    //untuk mengetahui cara pembuatan singular lihat di class products15
    @Test
    void testCreateObjectWithoutBuilder1() {

        List<String> sellers = new ArrayList<>();
        sellers.add("erigo shop");
        sellers.add("screamous shop");
        //membuat object builder yang mempunyai data collection tanpa singular
        Products15.builder()
                .id(1L)
                .name("celana jeans")
                .sellers(sellers)
                .build();
    }
    @Test
    void testCreateObjectWithBuilder1() {
        //membuat object builder yang mempunyai data collection dengan singular
        Products15.builder()
                .id(1L)
                .name("celana jeans")
                .seller("erigo shop")
                .seller("screamous shop")
                .build();
    }
}
