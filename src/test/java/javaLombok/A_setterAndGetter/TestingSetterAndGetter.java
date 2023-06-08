package javaLombok.A_setterAndGetter;

import javaLombok.Products;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingSetterAndGetter {
    //untuk mengetahui cara pembuatan setter and getter dengan lombok lihat di class Products
    private Products products = new Products();
    @Test
    void testSetterAndGetter() {
        this.products.setId(1L);
        this.products.setName("teh pucuk harum");
        this.products.setPrice(3_000L);
        this.products.setQuantity(130);
        this.products.setDescription("minuman kemasan teh manis");
        Assertions.assertEquals(1L, this.products.getId());
        Assertions.assertEquals("teh pucuk harum", this.products.getName());
        Assertions.assertEquals(3_000L, this.products.getPrice());
        Assertions.assertEquals(130, this.products.getQuantity());
        Assertions.assertEquals("minuman kemasan teh manis", this.products.getDescription());
    }

}
