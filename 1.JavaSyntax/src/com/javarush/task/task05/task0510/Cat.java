package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/
public class Cat {
    private String name;
    private int age;
    private String address;
    private String color;
    private int weight;

    public void initialize(String name) {
        this.name = "ssssss";
        this.age = 2;
        this.weight = 3;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        weight = 1;
        this.age = age;
    }

    public void initialize(String name, int age) {


        this.weight = 3;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        address = "sss;";
        this.age = 2;
    }

    public static void main(String[] args) {

    }
}