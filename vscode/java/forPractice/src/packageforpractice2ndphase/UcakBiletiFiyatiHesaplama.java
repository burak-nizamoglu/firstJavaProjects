package packageforpractice2ndphase;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int age,flightType;
        double distance,totalPrice,perKm=0.10;
        System.out.print("Please enter your age :");
        age=inp.nextInt();
        System.out.print("Please enter your flighttype.(Flighttype must be 1 or 2. Roundtrip flight is 1.) :");
        flightType=inp.nextInt();
        System.out.print("Please enter your travel's distance :");
        distance=inp.nextDouble();
        if(flightType==1) 
        {
            distance *= 2;     
        }
        System.out.println("Your flight's total price without discounts :" + (perKm*distance));
        double withoutDiscount = perKm*distance;
        switch (flightType) 
        {
            case 1:
            if (age<12) { 
                totalPrice=(withoutDiscount)-(withoutDiscount*(0.5))-(withoutDiscount*(0.2));
                System.out.println("Total price of flight :" + totalPrice);
            }
            else if(age<=24 && age>=12) {
                totalPrice= (withoutDiscount)-(((withoutDiscount)*(0.1))+(withoutDiscount)*(0.2));
                System.out.println("Total price of flight :" + totalPrice);
            }
            else {
                totalPrice= (withoutDiscount)-(((withoutDiscount)*(0.3))+(withoutDiscount)*(0.2));
                System.out.println("Total price of flight :" + totalPrice);
            }
                break;
        
            case 2:
            if (age<12) {
                totalPrice= (withoutDiscount)*(0.5);
                System.out.println("Total price of flight :" + totalPrice);
            }
            else if(age<=24 && age>=12) {
                totalPrice= (withoutDiscount)*(0.1);
                System.out.println("Total price of flight :" + totalPrice);
            }
            else {
                totalPrice= (withoutDiscount)*(0.3);
                System.out.println("Total price of flight :" + totalPrice);
            }
                break;
            
            default:
            System.out.println("Wrong input. Please correct your flighttype and try again.");
        }
        inp.close();
    }
    
}
/*Java ile mesafeye ve ??artlara g??re u??ak bileti fiyat?? hesaplayan program?? yap??n. Kullan??c??dan Mesafe (KM), ya???? ve yolculuk tipi (Tek Y??n, Gidi??-D??n????) bilgilerini al??n. Mesafe ba????na ??cret 0,10 TL / km olarak al??n. ??lk olarak u??u??un toplam fiyat??n?? hesaplay??n ve sonras??nda ki ko??ullara g??re m????teriye a??a????daki indirimleri uygulay??n ;

Kullan??c??dan al??nan de??erler ge??erli (mesafe ve ya?? de??erleri pozitif say??, yolculuk tipi ise 1 veya 2) olmal??d??r. Aksi takdirde kullan??c??ya "Hatal?? Veri Girdiniz !" ??eklinde bir uyar?? verilmelidir.
Ki??i 12 ya????ndan k??????kse bilet fiyat?? ??zerinden %50 indirim uygulan??r.
Ki??i 12-24 ya??lar?? aras??nda ise bilet fiyat?? ??zerinden %10 indirim uygulan??r.
Ki??i 65 ya????ndan b??y??k ise bilet fiyat?? ??zerinden %30 indirim uygulan??r.
Ki??i "Yolculuk Tipini" gidi?? d??n???? se??mi?? ise bilet fiyat?? ??zerinden %20 indirim uygulan??r. */