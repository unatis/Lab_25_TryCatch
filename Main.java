package com.company;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {

        try{

            int[] number = {1,2,3};

            int tmp = number[10];

            //throw new ArrayIndexOutOfBoundsException();

            System.out.println(tmp);

        }catch(Exception e){

            if(e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Array index problem");
            }else{
                System.out.println(e.getMessage());
            }

        }

    }

}
