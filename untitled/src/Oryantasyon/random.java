package Oryantasyon;

import java.util.Scanner;
public class random {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        int sayi1=(int) (Math.random()*10);
        System.out.println("Sayıyı tahmin ediniz 0-10 ");
        int kullanici = input.nextInt();
        if (kullanici==sayi1){
            System.out.println("Doğru bildiniz Tebrikler. ");
        }
        System.out.println("Yanlış Bildiniz Birdaha ki Sefere. ");
        System.out.println(sayi1);
    }
}

