package com.javarush.task.task02.task0204;

/* 
О семейных отношениях
*/
public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        man.age = 22;
        man.height=12;
        man.wife = woman;

        woman.age =22;
        woman.height=14;
        woman.husband=man;
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
