package otus.basic.homeworks.hw13.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class Server {

    private static final HashSet<String> operations = new HashSet<>(Set.of("+", "sqrt", "/", "*", "-"));

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8080);
        System.out.println("SERVER APPLICATION RUN!");
        while (true) {
            Socket client = socket.accept();
            DataInputStream inputStream = new DataInputStream(client.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            String userInput = inputStream.readUTF();
            if (userInput.equals("start")) {
                outputStream.writeUTF("""
                        Server calculator
                        Available operations:
                        +
                        -
                        *
                        /
                        sqrt
                        Write first number or 'exit' for exit:""");
                outputStream.flush();
            }
            String number1 = inputStream.readUTF();
            if (number1.equals("exit")) {
                System.out.println("Клиент с портом :" + client.getPort() + " отключился!");
                client.close();
                continue;
            }
            System.out.println(number1);
            outputStream.writeUTF("Write operation: ");
            String operation = inputStream.readUTF();
            System.out.println(operation);
            String number2 = "0";
            if (!operation.equals("sqrt")) {
                outputStream.writeUTF("Write second number: ");
                number2 = inputStream.readUTF();
                System.out.println(number2);
            }
            if (!checkInputInfo(number1, number2, operation)) {
                outputStream.writeUTF("Incorrect input");
            } else {
                int num1 = Integer.parseInt(number1);
                int num2 = Integer.parseInt(number2);
                switch (operation) {
                    case "+" -> outputStream.writeUTF(Integer.toString(num1 + num2));
                    case "-" -> outputStream.writeUTF(Integer.toString(num1 - num2));
                    case "*" -> outputStream.writeUTF(Integer.toString(num1 * num2));
                    case "/" -> outputStream.writeUTF(Integer.toString(num1 / num2));
                    case "sqrt" -> outputStream.writeUTF(Double.toString(Math.sqrt(num1)));
                }
            }

        }
    }

    public static boolean checkInputInfo(String n1, String n2, String operation) {
        int number1, number2;
        try {
            number1 = Integer.parseInt(n1);
            number2 = Integer.parseInt(n2);
        } catch (NumberFormatException e) {
            return false;
        }
        if ((!operations.contains(operation)) ||
                (operation.equals("/") && number2 == 0) ||
                (operation.equals("sqrt") && number1 < 0)) {
            return false;
        }
        return true;

    }
}