package lec07.코틀린에서_예외를_다루는_방법;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaFilePrinter {

    public static void readFile() throws IOException {
        File currentFile = new File(".");
        File file = new File(currentFile.getAbsoluteFile() + "/a.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println(br.readLine());
        br.close();
    }

    // try-with-resource구문
    // 자동으로 외부자원을 사용하고 try구문이 끝날 때 자동으로 외부자원을 닫아줌
    // jdk7에서 추가됨
    public static void readFileV2(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            System.out.println(br.readLine());
        }
    }
}
