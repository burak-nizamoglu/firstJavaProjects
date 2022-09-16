package packageforpractice2ndphase;

import java.util.Scanner;

public class ArtikYilHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("This program calculates the year that entered is leap year or not.");
        System.out.print("Please enter year :");
        int year=inp.nextInt();
        int kalan=year%4;
        switch (kalan) {
            case 0:
            if (year%100==0) {
                if (year%400==0) {
                    System.out.println(year + " is leap year.");
                }
                else {
                    System.out.println(year + " is not leap year");
                }
            }
            else {
                System.out.println(year + " is leap year.");
            }
                break;

            default:
            System.out.println(year + (" is not leap year."));
                break;
        }
        inp.close();
    }

}
