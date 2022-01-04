package com.pb.pomaza.hw14;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        new Clients("localhost", 55555);
    }
}

class Clients {

    private Socket socket;
    private BufferedReader in;
    private BufferedWriter out;
    private BufferedReader inputUser;
    private String login;

    public Clients(String addr, int port) {
        try {
            this.socket = new Socket(addr, port);
        } catch (IOException e) {
            System.err.println("Socket failed");
        }
        try {
            inputUser = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.pressLogin();
            new ReadMsg().start();
            new WriteMsg().start();
        } catch (IOException e) {
            Clients.this.downService();
        }
    }

    private void pressLogin() {
        System.out.print("Enter your login: ");
        try {
            login = inputUser.readLine();
            out.write("Hello " + login + "\n");
            out.flush();
        } catch (IOException ignored) {
        }

    }

    private void downService() {
        try {
            if (!socket.isClosed()) {
                socket.close();
                in.close();
                out.close();
            }
        } catch (IOException ignored) {}
    }

    private class ReadMsg extends Thread {
        @Override
        public void run() {

            String str;
            try {
                while (true) {
                    str = in.readLine();
                    if (str.equals("exit")) {
                        Clients.this.downService();
                        break;
                    }
                    System.out.println(str);
                }
            } catch (IOException e) {
                Clients.this.downService();
            }
        }
    }

    public class WriteMsg extends Thread {

        @Override
        public void run() {
            while (true) {
                String userWord;
                try {
                    userWord = inputUser.readLine();
                    if (userWord.equals("exit")) {
                        out.write("exit" + "\n");
                        Clients.this.downService();
                        break;
                    } else {
                        out.write(login + ": " + userWord + "\n");
                    }
                    out.flush();
                } catch (IOException e) {
                    Clients.this.downService();

                }

            }
        }
    }
}

