package javaLombok;

import lombok.RequiredArgsConstructor;
//cara pembuatan constructor dengan beberapa parameter, dimana parameternya hanya dari field yang dideklarasikan secara final
//menggunakan lombok, seperti contoh dibawah
@RequiredArgsConstructor
public class Products05 {
    private final Long id;
    private final String name;
    private Long price;
}
