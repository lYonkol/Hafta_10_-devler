package week_10;

import java.util.Scanner;

public class odev_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen polinomun derecesini giriniz");
        int n = input.nextInt();
        System.out.println("Lutfen polinomun katsayılarını giriniz");
        double[] kat = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + ".Dereceden olan elemanın katsayısını giriniz");
            kat[i] = input.nextDouble();
        }
        System.out.println("Lutfen y(x) için polinom değerini giriniz");
        int c = input.nextInt();
        double toplam = 0;
        for (int i = 0; i < n; i++) {
            toplam += kat[i] * Math.pow(c, i);
        }
        System.out.println("Sonuc = " + toplam);
    }

}
