package com.javafundamentals;

public class Demo1 {

    static void Method1() {
        System.out.println("Method1 is called");
        Method2();
    }

    static void Method2() {
        System.out.println("Method2 is called");

        Demo1 obj = new Demo1();
        obj.Method3();
    }

    static void Method5() {
        System.out.println("Method5 is called");
    }

    void Method3() {
        System.out.println("Method3 is called");
        Method4();
    }

    void Method4() {
        System.out.println("Method4 is called");
        Method5();
    }

    public static void main(String[] args) {
        Method1();
    }
}