package packageForPractice;

import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String [] Args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("İndeksini hesaplayacağınız kişinin kütlesini giriniz : ");
        double k = inp.nextDouble();
        System.out.print("İndeksini hesaplayacağınız kişinin boyunu giriniz (metre cinsinden): ");
        double b = inp.nextDouble();
        double bmi = k / (b*b) ;
        System.out.println("Vücut kitle indeksiniz : " + bmi);
        inp.close();
    }
    
}
