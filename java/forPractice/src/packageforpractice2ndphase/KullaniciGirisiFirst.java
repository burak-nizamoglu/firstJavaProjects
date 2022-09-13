package packageforpractice2ndphase;

import java.util.Scanner;

public class KullaniciGirisiFirst {
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        String nickname,password;
        System.out.print("Please enter your nickname :");
        nickname = inp.nextLine();
        System.out.print("Please enter your password :");
        password = inp.nextLine();
        if (nickname.equals("kylix") && password.equals("thecoder")) {
            System.out.println("Login success.");
        }   else if (!password.equals("password")) {
            System.out.print("Password is wrong.");
            System.out.println("Do you want to reset password ?");   
            String answer;
            answer = inp.nextLine();
            if (answer.equals("yes")) {
                    String newpassword;
                    System.out.println("Please type your new password: ");
                    newpassword = inp.nextLine();
                    if (newpassword.equals(password)) {
                        System.out.println("Your old password can't be same with old password. Your new password couldn't create.");
                    }   else {
                             System.out.println("New password created successfully. You can try log in system again.");
                             System.out.println("Please enter your nickname: ");
                             nickname = inp.nextLine();
                             System.out.println("Please enter your password: ");
                             newpassword = inp.nextLine();
                                if (nickname.equals("nickname") && newpassword.equals("password")) {
                                System.out.println("Login success.");
                                }
                        }
                    }       
                }
            }     
    }   
