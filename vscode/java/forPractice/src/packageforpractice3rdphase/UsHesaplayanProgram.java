package packageforpractice3rdphase;

import java.util.Scanner;

public class UsHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numdown,numup;
        System.out.print("Please type number that numdown");
        numdown=inp.nextInt();
        System.out.print("Please type number that numup");
        numup=inp.nextInt();
        int answer=0;
        for(int i=0 ; i<=numup ; i++ ){
            answer = numdown * numdown;

        }
        int total;
        total = answer * numdown;
        System.out.println(total);
        inp.close();
    }
}
