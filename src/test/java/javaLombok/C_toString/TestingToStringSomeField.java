package javaLombok.C_toString;

import javaLombok.Products07;
import org.junit.jupiter.api.Test;

public class TestingToStringSomeField {
    //untuk mengetahui cara pembuatan method overwrite toString dengan hanya beberapa field lihat di class Products07
    @Test
    void testoStringSomeField() {
        Products07 products07 = new Products07();
        System.out.println(products07);
    }
}
