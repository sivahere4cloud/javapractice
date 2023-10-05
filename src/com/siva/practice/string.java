package com.siva.practice;

public class string {

    public static void main(String[] args) {
        System.out.println("Hello World");
        String str=new String();
        System.out.println(str.hashCode());
        String name="Siva Ganesh";
        System.out.println(name+str.concat(" here"));

        String s1="Siva Ganesh";
        System.out.println(s1.hashCode());
        System.out.println(s1.concat(" here").hashCode());
        String s2=" Ganesh";
        System.out.println(s2.hashCode());

        System.out.println("String Buffer");
        //StringBuffer
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Siva Ganesh");
        System.out.println(sb.hashCode());
        System.out.println(sb.append(" here"));
        System.out.println(sb.hashCode());
        sb.append("Siva Ganesh");
        System.out.println(sb.hashCode());




    }
}

