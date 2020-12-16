package com.company;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer number;
        System.out.print("number: ");
        number = input.nextInt();
        while(true) {
            do {
                System.out.println(number + 1);
                number++;
            } while (number == number);
        }
    }
}
