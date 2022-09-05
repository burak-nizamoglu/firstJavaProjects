package packageForPractice;

import java.util.Scanner;

public class kdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Aldığınız ürünün fiyatını giriniz. : ");
        
        double fiyat = inp.nextDouble();
        double kdvtutari,kdvlifiyat,kdvorani;
        System.out.print("KDV oranını giriniz : ");
        kdvorani = inp.nextDouble();

        inp.close();

        kdvtutari = fiyat / kdvorani;
        System.out.println("KDV Tutarı bu kadardır : " + kdvtutari);

        kdvlifiyat = fiyat + kdvtutari;
        System.out.println("KDV'li fiyat bu kadardır : " + kdvlifiyat);
    }   
}
