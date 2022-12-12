package week_10;

import java.util.Scanner;

public class odev_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dizinin eleman sayısı girin");
        int a = input.nextInt();
        int[] dizi = new int[a];
        int toplam = 0;
        int çarpım = 1;
        for (int i = 0; i < a; i++) {
            System.out.println(i + 1 + ".elemanı giriniz");
            dizi[i] = input.nextInt();
        }
        for (int i = 0; i < a; i++) {
            toplam += dizi[i];
            çarpım *= dizi[i];
            double harmonik = a / (1 / dizi[i]);
            double kontraharmonik = Math.pow(dizi[i], 2) / toplam;

        }
        double aritmatikort = toplam / dizi.length;
        double geoort = Math.pow(çarpım, 1 / a);

    }

}
