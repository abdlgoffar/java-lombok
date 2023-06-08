package javaLombok;

import lombok.Value;

//@value digunakan unntuk membuat sebuah class dan field menjadi final
//class final artinya class yang tidak bisa diturunkan lagi ke class lain atau class yang final berarti telah menjadi immutable class
//field final artinya field tersebut tidak bisa dibuat menggunkan setter dan hanya bisa dibuat menggyunakan constructor
@Value
public class Products16 {

    Long id;
    String name;
}
