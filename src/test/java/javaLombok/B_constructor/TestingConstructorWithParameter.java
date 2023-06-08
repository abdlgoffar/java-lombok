package javaLombok.B_constructor;

import javaLombok.Products04;
import org.junit.jupiter.api.Test;

public class TestingConstructorWithParameter {
    //untuk mengetahui cara pembuatan constructor parameter dengan lombok lihat di class Products04
    private Products04 products04;
    @Test
    void testConstructorWithParameter() {
        this.products04 = new Products04(1L, "kopikap", 3_500L);
    }
}
