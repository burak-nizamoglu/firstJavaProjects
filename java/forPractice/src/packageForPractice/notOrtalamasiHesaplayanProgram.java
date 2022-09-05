package packageForPractice;

import java.util.Scanner;

public class notOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        
    int matematik,fizik,kimya,tarih,muzik,turkce,toplam;
    Scanner inp = new Scanner(System.in);
    
    System.out.print("Matematik notunuz :");
    matematik = inp.nextInt();

    System.out.print("Türkçe notunuz :");
    turkce = inp.nextInt();

    System.out.print("Fizik notunuz :");
    fizik = inp.nextInt();

    System.out.print("Tarih notunuz :");
    tarih = inp.nextInt();

    System.out.print("Müzik notunuz :");
    muzik = inp.nextInt();

    System.out.print("Kimya notunuz :");
    kimya = inp.nextInt();
    inp.close();
    
    toplam = matematik + kimya + fizik + turkce + tarih + muzik;    
    double notortalamasi = toplam / 6;
    System.out.println("\nNot ortalamanız : " + notortalamasi);
   
    System.out.println(notortalamasi >= 50 ? "\nDersi geçtiniz."  : "\nDersi geçemediniz.");

    }    
}
