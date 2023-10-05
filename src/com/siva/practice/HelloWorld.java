package com.siva.practice;

public class HelloWorld {
    public static void show(){
        System.out.println("Static Method..");
    }
    public void nonStaticMethod()
    {
        System.out.println("Non Static Method....");
    }
   HelloWorld(){
        System.out.println("Default Constructor");
    }
    HelloWorld(int a,int b){
        System.out.println("Default Constructor"+(a+b));

    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("Output :: "+c);
        System.out.println("Hello World..");
        HelloWorld.show();
        HelloWorld hw=new HelloWorld(a,b);
        hw.nonStaticMethod();

    }
}
//25 onwards pending