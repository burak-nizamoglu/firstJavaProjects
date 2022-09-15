package packageforpractice2ndphase;

import java.util.Scanner;

public class HackerRankIfElse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        System.out.println("Please type an integer :");
        a = inp.nextInt();
        if(a%2==0 && a>=1 && a<=100){
            if(a<=5 && a>=2){
                System.out.println("Not Weird");
            }
            else if(a>=6 && a<=20){
                System.out.println("Weird");}
            else {
                System.out.println("Not Weird");
            } 
        }
        else if (a%2==1 && a>=1 && a<=100){
            System.out.println("Weird");
        }
        inp.close();
    }
    }


/*
Task 
Given an integer, , perform the following conditional actions:
If a is odd, print Weird
If a is even and in the inclusive range of  to2 ,5 print Not Weird
If a is even and in the inclusive range of  to 6,20 print Weird
If a is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
Input Format
A single line containing a positive integer, .
Constraints

Output Format
Print Weird if the number is weird; otherwise, print Not Weird. */
    