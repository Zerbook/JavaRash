package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = BufferedReader.readLine();
        String sNum1 = BufferedReader.readLine();
        int nNum1 = Integer.parseInt(sNum1);
        String sNum2 = BufferedReader.readLine();
        int nNum2 = Integer.parseInt(sNum2);



        System.out.print(name + " получает " + nNum1 + " через " + nNum2 + " лет.");//напишите тут ваш код
    }
}
