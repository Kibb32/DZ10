package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int array[] = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Введите элементы массива:");
        for (int i = 0; i < 10; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
    }
}
