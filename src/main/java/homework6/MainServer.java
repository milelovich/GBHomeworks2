package homework6;

import java.io.*;
import java.net.*;

public class MainServer {
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.start();
        server.catchClient();
        new Thread() {
            public void run() {
                while (true) {
                    String txt = null;
                    try {
                        txt = server.in.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (txt != null) {
                        try {
                            server.sendMessage(txt);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                try {
                    server.writeToConsole();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}

