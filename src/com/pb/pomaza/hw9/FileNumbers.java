package com.pb.pomaza.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class FileNumbers {

    public static void createNumbersFile(Path pathS) {
        Random random = new Random();
        try (BufferedWriter writer = Files.newBufferedWriter(pathS)) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    writer.write(random.nextInt(99) + 1 + " ");
                }
                writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + pathS.toAbsolutePath() + "\" done!");
    }

    public static void createOddNumbersFile(Path pathR, Path pathS) {
        System.out.println("Read text from file \"" + pathR.toAbsolutePath() + "\":");
        String strOut;
        ArrayList<String[]> numList = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(pathR)) {

            String line;
            String[] numOut;

            while ((line = reader.readLine()) != null) {
                numOut = line.split(" ");
                numList.add(numOut);
            }
        } catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
        int[][] arrayNum = new int[10][10];
        int tempNum, i = 0;
        for (String[] str : numList) {
            int j = 0;
            System.out.println(" ");
            for (String st : str) {
                tempNum = Integer.parseInt(st);
                if (tempNum % 2 == 0) {
                    arrayNum[i][j] = 0;
                } else {
                    arrayNum[i][j] = tempNum;
                }
                System.out.print(arrayNum[i][j] + " ");
                j++;
            }
            i++;
        }
        System.out.println();
        System.out.println("Read and convert is done!");

        StringBuilder finalNum = new StringBuilder(new String());
        try (BufferedWriter writer = Files.newBufferedWriter(pathS)) {
            for (int a = 0; a < 10; a++) {
                for (int b = 0; b < 10; b++) {
                    finalNum.append(arrayNum[a][b]).append(" ");
                }
                writer.write(finalNum.toString());
                writer.newLine();
                finalNum = new StringBuilder();
            }
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + pathS.toAbsolutePath() + "\" done!");

    }

      public static void main(String[] args) {
        System.out.println("Start script");
        Path path = Paths.get("C:\\Users\\User\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\pomaza\\hw9\\numbers.txt");
        Path pathS = Paths.get("C:\\Users\\User\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\pomaza\\hw9\\odd-numbers.txt");
        createNumbersFile(path);
        createOddNumbersFile(path, pathS);
    }
}




