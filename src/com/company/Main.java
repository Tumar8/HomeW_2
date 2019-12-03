package com.company;

public class Main {

    public static void main(String[] args) {

        String name = "Tumar";
        System.out.println(name);

        int age = 19;
        System.out.println(age);

        int temperature = 7;

        if (age >= 20 && temperature <= 30 && age <= 45 && temperature >= -25)
            System.out.println("Можно идти гулять");
        if (age <= 20 && temperature <= 28 && temperature >= 0)
            System.out.println("Можно идти гулять");
        if (age >= 45 && temperature <= 25 && temperature >= -10)
            System.out.println("Можно идти гулять");


    }
}
