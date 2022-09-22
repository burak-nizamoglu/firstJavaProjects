package packageforpractice;

import java.util.Scanner;

public class taksimetreProgrami {
    public static void main(String [] Args) {
        System.out.println("Taksimetre ücreti başlangıçta 10 TL'dir");
        Scanner inp = new Scanner(System.in);
        double kmBasinaUcret=2.20,kmSayisi,toplamUcret,taksimetreAcilisFiyati =10 ;
        System.out.print("Taksi ile gidilen mesafe (km cinsinden) : ");
        kmSayisi = inp.nextDouble();
        inp.close();
        toplamUcret = kmBasinaUcret*kmSayisi+taksimetreAcilisFiyati;
        System.out.print(toplamUcret <20 ? 20 : kmBasinaUcret*kmSayisi+taksimetreAcilisFiyati);
        
    }   
}