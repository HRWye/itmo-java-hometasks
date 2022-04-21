package ru.itmo.hometasks.hwlesson20;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class EchoServer {
    private int port;
    private Connection connection;

    public EchoServer(int port){
        this.port = port;
    }

    public void start() throws IOException, ClassNotFoundException {
        try (ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server started...");
            int count = 0;
            while (true){
                Socket socket = serverSocket.accept();
                connection = new Connection(socket);
                count++;
                SimpleMessage message = connection.readMessage();
                printMessage(message);
                //если сообщение help, то вывод строчкой список команд
                if (message.getText().equalsIgnoreCase("help")||message.getText().equalsIgnoreCase("/help")){
                    connection.sendMessage(SimpleMessage.getMessage("server", "/help - пользователь хочет узнать список доступных команд\n" +
                            "    /count - пользователь хочет узнать количество подключений\n" +
                            "    /ping - пользователь хочет узнать время за которое сообщение доходит до сервера и возвращается обратно\n" +
                            "    /exit - пользователь хочет выйти из программы (завершение программы)"));
                }
                //если сообщение ping, то выводит время (разница между отправкой сообщения и получением)
                else if (message.getText().equalsIgnoreCase("ping")||message.getText().equalsIgnoreCase("/ping")){
                    connection.sendMessage(SimpleMessage.getMessage("server", "???"));
                }
                //если сообщение count, то здесь вывести значение счетчика
                else if (message.getText().equalsIgnoreCase("count")||message.getText().equalsIgnoreCase("/count")){
                    connection.sendMessage(SimpleMessage.getMessage("server", Integer.toString(count)));
                }
                connection.sendMessage(SimpleMessage.getMessage("server", "сообщение получено"));
            }
        }
    }

    private void printMessage(SimpleMessage message){
        System.out.println("получено сообщение: " + message);
    }

    public static void main(String[] args) {
        int port = 8090;
        EchoServer messageServer = new EchoServer(port);
        try {
            messageServer.start();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
