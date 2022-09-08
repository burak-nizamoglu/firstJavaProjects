package packageforpractice;

import java.util.Scanner;

public class hackerRankFirstJavaQuestion {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int a = inp.nextInt();
        
        String t1 =(((a<=127) && (a>=-128)) ? "* byte" : "* byte is not fitted");
        String t2 =(((a<=32.767) && (a>=-32768)) ? "* short" : "* short is not fitted");
        String t3 =(a<=Math.pow(2,31) && (a>=Math.pow(-2,31)) ? "* int" : "* int is not fitted");
        String t4 =(a<=Math.pow(2,63) && (a>=Math.pow(-2,63)) ? "* long" : "* long is not fitted");
        System.out.println(a + " can be fitted in" t1 + t2 + t3 + t4);
        
    
    
    }   
    
}
