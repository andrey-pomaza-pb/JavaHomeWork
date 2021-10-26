package com.pb.pomaza.hw4;
import java.util.Scanner;


public class CapitalLetter {
    public static void main(String[] args) {
        String str = null;
        String outStr = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        str = sc.nextLine();


        for (int i = 0; i < (str.length()); i++) {

            if (str.charAt(i) == ' ') {

                outStr = outStr.substring(0, i + 1) + str.substring(i + 1, i + 2).toUpperCase() + str.substring(i + 2);

            } else if (i == 0) {

                outStr = str.substring(0, 1).toUpperCase() + str.substring(1);

            }
        }
        System.out.println("STRING::" + outStr);
    }


}



