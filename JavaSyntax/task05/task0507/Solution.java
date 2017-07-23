package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        boolean a = true;
        int b, d;
        d = 0;
        double c,e;
        e = 0;
        while (a){
            b = Integer.parseInt(reader.readLine());
            if (b != -1){
                d ++;
                e = e + b;
            }
            else{

                c = e / d;
                System.out.print(c);
                a = false;
            }
        }
    }
}

