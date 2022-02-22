package com.company;

public class CycleFor {
    public static void main(String[] args) {
        //Поднимаемся по ступенькам с 1-й по 9-ю

        for (int i = 1; i <= 9; i++)
            System.out.print(i);

        for (int i = 1; i <= 9; i++) {
            System.out.println(i);
            i++;


        }
    }

}