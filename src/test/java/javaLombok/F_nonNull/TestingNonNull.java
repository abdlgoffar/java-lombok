package javaLombok.F_nonNull;

import javaLombok.Products12;
import org.junit.jupiter.api.Test;

public class TestingNonNull {
    //untuk mengetahui cara pembuatan nonNull annotation dengan lombok lihat di class Products12
    @Test
    void testNonNull() {
        Products12 products12 = new Products12(1L, null, 1_000L);
    }
}
