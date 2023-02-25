package com.employeewage;

public class Uc1 {
    public static void main(String[] args) {


        int emp = 1;

        int empCheck = (int) ( (Math.random() * 10 )% 2);

        if (empCheck == emp) {

            System.out.println("Employee is present");

        } else {

            System.out.println("Employee is absent");

        }

    }
}
