package javaLombok.B_constructor;

import javaLombok.Products05;
import org.junit.jupiter.api.Test;

public class TestingConstructorSomeParameter {
    //untuk mengetahui cara pembuatan constructor hanya dengan beberapa parameter lihat di class Products05
    private Products05 products05;
    @Test
    void testConstructorSomeParameter() {
        this.products05 = new Products05(1L, "mie sedaap");
    }
}
