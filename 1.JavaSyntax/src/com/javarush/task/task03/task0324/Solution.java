package com.javarush.task.task03.task0324;

/* 
Меркантильные намерения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        PrintTen("Я хочу большую зарплату, и для этого изучаю Java");
    }
    public static void PrintTen(String s){
        for(int i =0; i<10; i++){
            System.out.println(s);
        }
    }
}
