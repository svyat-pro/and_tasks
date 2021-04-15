package com.company;
import java.util.Scanner;

//Составить алгоритм: если введенное число больше 7, то вывести “Привет”
public class Main {

    public static void main(String[] args) {
        System.out.print("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }

    }
}
