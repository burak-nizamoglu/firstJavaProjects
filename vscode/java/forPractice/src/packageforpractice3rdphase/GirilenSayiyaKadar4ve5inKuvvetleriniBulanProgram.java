package packageforpractice3rdphase;

import java.util.Scanner;

public class GirilenSayiyaKadar4ve5inKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please type an integer :");
        int max = inp.nextInt();
        for(int i =0 ; i<=max ; i++){
            if(i%4==0 && i%5==0){
                System.out.println(i);
            }  
        }
        inp.close();
    }
}
