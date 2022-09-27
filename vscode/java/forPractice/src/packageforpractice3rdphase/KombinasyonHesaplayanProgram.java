package packageforpractice3rdphase;

import java.util.Scanner;

public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1,n2,combination,total1=1,total2=1,total3=1;
        System.out.print("Type 1st integer to calculate combination :");
        n1 = inp.nextInt();
        System.out.print("Type 2st integer to calculate combination :");
        n2 =inp.nextInt();
        for(int i=1 ; i<=n1 ; i++){
            total1 = total1*i;
        }
        for(int j=1 ; j<=n2 ; j++){
            total2 = total2*j;
        }
        for(int k=1 ; k<=(n1-n2) ; k++){
            total3 = total3*k;
        }
        combination= total1/(total2 * total3);
        System.out.println(combination);
        inp.close();
    }
    
}




/*C(n,r) = n! / (r! * (n-r)!) */