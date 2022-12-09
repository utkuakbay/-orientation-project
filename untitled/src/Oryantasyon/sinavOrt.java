package Oryantasyon;

import java.util.Scanner;
public class sinavOrt {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Vize Notunuzu Giriniz. ");
        double vizeNot = input.nextDouble();
        System.out.println("Final Notunuzu Gİriniz. ");
        double finalNot = input.nextDouble();
        double ortalama = (vizeNot*0.4+finalNot*0.6);
        System.out.println("Ögrenci Not Ortalaması= " + ortalama);
    }
}
