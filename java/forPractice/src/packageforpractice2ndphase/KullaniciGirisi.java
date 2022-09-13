package packageforpractice2ndphase;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        String nickname,password;
        System.out.print("Please enter your nickname :");
        nickname = inp.nextLine();
        System.out.print("Please enter your password :");
        password = inp.nextLine();
        inp.close();
        if (nickname.equals("kylix") && password.equals("thecoder")) {
            System.out.println("Login success.");
        }   else  {
                System.out.println("Password or nickname is wrong. Please try again.");
            }     
    }   
}
