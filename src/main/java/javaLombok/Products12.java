package javaLombok;

import lombok.Data;
import lombok.NonNull;

//@nonNull berguna pada field
//jika field di set @NonNull maka pada method setter dan constructornya akan dilakukan pengecekan nonNull dan apabila value
//dari method setter atau constructornya itu null maka akan terjadi Error Exception NullPointerException
@Data
public class Products12 {
    @NonNull
    private  Long id;
    @NonNull
    private String name;
    @NonNull
    private Long price;
}
