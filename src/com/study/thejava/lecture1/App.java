package com.study.thejava.lecture1;

public class App {

    static String myName;

    static {
        myName = "sejong";
    }

    private String foo = "bar";

    public static void main(String[] args) {
        App app = new App();
        System.out.println(App.class.getSuperclass());
    }
}
