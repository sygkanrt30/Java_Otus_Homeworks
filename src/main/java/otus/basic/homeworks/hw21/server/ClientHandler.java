package otus.basic.homeworks.hw21.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public record ClientHandler(Socket clientSocket, DataInputStream inputStream, DataOutputStream outputStream){}


