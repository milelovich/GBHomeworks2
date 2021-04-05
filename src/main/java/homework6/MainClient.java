package homework6;

import java.io.*;
import java.net.*;

public class MainClient {
    public static void main(String[] args) throws IOException {
        Client client = new Client();
        System.out.println("Client started. Connecting to localhost: 6002");

        new Thread() {
            public void run() {
                try {
                    client.readMSG();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            public void run() {
                try {
                    client.sendMSG();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}

