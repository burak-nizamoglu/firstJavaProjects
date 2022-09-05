package packageForPractice;

import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Alınan ürünün ismini giriniz : ");
        String A = inp.next();
        System.out.print(A + " miktarını giriniz : ");
        double miktarA = inp.nextDouble();
        System.out.print(A +" kilogram fiyatını giriniz : " );
        double fiyatA = inp.nextDouble();
        double maliyetA = miktarA*fiyatA;
        System.out.println(A + " toplam maliyeti : " + maliyetA);
        
        System.out.print("Alınan ürünün ismini giriniz : ");
        String B = inp.next();
        System.out.print(B + " miktarını giriniz : ");
        double miktarB = inp.nextDouble();
        System.out.print(B +" kilogram fiyatını giriniz : " );
        double fiyatB = inp.nextDouble();
        double maliyetB = miktarB*fiyatB;
        System.out.println(B + " toplam maliyeti : " + maliyetB);
        
        System.out.print("Alınan ürünün ismini giriniz : ");
        String C = inp.next();
        System.out.print(C + " miktarını giriniz : ");
        double miktarC = inp.nextDouble();
        System.out.print(C +" kilogram fiyatını giriniz : " );
        double fiyatC = inp.nextDouble();
        double maliyetC = miktarC*fiyatC;
        System.out.println(C + " toplam maliyeti : " + maliyetC);
        
        System.out.print("Alınan ürünün ismini giriniz : ");
        String D = inp.next();
        System.out.print(D + " miktarını giriniz : ");
        double miktarD = inp.nextDouble();
        System.out.print(D +" kilogram fiyatını giriniz : " );
        double fiyatD = inp.nextDouble();
        double maliyetD = miktarD*fiyatD;
        System.out.println(D + " toplam maliyeti : " + maliyetD);
        inp.close();
        
        System.out.println("Manava ödenecek toplam ücret : " + (maliyetA + maliyetB + maliyetC + maliyetD));
        
    }
    
}
