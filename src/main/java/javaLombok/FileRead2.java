package javaLombok;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.Scanner;
//contoh cara penggunaan @SneakyThrows lombok
public class FileRead2 {
    //method yang mempunyai exception tanpa menggunakan @SneakyThrows lombok
    public static String load1(String file) throws Exception {
        FileReader read = null;
        Scanner scanner = null;
        StringBuilder builder = new StringBuilder();
        try {
            read = new FileReader(file);

            try {
                scanner = new Scanner(read);
                while (scanner.hasNextLine()){
                    builder.append(scanner.nextLine())
                            .append("\n");
                }
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        } finally {
            if (read != null) {
                read.close();
            }
        }


        return builder.toString();
    }
    //method yang mempunyai exception menggunakan @SneakyThrows lombok
    @SneakyThrows
    public static String load2(String file)  {
        @Cleanup FileReader read = new FileReader(file);
        @Cleanup Scanner scanner = new Scanner(read);

        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine()){
            builder.append(scanner.nextLine())
                    .append("\n");
        }
        return builder.toString();
    }

}
