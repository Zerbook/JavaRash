package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> listElse = new ArrayList<Integer>();
        for(int i=0; i<20; i++){
            Integer t = sc.nextInt();
            list.add(t);
        }
        for(Integer s : list){
            if(s%3==0){
                list3.add(s);
            }
            if(s%2==0){
                list2.add(s);
            }
            if((s%2!=0) & (s%3!=0)){
                listElse.add(s);
            }
        }
        printList(list3);
        printList(list2);
        printList(listElse);
    }
    public static void printList(List list) {
        //for(Integer x : list){
        //    System.out.println(x);
       // }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}