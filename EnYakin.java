package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakin {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        int sayi;

        Arrays.sort(dizi);
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(dizi));

        System.out.print("Bir Sayı Giriniz : ");
        sayi = input.nextInt();
        int kucuk = dizi[0];
        int buyuk = dizi[dizi.length - 1];


        for (int i : dizi) {
            if (i > kucuk) {
                if (i < sayi) {
                    kucuk = i;
                }
            }
            if (i < buyuk) {
                if (i > sayi) {
                    buyuk = i;
                }
            }
        }
        System.out.println("Girilen sayıya en yakın küçük sayı : " + kucuk);
        System.out.println("Girilen sayıya en yakın büyük sayı : " + buyuk);
    }
}
