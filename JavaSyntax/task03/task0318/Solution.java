package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sYears = BufferedReader.readLine();
        int nYears = Integer.parseInt(sYears);
        String name = BufferedReader.readLine();


        System.out.print(nYears + "захватит мир через" + name + "лет. Му-ха-ха!");//напишите тут ваш код
    }
}
