package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array[] = new int[21];

        for (int i = 20; i > 0; i--) {
            array[i] = i;
        }
        for (int i = 20; i > 0; i--) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}