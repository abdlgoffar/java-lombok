package javaLombok.H_builder;

import javaLombok.Products14;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestingBuilder {
//untuk mengetahui cara pembuatan builder lihat di class products14
    @Test
    void testCreateObjectWithoutBuilder() {
        //membuat object class tanpa builder
        List<String> sellers = new ArrayList<>();
        sellers.add("erigo shop");
        sellers.add("screamous shop");
        Products14 products14 = new Products14(1L, "flannel", sellers);
    }
    @Test
    void testCreateObjectWithBuilder() {
        //membuat object class dengan builder
        List<String> sellers = new ArrayList<>();
        sellers.add("erigo shop");
        sellers.add("screamous shop");
        Products14.builder()
                .id(1L)
                .name("jacket")
                .sellers(sellers)
                .build();
    }

}
