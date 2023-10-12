package com.siva.practice;

public class lambdaExpression {
    public static void main(String[] args) {
        System.out.println("In main class.......");

//        lcclass lc =new lcclass(){
//            public void show(){
//                System.out.println("Just Inner class Expression inner class......");
//            }
//        };
//no para and no return type paramaeter...
//       lcclass lci=()->System.out.println("Lambada Expression....");
//      lci.show();

        lcclass lc=(a,b)->a+b;
        int result=lc.show(10,20);
        System.out.println("With return type and parameter lambada expression ::"+result);
    }
}
