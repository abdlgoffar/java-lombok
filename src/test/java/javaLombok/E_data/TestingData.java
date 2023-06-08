package javaLombok.E_data;

import javaLombok.Products10;
import org.junit.jupiter.api.Test;

public class TestingData {
    //untuk mengetahui tentang atau cara pembuatan data, maka lihat di class Products10
    private Products10 products10;
    @Test
    void testData() {
        this.products10 = new Products10(1L, "keripik singkong", 2_000L);
        this.products10.getId();
        this.products10.getName();
        this.products10.getPrice();
    }
}
