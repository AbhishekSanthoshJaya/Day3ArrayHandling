package com.lambton;

import java.util.Arrays;

public class ArrayHandlingExamples
{
    public static void main(String[] args) {
        int a[];
        int []b;
        int c[] = new int[5];

        c[0] = 10;
        c[1] = 20;
        c[2] = 30;
        c[3] = 40;
        c[4] = 50;

        //c[5] = 60;

        int d[] = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println("Length of Array : " + d.length);

        System.out.println("Using for(;;)");
        for(int i= 0; i < d.length; i++)
        {
            System.out.println(d[i]);
        }

        int[] x1,y1; //Both are array
        int x2, y2[]; // 1 - int, 2 - array
        int x3[], y3; //1 - array, 2 - int
        int[] x4, y4[];// x4 - 1D array, y4 - 2D array

        y4 = new int[3][3];

        System.out.println("Using Compact for(:)");
        for (int p:d)
        {
            System.out.println(p);
        }
        findArray();
        displayReverseArray();
        stringArrayHandling();
    }
    /*
        Create and array of n integer element
        and find the sum, average, min and max
     */
    public static void findArray()
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int max, min, sum;
        float avg;

        sum = 0;
        max = 0;
        min = a[0];

        for(int x: a)
        {
            sum+=x;

            if(min > x){
                min = x;
            }

            if(max < x){
                max = x;
            }
        }

        avg = (float) sum / a.length;

        System.out.println("MIN : " + min
                + "\nMAX : " + max
                +" \nAVG : " + avg
                + "\nSUM : " + sum
        );

    }

    /*
        Display given integer in reverse order
        I/P: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        O/P: {10, 9, 8, 6, 6, 5, 4, 3, 2, 1}
     */
    public static void displayReverseArray() {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = a.length - 1; i >= 0; i--)
        {
            System.out.print(a[i] + " ");
        }
    }

    /*
        Write a Java program to display array of strings containing 10 elements
     */

    public static void stringArrayHandling()
    {
        String str[];
        str = new String[10];

        str[0] = "Canada";
        str[1] = new String("India");
        str[2] = "Nepal";
        str[3]= "Toronto";
        str[4]= "New York";
        str[5]= "PATEL";
        str[6]= "Ramandeep Singh";
        str[7]= "Inshant";
        str[8]= "Scarborough";
        str[9]= "North York";

        for(int i = 0; i < str.length; i++)
        {
            System.out.println(str[i]);
        }
    }
}
