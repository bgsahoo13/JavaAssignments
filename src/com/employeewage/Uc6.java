package com.employeewage;

////Calculate Wages till a condition of total working hours or days is reached for a month
//- Assume 100 hours and 20 days


public class Uc6 {
    public static void main(String[] args) {

//		byte days = 20;
//		byte totalHours = 100;
        byte day = 0;

        for(int i=1; i<=100; i++) {

            i=i+1;
            if (i%8==0) {

                day=(byte) (day+1);

            }

        }
        System.out.println(day<20 ? "Number of hours reached first" : "Number of days reached first");


    }

}
