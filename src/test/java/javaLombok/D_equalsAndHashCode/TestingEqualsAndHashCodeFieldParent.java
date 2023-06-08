package javaLombok.D_equalsAndHashCode;

import javaLombok.Products09;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//untuk mengetahui cara pembuatan method overwrite equals dan hashCode dari field parent class atu super classnya maka
//lihat di class Products09
public class TestingEqualsAndHashCodeFieldParent {
    private Products09 products09A = new Products09();
    private Products09 products09B = new Products09();
    @Test
    void testEqualsAndHashCodeFieldParen() {
        //test equals, ini seharusnya true karena isi object ini sama yaitu null semua
        Assertions.assertEquals(true, this.products09A.equals(this.products09B));
        //test hashCode, ini seharusnya true karena isi object ini sama yaitu null dan angka hasCodenya pun pasti sama
        Assertions.assertEquals(true, this.products09A.hashCode() == this.products09B.hashCode());
    }
}
