package Oryantasyon;

import java.util.Random;
import java.util.Scanner;
public class tasKagitMakas {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Tas kagit makas oyununa hoşgeldiniz!");
        System.out.println("Lütfen bir sayı giriniz: ");
        System.out.println("1-Taş");
        System.out.println("2-Kagıt");
        System.out.println("3-Makas");
        int kullanici = scan.nextInt();
            if (kullanici > 3) {
                System.out.println("Lütfen geçerli bir sayı giriniz");
            } else {
                int computer = rd.nextInt(3) + 1;
                System.out.println(computer);
                if (kullanici == computer) {
                    System.out.println("Berabere");
                } else if (kullanici > computer) {
                    System.out.println("Tebrikler siz kazandiniz ;)");
                } else if (kullanici < computer) {
                    System.out.println("Maalesef kaybettiniz :(");
                }
            }
        }
    }
