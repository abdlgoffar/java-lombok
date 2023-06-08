package javaLombok.L_sneakyThrows;

import javaLombok.FileRead2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class TestingSneakyThrows {
    //@SneakyThrows adalah annotation untuk membuat sebuah throws Exception pada sebuah method di java.
    @Test
    void testThrowable() {
        Assertions.assertThrows(FileNotFoundException.class, () -> FileRead2.load2("file-tidak-ada.txt"));
    }
}
