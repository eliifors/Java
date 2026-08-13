 public class Main {
    public static void main(String[] args) {

        int sayi1 = 18;
        int sayi2 = 1;
        int sayi3 = 30;
        int enBuyukSayi = sayi1;

        if(enBuyukSayi < sayi2) {
            enBuyukSayi = sayi2;
        }
        if (enBuyukSayi < sayi3) {
            enBuyukSayi = sayi3;
        }
        System.out.println("En Büyük Sayı = " + enBuyukSayi);
    }
 }