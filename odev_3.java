package week_10;

import java.util.Scanner;

public class odev_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dizinin kaç elemanlı olacağını giriniz");
        int n = input.nextInt();
        int[] dizi = new int[n];
        int[] pozitif = new int[n];
        int[] negatif = new int [n];    
        int p  =0;
        int ne = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(i + ". indixi giriniz");
            dizi[i] = input.nextInt();

        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < 0) {
                negatif[ne] = dizi[i];
                ne += 1;

            }
            if (dizi[i] > 0) {
              
                pozitif[p] = dizi[i];
                p++;
            }
            
        }
        for (int i = 0; i < pozitif.length-1; i++) {
            System.out.println("Pozitifler" + pozitif[i]);
        }
        for (int i = 0; i < negatif.length-1; i++) {
            System.out.println("negatifler" + negatif[i]);
        }

    }
}
