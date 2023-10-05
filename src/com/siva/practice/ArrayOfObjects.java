package com.siva.practice;

import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        studentarob st1=new studentarob();
        st1.rollno=185;
        st1.name="siva";
        st1.age=10;

        studentarob st2=new studentarob();
        st2.rollno=184;
        st2.name="ganesh";
        st2.age=20;

        studentarob st3=new studentarob();
        st3.rollno=189;
        st3.name="sai";
        st3.age=22;

        System.out.println(st1.name+" "+st1.age);


        studentarob[] str=new studentarob[3];
        str[0]=st1;
        str[1]=st2;
        str[2]=st3;
        System.out.println("Result of Object Array::");
        for(studentarob stp:str){
            System.out.println(stp.age+" "+stp.name+" "+stp.rollno);
        }



    }
}
