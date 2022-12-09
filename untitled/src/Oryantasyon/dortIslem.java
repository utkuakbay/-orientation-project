package Oryantasyon;

import java.util.Scanner;
public class dortIslem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz. ");
        double sayi1 = input.nextInt();
        System.out.println("İkininci Sayıyı Giriniz. ");
        double sayi2 = input.nextInt();
        System.out.println("Bir işlem Seçiniz. "+ "1='+' " + "2='-' "+ "3='x' " + "4='/'");
        int kullanici= input.nextInt();
        if (kullanici>=5){
            System.out.println("Yanlış Bir Sayı Girdiniz. ");
            System.exit(1);
        }
        else if (kullanici==1){
            System.out.println("Sayıların Toplamı " + (sayi1+sayi2) );
        }
        else if (kullanici==2){
            System.out.println("Sayıların Farkı " + (sayi1-sayi2) );
        }
        else if (kullanici==3){
            System.out.println("Sayıların Çarpımı " + sayi1*sayi2);
        }
        else {
            System.out.println("Sayıların Bölümü " + sayi1/sayi2);
        }
    }
}
