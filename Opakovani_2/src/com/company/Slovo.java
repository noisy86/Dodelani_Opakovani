package com.company;
import  java.util.Scanner;
public class Slovo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String s = input.nextLine();
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        int length = words.length;
        if (words.length==1){
            System.out.println("Error");
        }
        else {
            System.out.print(words[length - 2]);
        }
    }
}
