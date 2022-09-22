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
/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır. */