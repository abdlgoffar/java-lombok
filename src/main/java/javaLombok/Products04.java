package javaLombok;

import lombok.AllArgsConstructor;

//cara pembuatan constructor dengan semua field sebagai parameternya menggunakan lombok
//urutan parameternya sesuai dengan urutan fieldnya
@AllArgsConstructor
public class Products04 {
    private Long id;
    private String name;
    private Long price;
}
