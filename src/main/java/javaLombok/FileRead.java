package javaLombok;

import lombok.Cleanup;

import java.io.FileReader;
import java.util.Scanner;

//STUDI KASUS JAVA IO
public class FileRead {
    //contoh manual cara clean up atau menutup object resource di java
    //disini ada contoh object resource ke java io FileReader
    public static String load1(String file) throws Exception {
        FileReader read = null;
        Scanner scanner = null;
        StringBuilder builder = new StringBuilder();
        try {
            read = new FileReader(file);

            try {
                scanner = new Scanner(read);
                while (scanner.hasNextLine())/*menambahkan semua text di file ke object StringBuilder */ {
                    builder.append(scanner.nextLine())/*menambahkan semua text di file ke object StringBuilder */
                            .append("\n");/*menambahkan enter ke object StringBuilder */
                }
            } finally {
                //di contoh cara manual clean up atau menutup object resource di java,
                //maka object resource harus di null kan atau di close secara manual di dalam statement try catch finally.
                if (scanner != null) {
                    scanner.close();
                }
            }
        } finally {
            //di contoh cara manual clean up atau menutup object resource di java,
            //maka object resource harus di null kan atau di close secara manual di dalam statement try catch finally.
            if (read != null) {
                read.close();
            }
        }


        return builder.toString();
    }
    //contoh cara clean up atau menutup object resource di java menggunakan @Cleanup lombok
    //disini ada contoh object resource ke java io FileReader
    public static String load2(String file) throws Exception {
        @Cleanup FileReader read = new FileReader(file);
        @Cleanup Scanner scanner = new Scanner(read);

        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine())/*menambahkan semua text di file ke object StringBuilder */ {
            builder.append(scanner.nextLine())/*menambahkan semua text di file ke object StringBuilder */
                    .append("\n");/*menambahkan enter ke object StringBuilder */
        }
        return builder.toString();
    }
}
