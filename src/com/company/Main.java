package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] myClass = {"Azamat", "Kanat"};
        System.out.println(Arrays.deepToString(myClass));
        String[][] myGroop = {{"Turat", "Oma", "Kairat"},{"Bermet", "Ayana", "Jarkynay"}};
        System.out.println(Arrays.deepToString(myGroop));
        for (int i = 1; i <= 10; i++) {
            System.out.println(5 * i);
        }

    }


}
