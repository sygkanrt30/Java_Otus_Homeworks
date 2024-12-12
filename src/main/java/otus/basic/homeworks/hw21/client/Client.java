package otus.basic.homeworks.hw21.client;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static DataInputStream inputStream;
    private static DataOutputStream outputStream;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try (Socket socket = new Socket("localhost", 8080)) {
                inputStream = new DataInputStream(socket.getInputStream());
                outputStream = new DataOutputStream(socket.getOutputStream());
                send("start");
                String number1, number2, operation;
                System.out.println("Write first number or 'exit' for exit: ");
                number1 = scanner.nextLine();
                send(number1);
                System.out.println("Write operation: ");
                operation = scanner.nextLine();
                send(operation);
                if (!operation.equals("sqrt")) {
                    System.out.println("Write second number: ");
                    number2 = scanner.nextLine();
                } else {
                    number2 = "0";
                }
                send(number2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void send(String message) throws IOException {
        outputStream.writeUTF(message);
        outputStream.flush();
        try {
            String result = inputStream.readUTF();
            System.out.println(result);
        } catch (EOFException e) {
            System.out.println("The server closed the connection");
        }
    }


}
