package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int a = 0;
        while (a != -1){
            a = Integer.parseInt(reader.readLine());
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
