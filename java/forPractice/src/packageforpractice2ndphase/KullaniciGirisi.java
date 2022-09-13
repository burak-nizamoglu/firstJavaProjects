package packageforpractice2ndphase;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String nickname,password;
        System.out.print("Please type your nickname: ");
        nickname = inp.nextLine();
        System.out.print("Please type your password :");
        password = inp.nextLine();
        if (nickname.equals("kylix") && password.equals("12345")) {
            System.out.println("Nickname and password are correct. Successfully logged in the system."); }
            else if (!nickname.equals("kylix") && password.equals("12345")){
                System.out.println("Password is correct but nickname is wrong. Please check it and try again later.");
            }
            else { System.out.println("Password and nickname are both wrong. Try again.");}
                    if (nickname.equals("kylix") && !password.equals("12345")) {
                        System.out.println("Nickname is correct but password is wrong.Please check it and try again later. Do you want to reset your password ?");
                        String answer = inp.nextLine();
                        if(answer.equals("yes")) {
                            System.out.print("Please type your new password :");
                            String newPassword = inp.nextLine();  
                            if(newPassword.equals(password) || newPassword.equals("12345")){
                                System.out.println("New password can't be same with old password and the password that you tried last. New password couldn't be created. Please type another password.");
                                newPassword = inp.nextLine();
                                System.out.println("New password successfully created, please try logging in again.");
                                System.out.println("Please type your nickname :");
                                nickname = inp.nextLine();
                                System.out.println("Please type your password :");
                                password = inp.nextLine();
                                if (nickname.equals("kylix") && password.equals(newPassword)){
                                    System.out.println("Log in successful.");
                            }
                            else {
                                System.out.println("Please try logging in again.");
                                System.out.print("Please type your nickname :");
                                nickname = inp.nextLine();
                                System.out.print("Please type your password :");
                                password = inp.nextLine();
                                if (nickname.equals("kylix") && password.equals(newPassword)){
                                    System.out.println("Log in successful.");
                                }   
                            }
                        }
                    }
                    else {
                        System.out.println("Okay. It is choice.");
                    }
            }
            inp.close();
        }
    }
    

