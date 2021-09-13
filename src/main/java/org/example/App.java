/*
 *  UCF COP3330 Fall 2021 Assignment 1.2 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); //User input
        System.out.println("What is the input string?"); //Asking question
        String input = x.nextLine();
        System.out.println(input+" has "+input.length()+" characters"); //Printing
    }
}
