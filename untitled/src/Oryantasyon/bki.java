package Oryantasyon;

import java.util.Scanner;
public class bki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyet Secimi Lütfen 1 ya da 2 yi seciniz. ");
        System.out.println("1-Kadın " + "2-Erkek ");
        int cinsiyet = input.nextInt();
        if (cinsiyet >= 3 || cinsiyet <= 0) {
            System.out.println("Yanlış Bir Değer Girdiniz. ");
            System.exit(1);
        }
        System.out.println("Boyunuzu 'metre' Cinsinden Giriniz. " + "Örnegin 1.82 ");
        double boy = input.nextDouble();
        if (boy >= 3 || boy <= 0) {
            System.out.println("Yanlış Bir Değer Girdiniz. ");
            System.exit(1);
        }
        System.out.println("Kilonuzu Giriniz. ");
        double kilo = input.nextDouble();
        if (kilo >= 500 || kilo <= 0) {
            System.out.println("Yanlış Bir Değer Girdiniz. ");
            System.exit(1);
        }
        double bki = kilo / (boy * boy);
        if (cinsiyet == 1) {
            if (bki >= 23) System.out.println("Kilolu Kadın. " + bki);
            else System.out.println("Normal Kadın. " + bki);
        }
        else {
            if (bki >= 25) System.out.println("Kilolu Erkek. " + bki);
            else System.out.println("Normal Erkek. " + bki);
        }
    }
}
