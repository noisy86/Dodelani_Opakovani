package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class cisla {
    public static void main(String[] args) {
        int[] myNum = {12, 2, 33, 24, 10};
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        for (int i = 0; i < myNum.length; i++) {
            myNumbers.add(myNum[i]);
        }
        boolean t = true;
        while (t == true) {
            Scanner cislo = new Scanner(System.in);
            System.out.println("Enter number:");
            int MyCislo = cislo.nextInt();
            int pos = myNumbers.indexOf(MyCislo);
            if (myNumbers.contains(MyCislo)) {
                System.out.println(pos);
            } else {
                System.out.println("-1");
            }
        }
    }
}
