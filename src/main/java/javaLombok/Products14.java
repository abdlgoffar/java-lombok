package javaLombok;

import lombok.Builder;

import java.util.List;

//builder digunakan agar pembuatan object pada suatu class tertentu menjadi lebih cepat dan mudah.
//untuk membuat seuah builder pada class tertentu cukup gunakan annotation @Builder.
//secara default nanti annotation @Builder akan membuatkan method static builder() pada class yg diberi annotation @Builder tersebut.
@Builder
public class Products14 {
    public Products14(Long id, String name, List<String> sellers) {
        this.id = id;
        this.name = name;
        this.sellers = sellers;
    }

    private  Long id;
    private String name;
    private List<String> sellers;
}

