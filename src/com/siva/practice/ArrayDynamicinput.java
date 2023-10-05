package com.siva.practice;

import java.util.Scanner;

public class ArrayDynamicinput {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int size=0;
        System.out.println("Enter Array Size");
         size=scn.nextInt();

        int arr[]=new int[size];

        for (int i=0;i<size;i++){

            arr[i]=scn.nextInt();

        }
        for(int print:arr){
            System.out.print(print+" ");
        }
    }
}
