package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        reader.close();
        ArrayList<String> list = new ArrayList<>();
        FileInputStream fis = new FileInputStream(s1);
        byte[] b = new byte[fis.available()];

        while (fis.available() > 0)
        {
            fis.read(b);
        }

        String temp = new String(b);
        for (String z : temp.split(" "))
        {
            float x = Float.parseFloat(z);
            list.add(Math.round(x) + " ");
        }

        FileOutputStream fos = new FileOutputStream(s2);
        for (String h : list)
        {
            fos.write(h.getBytes());
        }
        fis.close();
        fos.close();

    }
}
