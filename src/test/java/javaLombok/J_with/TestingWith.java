package javaLombok.J_with;


import javaLombok.Products17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingWith {
    @Test
    void createObjectWithoutWith()
    {
        //contoh cara pembuatan beberapa object tanpa with
        Products17 products1 = new Products17(1l, "mie ayam");
        Products17 products2 = new Products17(2l, "mie ayam");
        Assertions.assertNotEquals(products1.getId(), products2.getId());
    }
    @Test
    void createObjectUseWith()
    {
        //contoh cara pembuatan beberapa object menggunakan with
        Products17 products1 = new Products17(1l, "mie ayam");
        Products17 products2 = products1.withId(2l);
        Assertions.assertNotEquals(products1.getId(), products2.getId());
    }
}
