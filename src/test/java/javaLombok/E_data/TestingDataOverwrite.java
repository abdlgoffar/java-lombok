package javaLombok.E_data;

import javaLombok.Products11;
import org.junit.jupiter.api.Test;

public class TestingDataOverwrite {

    //untuk mengetahui cara pembuatan data overwrite lihat di class Products11
    private Products11 products11;
    @Test
    void testDataOverwrite() {
        this.products11 = new Products11(1L, "keripik pisang", 7_000L);
        System.out.println(this.products11);
    }
}
