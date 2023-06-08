package javaLombok;

import lombok.Data;

//@Data berfungsi  untuk membuat @Setter, @getter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode secara otomatis
//jadi jika sudah menggunakan @Data maka semua annotation tersebut otomatis dibuat
@Data
public class Products10 {
    private final  Long id;
    private final String name;
    private final Long price;
}
