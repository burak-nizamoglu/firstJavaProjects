package packageforpractice2ndphase;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int day,month;
        System.out.print("Please enter the birth month number :");
        month = inp.nextInt();
        System.out.print("Please enter the birth day number :");
        day = inp.nextInt();
        if(month>12 || month<=0 || day<=0 || day>31) {
            System.out.println("At least a number is not correct. Please try again.");
        }
        else{
            if (month == 1) {
                if(day<=21 && day>=1){
                    System.out.println("Horoscope is: Capricorn");
                }
                else if(day>21 && day<=30){
                    System.out.println("Horoscope is: Aquarius");
                }    
            }   
            else if (month == 2) {
                if(day<=19 && day>=1){
                    System.out.println("Horoscope is: Aquarius");
                }
                else if(day>19 && day<=29){
                    System.out.println("Horoscope is: Pisces");
                }    
            } 
            else if (month == 3) {
                if(day<=20 && day>=1){
                    System.out.println("Horoscope is: Pisces");
                }
                else if(day>20 && day<=31){
                    System.out.println("Horoscope is: Aries");
                }    
            } 
            else if (month == 4) {
                if(day<=20 && day>=1){
                    System.out.println("Horoscope is: Aries");
                }
                else if(day>21 && day<=30){
                    System.out.println("Horoscope is: Taurus");
                }    
            } 
            else if (month == 5) {
                if(day<=21 && day>=1){
                    System.out.println("Horoscope is: Taurus");
                }
                else if(day>21 && day<=31){
                    System.out.println("Horoscope is: Gemini");
                }    
            } 
            else if (month == 6) {
                if(day<=21 && day>=1){
                    System.out.println("Horoscope is: Gemini");
                }
                else if(day>21 && day<=30){
                    System.out.println("Horoscope is: Cancer");
                }    
            } 
            else if (month == 7) {
                if(day<=22 && day>=1){
                    System.out.println("Horoscope is: Cancer");
                }
                else if(day>22 && day<=31){
                    System.out.println("Horoscope is: Leo");
                }    
            } 
            else if (month == 8) {
                if(day<=22 && day>=1){
                    System.out.println("Horoscope is: Leo");
                }
                else if(day>22 && day<=31){
                    System.out.println("Horoscope is: Virgo");
                }    
            } 
            else if (month == 9) {
                if(day<=22 && day>=1){
                    System.out.println("Horoscope is: Virgo");
                }
                else if(day>22 && day<=30){
                    System.out.println("Horoscope is: Libra");
                }    
            } 
            else if (month == 10) {
                if(day<=23 && day>=1){
                    System.out.println("Horoscope is: Libra");
                }
                else if(day>23 && day<=31){
                    System.out.println("Horoscope is: Scorpio");
                }    
            } 
            else if (month == 11) {
                if(day<=21 && day>=1){
                    System.out.println("Horoscope is: Scorpio");
                }
                else if(day>21 && day<=30){
                    System.out.println("Horoscope is: Sagittarius");
                }    
            } 
            else if (month == 12) {
                if(day<=21 && day>=1){
                    System.out.println("Horoscope is: Sagittarius");
                }
                else if(day>21 && day<=30){
                    System.out.println("Horoscope is: Capricorn");
                }    
            } 
        }   
        inp.close();
    }
    
}
