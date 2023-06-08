package javaLombok;

import lombok.ToString;

//cara pembuatan method overwrite toString hanya beberapa field saja menggunakan lambda
//jika sebuah field di exclude maka field tersebut tidak akan ikut dibuat dalam pembuatan method overwrite toString
@ToString(exclude = {"id", "name"})

public class Products07 {
    private  Long id;
    private String name;
    private Long price;
}

