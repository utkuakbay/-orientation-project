package Oryantasyon;

public class Fibonacci {
    public static void main(String []args){
        int birinci=1, ikinci=2, toplam=0;
        System.out.println(birinci);
        System.out.println(ikinci);
        for (int i=2; i<40; i++){
            toplam=birinci+ikinci;
            birinci=ikinci;
            ikinci=toplam;
            System.out.println(toplam);
        }
    }
}
