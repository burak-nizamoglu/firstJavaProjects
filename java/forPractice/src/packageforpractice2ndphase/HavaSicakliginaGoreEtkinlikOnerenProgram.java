package packageforpractice2ndphase;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerenProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Weather Degree: ");
        double temperature = inp.nextDouble();
        if(temperature<5) {
            System.out.println("Skiing is a good option at this temperature.");
        }
        else if (temperature<=25 && temperature>=5) {
            if(temperature>=5 && temperature<=15) {
                if (temperature<=10) {
                    System.out.println("Cinema is a good option at this temperature. ");
                }
                else {
                    System.out.println("Cinema and picnic are good option at this temperature.");
                }
            }
            else {
                System.out.println("Picnic is a good option at this temperature.");
            }
        }
        else if(temperature>25) {
            System.out.println("Swimming is a good option at this temperature.");
        }
        inp.close();
    }
}


/*
Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */

