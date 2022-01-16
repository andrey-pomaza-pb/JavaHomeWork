package com.pb.pomaza.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientWindow extends JFrame {

    private Scanner inMessage;
    private PrintWriter outMessage;
    private final JTextField jtfMessage;
    private final JTextField jtfName;
    private final JTextArea jtaTextAreaMessage;
    private String clientName = "";


    public ClientWindow() {
        try {
            Socket socket = new Socket("localhost", 55555);
            inMessage = new Scanner(socket.getInputStream());
            outMessage = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        setBounds(500, 500, 700, 600);
        setTitle("Chat");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jtaTextAreaMessage = new JTextArea();
        jtaTextAreaMessage.setEditable(false);
        jtaTextAreaMessage.setLineWrap(true);

        JScrollPane jsp = new JScrollPane(jtaTextAreaMessage);
        add(jsp, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        add(bottomPanel, BorderLayout.SOUTH);

        JButton jbSendMessage = new JButton("Send");
        bottomPanel.add(jbSendMessage, BorderLayout.EAST);

        jtfMessage = new JTextField("Enter your message: ");
        bottomPanel.add(jtfMessage, BorderLayout.CENTER);

        jtfName = new JTextField("Enter your name: ");
        bottomPanel.add(jtfName, BorderLayout.WEST);

        jbSendMessage.addActionListener(e -> {
            if (!jtfMessage.getText().trim().isEmpty() && !jtfName.getText().trim().isEmpty()) {
                clientName = jtfName.getText();
                sendMsg();
                jtfMessage.grabFocus();
            }
        });

        jtfMessage.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfMessage.setText("");
            }
        });

        jtfName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfName.setText("");
            }
        });

        new Thread (() -> {
            try {
                while (true) {
                    if (inMessage.hasNext()) {
                        String inMes = inMessage.nextLine();
                        jtaTextAreaMessage.append(inMes + "\n");
                    }
                }
            } catch (Exception ignored) {
            }
        }).start();
        setVisible(true);
    }

    public void sendMsg() {
        String messageStr = jtfName.getText() + ": " + jtfMessage.getText();
        outMessage.println(messageStr);
        outMessage.flush();
        jtfMessage.setText("");
    }
    public static void main(String[]args){
        ClientWindow clientWindow = new ClientWindow();
    }
}