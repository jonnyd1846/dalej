package com.company;

public class Main {

    public static void main(String[] args) {

       /*
        double number;
        int numberI;
        */
        double[] numArray = new double[10];
        int [] num1Array = new int[10];
        for (int i = 0; i < numArray.length; i++){
            numArray[i] = Math.random()*100;
            num1Array[i] = (int)(Math.random()*100);
        }
        for (int i =0; i < numArray.length; i++) {


            System.out.println(numArray[i]);
            System.out.println(num1Array[i]);
        }
    }
}
