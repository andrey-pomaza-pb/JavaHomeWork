package com.pb.pomaza.hw13;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Threads {

    public static class Buffer {

        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_RESET = "\u001B[0m";

        private final LinkedList<Integer> buffer = new LinkedList<>();
        private volatile boolean running = true;

        public synchronized void get() {
            while (running) {
                while (buffer.size() < 1) {
                    try {
                        wait();
                    } catch (InterruptedException ignored) {
                    }
                }
                buffer.remove();
                System.out.println(ANSI_RED + "Remove element" + ANSI_RESET);
                System.out.println(buffer);
                notify();
            }
        }

        public synchronized void put() {
            while (running) {
                while (buffer.size() >= 5) {
                    try {
                        wait();
                    } catch (InterruptedException ignored) {
                    }
                }
                buffer.add(new Random().nextInt(100));
                System.out.println(ANSI_GREEN + "Add new element to LinkedList" + ANSI_RESET);
                System.out.println(buffer);
                notify();
            }
        }

        public void shutdown() {
            this.running = false;
        }
    }

    public static class Consumer implements Runnable {

        Buffer buffer;

        public Consumer(Buffer buffer) {
            this.buffer = buffer;
        }

        public void run() {
            for (int i = 1; i < 5; i++) {
                buffer.get();
            }
        }
    }

    public static class Producer implements Runnable {
        Buffer buffer;
        public Producer(Buffer buffer) {
            this.buffer = buffer;
        }

        public void run() {
            for (int i = 1; i < 5; i++) {
                buffer.put();
            }
        }
    }

    public static void main(String[] args) {

        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        Thread pr = new Thread(producer);
        Thread cn = new Thread(consumer);
        pr.start();
        cn.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        buffer.shutdown();

    }
}