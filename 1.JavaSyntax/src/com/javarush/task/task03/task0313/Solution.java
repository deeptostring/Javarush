package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String string1 = "Мыла";
        String string2 = "Раму";
        String string3 = "Мама";
        System.out.println(string1+string2+string3);
        System.out.println(string1+string3+string2);
        System.out.println(string2+string1+string3);
        System.out.println(string2+string3+string1);
        System.out.println(string3+string2+string1);
        System.out.println(string3+string1+string2);
    }
}
