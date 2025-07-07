package com.modulefour;

public class Main {
    public static void main(String[] args) {
        System.out.println("From anonymous module:");
        System.out.println(Main.class.getModule());
    }
}
