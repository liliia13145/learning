package ru.liliia.learning.stepik.basics.inputdata;

import java.util.Scanner;

public class TaskInputData07 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String st2 = sc.nextLine();
        String st3 = sc.nextLine();
        System.out.println("Привет, " + st + ", это твой помощник " + st2 + ".\n" + "У тебя " + st3 + " новых писем.");
    }
}
