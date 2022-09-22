package packageforpractice2ndphase;

import java.util.Scanner;

public class SinifGecmeDurumuHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int math,physics,turkish,chemistry,music,count=0,total=0;
        double average;
        System.out.println("This program calculates average of points.");
        System.out.print("Math point: ");
        math = inp.nextInt();
        if(math<=100 && math>=0) {
            count++;
            total += math;
        }
        else {
            System.out.println("To calculate average point with physics point, point must be between 0 and 100.");
        }
        System.out.print("Physics point: ");
        physics = inp.nextInt();
        if(physics<=100 && physics>=0) {
            count++;
            total += physics;
        }
        else {
            System.out.println("To calculate average point with physics point, point must be between 0 and 100.");
        }
        System.out.print("Chemistry point: ");
        chemistry = inp.nextInt();
        if(chemistry<=100 && chemistry>=0) {
            count++;
            total += chemistry;
        }
        else {
            System.out.println("To calculate average point with chemistry point, point must be between 0 and 100.");
        }
        System.out.print("Turkish point: ");
        turkish = inp.nextInt();
        if(turkish<=100 && turkish>=0) {
            count++;
            total += turkish;
        }
        else {
            System.out.println("To calculate average point with turkish point, point must be between 0 and 100.");
        }
        System.out.print("Music point: ");
        music = inp.nextInt();
        if(music<=100 && music>=0) {
            count++;
            total += music;
        }
        else {
            System.out.println("To calculate average point with music point, point must be between 0 and 100.");
        }
        average = total / count;
        if(average>= 55) {
            System.out.println("Semester succesfuly passed.");
        }
        else {
            System.out.println("Semester failed.");
        }
        System.out.println("Average point: " + average);
        inp.close();

    }
    
}
