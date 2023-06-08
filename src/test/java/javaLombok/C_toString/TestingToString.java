package javaLombok.C_toString;

import javaLombok.Products06;
import org.junit.jupiter.api.Test;

public class TestingToString {
    //untuk mengetahui cara pembuatan method averwrite toString menggunakan lombok lighat di class Products06
    @Test
    void testToString() {
        Products06 products06 = new Products06();
        System.out.println(products06);
    }
}
