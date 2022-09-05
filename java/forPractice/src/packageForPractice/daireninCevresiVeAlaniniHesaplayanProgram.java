package packageForPractice;

import java.util.Scanner;

public class daireninCevresiVeAlaniniHesaplayanProgram {
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz :");
        int r = inp.nextInt();
        inp.close();
        double pi=3.14,daireninAlani = r*r*pi ,daireninCevresi = 2*pi*r;
        System.out.println("Dairenin Alanı: " + daireninAlani);
        System.out.println("Dairenin Çevresi: " + daireninCevresi);

    }
}
