package javaLombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

//untuk melakukan overwrite annotation @Data yang didalamnya ada beberapa annotation otomatis yang diantaranya
//@Setter, @getter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode lakukan seperti contoh dibawah
@Data
@AllArgsConstructor//@AllArgsConstructor ini artinya overwrite @RequiredArgsConstructor yang otomatis ada dari @Data
@ToString(exclude = {"id", "name"})//@ToString ini artinya overwrite @ToString yang otomatis ada dari @Data
public class Products11 {
    private  Long id;
    private String name;
    private Long price;
}
