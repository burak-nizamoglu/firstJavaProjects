package packageforpractice3rdphase;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please type an integer :");
        int max = inp.nextInt();
        int total=0;
        int number =0;
        for(int i=0 ; i<=max ; i++ ) {
            if(i%3 == 0 && i%4==0){
                if(i==0){
                    number--;
                }
                number++;
                total += i;         
            }
        }     
        double average = total/number;
        System.out.println(average);
        inp.close();
    }
}
