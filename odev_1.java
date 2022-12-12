
package week_10;

import java.util.Scanner;
public class odev_1 {

 
    public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
        System.out.println("Lutfen dizilerin eleman sayısını giriniz");
        int n = input.nextInt();
        int[] dizi = new int[n];
        int[] dizi1 = new int[n];
        double skaler=0;
        for (int i = 0; i < n; i++) {
            dizi[i]=input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            dizi1[i]=input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            skaler += dizi[i]*dizi1[i]; 
        } 
         
        System.out.println("skaler çarpım :"+skaler);
    }
    
}
