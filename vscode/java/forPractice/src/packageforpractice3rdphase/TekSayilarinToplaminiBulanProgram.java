package packageforpractice3rdphase;

import java.util.Scanner;

public class TekSayilarinToplaminiBulanProgram {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        int total = 0;
        do{
            System.out.print("Type an integer that is even.");
            number = inp.nextInt();
            if(number%2==0 && number%4==0){
            total += number;
            }
        }
        while(number%2==0);
        System.out.println(total); 
        inp.close();
    }
    
}
