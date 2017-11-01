package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Woman woman1 = new Woman("woman1", 28, "Street, 1");
        Woman woman2 = new Woman("woman2", 29, "Street, 2");
        Man man1 = new Man("man1", 30, "Street, 2");
        Man man2 = new Man("man2", 30, "Street, 3");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;


        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return name + " " + age +  " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return name + " " + age +  " " + address;
        }
    }


}

