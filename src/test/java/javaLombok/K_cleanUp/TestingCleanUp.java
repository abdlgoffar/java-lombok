package javaLombok.K_cleanUp;

import javaLombok.FileRead;
import org.junit.jupiter.api.Test;

public class TestingCleanUp {
    //testing clean up biasa digunakan untuk close atau menutup sebuah object resource di java misal seperti
    //object connect ke database, java io dan lain-lain.
    //biasanya jika tidak menggunakan clean up di java lombok, maka opsi keduanya adalah mengunakan try cath finally statement.
    //untuk mengetahui cara pembuatan clean up lihhat di class FileRead.
    @Test
    void testReadFile() throws Exception {
        System.out.println(FileRead.load1("pom.xml"));
        System.out.println(FileRead.load2("pom.xml"));
    }
}
