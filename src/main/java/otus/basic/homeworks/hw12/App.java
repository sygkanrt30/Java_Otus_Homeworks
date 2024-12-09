package otus.basic.homeworks.hw12;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] listOfFile = getListNameFile();
        readInfo(listOfFile);
        writeInfo();
    }

    public static String[] getListNameFile() {
        File file = new File("C:\\Users\\slava\\Coding\\IdeaProjects\\Java_homeworks\\");
        FilenameFilter filter = (dir, name) -> name.endsWith("txt");
        return file.list(filter);
    }

    public static void readInfo(String[] listOfFile) {
        System.out.println("Please, write the name of the file whose contents you want to read:");
        String fileInName = scanner.nextLine();
        for (String s : listOfFile) {
            if (fileInName.equals(s)) {
                try (InputStreamReader file = new InputStreamReader(new BufferedInputStream(new FileInputStream(fileInName)))
                ) {
                    int n = file.read();
                    while (n != -1) {
                        System.out.print((char) n);
                        n = file.read();
                    }
                    System.out.println();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void writeInfo() {
        System.out.println("Please, write the name of the file for recording information:");
        String fileOutName = scanner.nextLine();
        System.out.println("Please, write content to be recorded:");
        String content = scanner.nextLine();
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileOutName))) {
            byte[] buf = content.getBytes(StandardCharsets.UTF_8);
            bos.write(buf);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
