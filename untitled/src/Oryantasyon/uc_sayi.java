package Oryantasyon;

import java.util.Scanner;
public class uc_sayi {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi karsilaştirma");
        System.out.println("Lütfen 1.sayiyi giriniz:");
        int sayi1=scan.nextInt();
        System.out.println("Lütfen 2.sayiyi giriniz:");
        int sayi2=scan.nextInt();
        System.out.println("Lütfen 3.sayiyi giriniz:");
        int sayi3=scan.nextInt();
        if(sayi1>sayi2) {
            if(sayi1==sayi3) {
                System.out.println("En büyük sayi 1. ve 3. sayılardır. ");
            }else if(sayi1>sayi3)
            {
                System.out.println("En büyük sayi 1.sayıdır.");
            }else {
                System.out.println("En buyuk sayi 3.sayidir.");
            }
        }
        if(sayi1<sayi2) {
            if(sayi2==sayi3) {
                System.out.println("En büyük sayi 2. ve 3. sayılardır. ");
            }else if(sayi2>sayi3)
            {
                System.out.println("En büyük sayi 2.sayıdır.");
            }else if(sayi2<sayi3){
                System.out.println("En buyuk sayi 3.sayidir.");
            }
        }
    }

}