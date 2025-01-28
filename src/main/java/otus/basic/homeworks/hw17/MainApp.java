package otus.basic.homeworks.hw17;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи название файла, в котором нужно произвести подсчет");
        String fileName = scanner.nextLine();
        System.out.println("Введите последовательность символов");
        String mask = scanner.nextLine();
        System.out.println(symbolCounter(fileName, mask));
    }

    public static int symbolCounter(String fileName, String mask) {
        int k = 0;
        String fileContent;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            byte[] buffer = fileInputStream.readAllBytes();
            fileContent = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fileContent = fileContent.replace(mask, "0");
        for (int i = 0; i < fileContent.length(); i++) {
            if (fileContent.charAt(i) == '0') {
                k++;
            }
        }
        return k;
    }
}
