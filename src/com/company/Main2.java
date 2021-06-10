package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int array[] = new int[20];

        for (int i = 0; i < 20; i++) {
        array[i] = (int) Math.round((Math.random() * 50) + 50);
    }
        for (int i = 0; i < 20; i++) {
        System.out.print (" " + array[i]);
    }
        System.out.println();
}
}
