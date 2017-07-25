package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        int maxIndex = 0;
        int minIndex = 0;
        int max = 0;
        int min = list.get(0).length();
        // нахождение максимального и минимального значения длины строки
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }

            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }
        // сравнивание мин и макс значения и присвоение им индекса
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() == max){
                maxIndex = i;
            }
            if (min == list.get(i).length()){
                minIndex = i;
            }
        }

        //if (maxIndex < minIndex ) System.out.println("самая длинная");
       // if (maxIndex > minIndex ) System.out.println("самая короткая");

        if (maxIndex < minIndex ) System.out.println(list.get(maxIndex));
        if (maxIndex > minIndex ) System.out.println(list.get(minIndex));



    }
}
