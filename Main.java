package com.company;

public class Main {

    public static void main(String[] args) {

        try{

            int[] number = {1,2,3};

            int tmp = number[10];

            System.out.println(tmp);

        }catch(Exception e){

            System.out.println("Some error");

        }

    }

}
