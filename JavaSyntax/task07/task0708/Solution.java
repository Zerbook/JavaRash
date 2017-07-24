package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
        BufferedReader s1 = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String s = s1.readLine();
            list.add(s);
            if ((s.length()) >= max) {
                max = s.length();
            }
        }

        for (int i = 0; i < 5; i++) {
            String p =  list.get(i);
            if ((p.length()) == max) {
                System.out.println(list.get(i));
            }
        }
    }
}