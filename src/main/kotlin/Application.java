import lec07.코틀린에서_예외를_다루는_방법.JavaFilePrinter;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        JavaFilePrinter.readFile();
    }
}
