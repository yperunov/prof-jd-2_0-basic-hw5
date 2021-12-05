package com.company;

import java.io.PipedOutputStream;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
	// write your code here
        // ARRAYS part1
        // task1
        int[] m1 = new int[3];
        m1[0] = 1;
        m1[1] = 2;
        m1[2] = 3;

        float[] m2 = {1.57f, 7.654f, 9.986f};

        char[] m3 = {'Y', 'u', 'r', 'i', 'y'};

        // System.out.println(Arrays.toString(m1));

        //task2 (решение AdHoc)
        System.out.println(m1[0]+", "+m1[1]+", "+m1[2]);
        System.out.println(m2[0]+", "+m2[1]+", "+m2[2]);
        System.out.println(m3[0]+", "+m3[1]+", "+m3[2]+", "+m3[3]+", "+m3[4]);

        //task2 (решение с циклами)
        for (int i = 0; i < m1.length; i++) {
            if (i != m1.length-1) {
                System.out.print(m1[i] + ", ");
            } else {
                System.out.println(m1[i]);
            }
        }

        for (int i = 0; i < m2.length; i++) {
            if (i != m2.length-1) {
                System.out.print(m2[i] + ", ");
            } else {
                System.out.println(m2[i]);
            }
        }

        for (int i = 0; i < m3.length; i++) {
            if (i != m3.length-1) {
                System.out.print(m3[i] + ", ");
            } else {
                System.out.println(m3[i]);
            }
        }

        //task3 (решение AdHoc)
        System.out.println(m1[2]+", "+m1[1]+", "+m1[0]);
        System.out.println(m2[2]+", "+m2[1]+", "+m2[0]);
        System.out.println(m3[4]+", "+m3[3]+", "+m3[2]+", "+m3[1]+", "+m3[0]);

        //task3 (решение с циклами)
        for (int i = m1.length-1; i >= 0 ; i--) {
            if (i != 0) {
                System.out.print(m1[i] + ", ");
            } else {
                System.out.println(m1[i]);
            }
        }

        for (int i = m2.length-1; i >= 0 ; i--) {
            if (i != 0) {
                System.out.print(m2[i] + ", ");
            } else {
                System.out.println(m2[i]);
            }
        }

        for (int i = m3.length-1; i >= 0 ; i--) {
            if (i != 0) {
                System.out.print(m3[i] + ", ");
            } else {
                System.out.println(m3[i]);
            }
        }

        //task4
        for (int i = 0; i < m1.length; i++){
            if (m1[i] % 2 != 0) {
                m1[i] = m1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(m1));

        // ARRAYS part2
        //task1
        int[] m4 = generateRandomArray();
        int totalMoneyOut = 0;

        for (int i: m4) {
            totalMoneyOut = totalMoneyOut+i;
        }

        System.out.println("Сумма трат за месяц составила " + totalMoneyOut+" рублей.");

        //task2
        int[] m5 = generateRandomArray();
        int minDayCosts = m5[0];
        int maxDayCosts = m5[0];

        for (int i : m5) {
            if (i<minDayCosts){
                minDayCosts = i;
            }
            if (i>maxDayCosts){
                maxDayCosts = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDayCosts +" рублей. Максимальная сумма трат за день составила " + maxDayCosts + " рублей.");

        //task3
        int[] m6 = generateRandomArray();
        int totalMoneySpent = 0;
        int totalDays = m6.length;
        for (int i : m6) {
            totalMoneySpent = totalMoneyOut + i;
        }
        float averageMoneySpent = totalMoneySpent / (float) totalDays;
        System.out.println("Средняя сумма трат за месяц составила " + averageMoneySpent + " рублей.");

        //task4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();



        // Saturday Practice with Madjar

        // DOPTASK-1

        int twoD[][] = new int[3][3];
        for (int i=0; i< twoD.length; i++){
            for (int j=0; j < twoD[i].length; j++){
             twoD[i][j]=1;
             System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        // DOPTASK-2

        int twoC[][] = new int[3][3];
        int value = 1;
        for (int i=0; i< twoC.length; i++){
            for (int j=0; j < twoC[i].length; j++){
                twoC[i][j]= value;
                value++;
                System.out.print(twoC[i][j] + " ");
            }
            System.out.println();
        }

        // DOPTASK-3
        fillArray(4,4);

    }
    private static void fillArray(int m, int n) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //intro to ARRAYS part 2

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
