package packageForPractice;

import java.util.Scanner;

public class dikUcgendeHipotenusuBulanProgram {
    public static void main(String[] args) {
        
        System.out.println("Bu program iki dik kenarı kullanıcı tarafından girilen bir dik üçgenin hipotenüsünü hesaplar.");
        Scanner inp = new Scanner(System.in);
        int birinciDikKenar, ikinciDikKenar;
        System.out.println("Birinci dik kenarı giriniz.");
        System.out.print("Birinci dik kenar : ");
        birinciDikKenar = inp.nextInt();
        System.out.println("İkinci dik kenarı giriniz.");
        System.out.print("İkinci dik kenar : ");
        ikinciDikKenar = inp.nextInt();
        inp.close();
        
        double hipotenus = Math.sqrt((birinciDikKenar*birinciDikKenar)+ (ikinciDikKenar*ikinciDikKenar));
        System.out.println("Hipotenüs : " + hipotenus);
        double ucgeninCevresi = (birinciDikKenar + ikinciDikKenar + hipotenus);
        double u = ucgeninCevresi/2;

        double ucgeninAlani = Math.sqrt((u*(u-birinciDikKenar)*(u-ikinciDikKenar)*(u-hipotenus)));
        System.out.println("Üçgenin alanı : " + ucgeninAlani);




        


    }
    
}
