package javaLombok.B_constructor;

import javaLombok.Products03;
import org.junit.jupiter.api.Test;

public class TestingConstructorWithoutParameter {
    //untuk mengetahui cara pembuatan constructor tanpa parameter dengan lombok lihat di class Products03
    private Products03 products03;
    @Test
    void testConstructorWithoutParameter() {
        this.products03 = new Products03();
    }
}
