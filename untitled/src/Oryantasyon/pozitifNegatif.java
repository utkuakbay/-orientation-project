package Oryantasyon;

import java.util.Scanner;
public class pozitifNegatif {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Bir değer giriniz.");
        int intDeger =input.nextInt();
        if (intDeger<0){
            System.out.println("Deger negatif " + intDeger );
        } else if (intDeger>0) {
            System.out.println("Deger Pozitif " + intDeger);
        } else
            System.out.println("notr "+ intDeger);
    }
}
