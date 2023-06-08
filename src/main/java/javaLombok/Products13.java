package javaLombok;

import lombok.Value;
//semua field pada class yang diberi annotation @Value akan menjadi final sehingga tidak akan bisa ubah ubah lagi
//sehingga membuat class tersebut menjadi immutable
//jadi pada intinya untuk membuat class immutable dengan lombok cukup tambahkan annotation @Value
@Value
public class Products13 {
    private  Long id;
    private String name;
    private Long price;
}
