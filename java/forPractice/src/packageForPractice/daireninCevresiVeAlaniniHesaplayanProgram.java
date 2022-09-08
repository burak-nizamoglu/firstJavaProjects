package packageforpractice;

import java.util.Scanner;

public class daireninCevresiVeAlaniniHesaplayanProgram {
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz :");
        int r = inp.nextInt();
        double pi=3.14,daireninAlani = r*r*pi ,daireninCevresi = 2*pi*r;
        System.out.println("Dairenin Alanı: " + daireninAlani);
        System.out.println("Dairenin Çevresi: " + daireninCevresi);
        System.out.println("Belirli bir kesitin alanını bulmak için bir açı değeri giriniz (BU DEĞER ALFA OLSUN) :");
        double alfa = inp.nextDouble();
        double kesitAlani = daireninAlani*alfa/360;
        System.out.println("Kesit alanı : " + kesitAlani);
        inp.close();

    }
}
