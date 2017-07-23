package com.javarush.task.task05.task0529;


import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner a=new Scanner(System.in);
        int c=0;
        while (true){
            String  f=a.nextLine();
            if (f.equals("сумма")){
                break;
            }
            else c+=Integer.parseInt(f);
        }
        System.out.print(c);
    }
}
