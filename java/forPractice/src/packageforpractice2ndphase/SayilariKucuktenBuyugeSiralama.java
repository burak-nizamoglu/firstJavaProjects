package packageforpractice2ndphase;

import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c;
        System.out.print("First number: ");
        a = inp.nextInt();
        System.out.print("Second number: ");
        b = inp.nextInt();
        System.out.print("Third number: ");
        c = inp.nextInt();
        if(a<b && a<c ) {
            if(b<c) {
                System.out.println("a<b<c");
            }
            else {
                System.out.println("a<c<b");
            }
        }
        else if(b<a && b<c) {
            if(a>c){
                System.out.println("b<c<a");
            }
            else{
                System.out.println("b<a<c");
            }
        }
        else {
            if(b>a) {
                System.out.println("c<a<b");
            }
            else {
                System.out.println("c<b<a");
            }

            }
            inp.close();
        }

        
    }
    

