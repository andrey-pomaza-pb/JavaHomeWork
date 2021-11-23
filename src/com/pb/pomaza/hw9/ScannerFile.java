package com.pb.pomaza.hw9;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerFile extends  WriterTest {

        Path path = Paths.get("numbers.txt");

    {

        Scanner scan = new Scanner ("numbers.txt");
        scan.useDelimiter("'");


        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        scan.close();
    }
}