package org.example;


import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        int summary = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int x = 1; x<=n; x++){

            summary+=x;
            System.out.println(summary);
        }

    }
}