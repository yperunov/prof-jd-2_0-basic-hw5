package com.company;

import java.io.PipedOutputStream;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //task1
        int[] m1 = new int[3];
        m1[0] = 1;
        m1[1] = 2;
        m1[2] = 3;

        float[] m2 = {1.57f, 7.654f, 9.986f};

        char[] m3 = {'Y', 'u', 'r', 'i', 'y'};

        //task2
        System.out.println(m1[0]+","+m1[1]+","+m1[2]);
        System.out.println(m2[0]+","+m2[1]+","+m2[2]);
        System.out.println(m3[0]+","+m3[1]+","+m3[2]+","+m3[3]+","+m3[4]);

        //task3
        System.out.println(m1[2]+","+m1[1]+","+m1[0]);
        System.out.println(m2[2]+","+m2[1]+","+m2[0]);
        System.out.println(m3[4]+","+m3[3]+","+m3[2]+","+m3[1]+","+m3[0]);

        //task4
        for (int i = 0; i < m1.length; i++){
            if (m1[i] % 2 == 0) {
                System.out.println(m1[i]);
            }
            else {
                System.out.println(m1[i]+1);
            }
        }
    }
}
