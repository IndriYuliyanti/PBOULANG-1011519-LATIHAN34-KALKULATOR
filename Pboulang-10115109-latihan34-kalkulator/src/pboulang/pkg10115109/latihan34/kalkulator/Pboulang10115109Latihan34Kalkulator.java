/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Pboulang10115109Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner masuk = new Scanner(System.in);
        int a,b,c;
        System.out.print("Bilangan 1 :");
            a = masuk.nextInt();
        System.out.print("Bilangan 2 :");
            b = masuk.nextInt();
            
            c=a+b;
        System.out.println("Penjumlahan;"+a +" + "+b+"="+c);
        
        c = a-b;
         System.out.println("Pengurangan;"+a +" -"+b+"="+c);
        
         c = a*b;
          System.out.println("Perkalian;"+a +" *"+b+"="+c);
        
          c = a/b;
           System.out.println("Pembagian;"+a +>" /"+b+"="+c);
        
           c = a%b;
            System.out.println("Sisa bagi;"+a +" %"+b+"="+c);
      
        
        
        
        
    }
    
}
