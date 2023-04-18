package com.example.project1;

public class Hello {
    public void print() {
        System.out.println("Hello");
    }

    public void printBye() {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        Hello printHello = new Hello();
        printHello.print();
        printHello.printBye();
        System.out.println(1 + 1);
    }
}
