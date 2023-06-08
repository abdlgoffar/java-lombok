package javaLombok.D_equalsAndHashCode;

import javaLombok.Products08;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingEqualsAndHashCode {
    //untuk memngetahui cara pembuatan method overwrite equals and hashCode lihat di class Products08
    private Products08 products08A = new Products08();
    private Products08 products08B = new Products08();
    @Test
    void testEqualsAndHashCode() {
        //test equals, ini seharusnya true karena isi object ini sama yaitu null semua
        Assertions.assertEquals(true, products08A.equals(products08B));
        //test hashCode, ini seharusnya true karena isi object ini sama yaitu null dan angka hasCodenya pun pasti sama
        Assertions.assertEquals(true, this.products08A.hashCode() == this.products08B.hashCode());
    }
}
