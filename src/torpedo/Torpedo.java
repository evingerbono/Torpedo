
package torpedo;

import java.util.Random;
import java.util.Scanner;

public class Torpedo {

    
    public static void main(String[] args) {
       hajo();
    }

    private static void hajo() {
        Random rnd = new Random();
        Scanner src = new Scanner(System.in);
        int min =1;
        int max=7;
        int[] hely= new int [3];
        for (int i = 0; i <3; i++) {
            int elhely = rnd.nextInt(max-min+1)+min;
            hely[i]=elhely;
           System.out.println(hely[i]);
        }
        
        for (int i = 0; i < 7; i++) {
            System.out.print("Kérem adjon meg egy számot(1-7):");
            int loves = src.nextInt();
            if (loves==hely[i]) {
             System.out.println("Talált.");
          }else{
             System.out.println("Nem talált.");
         }   
        }
        
        
    }
    
}
