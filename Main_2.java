package com.company;
import java.util.Scanner;

/*Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести
 “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"*/

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String name1 = "Вячеслав";
        if (name.equals(name1)) {
            System.out.print("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }


    }
}