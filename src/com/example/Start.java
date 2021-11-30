package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.example.PrimeNumber.findPrimeNum;

public class Start {

    public static Integer generatePrimeNumber() {
        List<Integer> integerList = new ArrayList<>(findPrimeNum(10));
        Integer sizeList = integerList.size();
        Integer num = (int) (Math.random() * sizeList);
        return integerList.get(num);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Введите число g: ");
        int g = s.nextInt();
        System.out.println("Введите число p: ");
        int p = s.nextInt();

        Alice alice = new Alice(g,p);
        Bob bob = new Bob(g, p);

        System.out.println("У Алисы и Боба числа g и p");

        int a = generatePrimeNumber();
        alice.setA(a);
        System.out.println("Алиса загадала простое число a = " + a);

        int b = generatePrimeNumber();
        bob.setB(b);
        System.out.println("Боб загадала простое число b = " + b);

        System.out.println("Алиса вычислила остаток от деления _a=" + alice.calculateRemainderOfTheDivision() + " и передала это число Бобу");
        bob._a = alice.sendToBob();

        System.out.println("Боб вычислил остаток от деления _b=" + bob.calculateRemainderOfTheDivision() + " и передала это число Алисе");
        alice._b = bob.sendToAlice();

        System.out.println("Алиса вычислила секретный ключ: " + alice.calculateSecretKey());
        System.out.println("Боб вычислила секретный ключ: " + bob.calculateSecretKey());
    }
}
