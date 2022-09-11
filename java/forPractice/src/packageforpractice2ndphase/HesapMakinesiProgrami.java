package packageforpractice2ndphase;

import java.util.Scanner;

public class HesapMakinesiProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1,n2,selection;
        
        System.out.print("Please enter the first integer number : ");
        n1 = inp.nextInt();
        System.out.print("Please enter the second integer number : ");
        n2 = inp.nextInt();
        System.out.println("1-Addition\n2-Substraction\n3-Multipication\n4-Division");
        selection = inp.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Result is: " + (n1+n2));
                    break;
                case 2:
                    System.out.println("Result is: " + (n1-n2));
                    break;
                case 3:
                    System.out.println("Result is: " + (n1*n2));
                    break;
                case 4:
                        switch (n2) {
                            case 0:
                                System.out.println("A number can't divide by zero.Try again with different numbers.");
                                break;
                            default: 
                                System.out.println("Result is: " + n1/n2);                            
                        }
                    break;
            }
    }   
}
