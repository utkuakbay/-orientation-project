package Oryantasyon;

import java.util.Scanner;
public class cevreAlan {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Bir çap giriniz. ");
        double cap = input.nextDouble();
        final double pi_Sayisi= 3.141593;
        double cevre= (pi_Sayisi*2*cap);
        double alan= (pi_Sayisi*cap*cap);
        System.out.println("1=Cevre " + "2=Alan" + "  1 Yada 2yi seçiniz. ");
        int b =input.nextInt();
        if (b==1) {
            System.out.println("Çevre= " + cevre);
        } else if (b==2) { System.out.println("Alan= " + alan);
            }
        if (b>=3 || b<=0) {
            System.out.println("Yanlış Bir Değer Girdiniz. ");
        }
    }
}