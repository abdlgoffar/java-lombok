package javaLombok.G_ImmutableClass;

import javaLombok.Products13;
import org.junit.jupiter.api.Test;

public class TestingImmutableClass {
    //untuk mengetahui cara pembuatan immutable class menggunkan lombok lihat di class Products13
    @Test
    void testImmutableClass() {
        Products13 products13 = new Products13(1L, "keripik ketela", 2_500L);

    }
}
