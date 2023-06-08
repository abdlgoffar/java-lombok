package javaLombok;

import lombok.Value;
import lombok.With;

@Value
public class Products17 {

    //@With annotatiion yang digunakan untuk mengubah value pada field sebuah object dan akan menghasilkan sebuah
    //object baru.
    @With
    Long id;
    String name;
}
