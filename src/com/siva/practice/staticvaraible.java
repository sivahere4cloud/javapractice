package com.siva.practice;

public class staticvaraible {


    public static void main(String[] args) {
    student st=new student();
    st.name="siva";
    st.age=25;
    st.enroll=190304105184L;
    st.show();
    System.out.println("==============");
    student.school="vignan";
    st.show();
    }
}
