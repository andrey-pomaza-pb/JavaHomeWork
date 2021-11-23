package com.pb.pomaza.hw9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriterTest {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\User\\IdeaProjects\\numbers.txt"));
        try {
            for(int i = 0; i< 100 ; i++) {


                out.write(String.valueOf(i));

                out.newLine();
            }

            System.out.print("Write Successful");
        } catch(IOException e1) {
            System.out.println("Error during reading/writing");
        } finally {
            out.close();
            in.close();
        }

    }

}