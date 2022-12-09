package Oryantasyon;

import java.util.Scanner;
public class faktoriyel {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int faktoriyel = 1;
        System.out.println("Bir sayı giriniz. ");
        int sayi = input.nextInt();
        if (sayi<1){
            System.out.println("Yanlış bir deger girdiniz. ");
        }
        else {
        for(int i = 1; i <= sayi; i++){
            faktoriyel=faktoriyel*i;
        }
        System.out.println(sayi + "!= " + faktoriyel );
        }
    }
}
