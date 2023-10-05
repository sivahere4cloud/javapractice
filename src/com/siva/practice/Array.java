package com.siva.practice;

import java.util.Scanner;

public class Array {
    public static void maxArray(int arr[]){
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
            else if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("Minimum value:" +min);
        System.out.println("Maximum value:" +max);

    }
    public static void main(String[] args) {
        System.out.println("Array Practice");
        //static declaration of array and using
        int a[] =new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        for(int aa:a){
            System.out.print(aa+" ");
        }
        //declaration and initalization of an array

        String[] str={
          "siva",
          "ganesh",
          "Hari",
          "Susmitha"
        };
        System.out.println();
        for (String aa:str){
            System.out.print(aa+" ");
        }
        //Passing array into method and finding max of a number in a given array
        int arrMax[]={10,20,40,95,12,56};
        maxArray(arrMax);


    }//main
}
