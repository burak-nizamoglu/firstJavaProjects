package packageForPractice;

import java.util.Scanner;

public class kdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Aldığınız ürünün fiyatını giriniz. : ");
        
        double fiyat = inp.nextDouble();
        double kdvtutari,kdvlifiyat;
        
        inp.close();
        double kdvOrani = fiyat >1000 ? 0.08 : 0.18;
        System.out.println("KDV Oranı : " + kdvOrani);
        kdvtutari = fiyat * kdvOrani;
        
        System.out.println("KDV Tutarı bu kadardır : " + kdvtutari);
        
        kdvlifiyat = fiyat + kdvtutari;
        
        System.out.println("KDV'li fiyat bu kadardır : " + kdvlifiyat);
    }   
}
