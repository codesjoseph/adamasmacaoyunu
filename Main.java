import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] kelimeler = {"Araba","Portakal","Elma","çekoslovakyalılaştıramadıklarımızdanmısnız"};
        String kelime = kelimeler[rnd.nextInt(kelimeler.length)];
        int kalanHak = 5;
        int secim = 0;
        System.out.println("Oyun başlıyor");
        System.out.println("Tahmin ediceğiniz kelime uzunluğu: " + kelime.length());
        while (kalanHak != 0){
            System.out.println("Kelime için 1 harf için 2 ye basınız: ");
            secim = scanner.nextInt();
            scanner.nextLine();
            if (secim == 1){
                System.out.println("Lütfen kelime tahmininizi giriniz : ");
                String tahmin = scanner.nextLine();
                if (tahmin.equals(kelime)){
                    System.out.println("Tebrikler! Kazandınız..");
                }else{
                    System.out.println("Üzgünüm! Kaybettiniz..");
                }
            }else if(secim == 2){
                System.out.println("Lütfen harf tahmininizi giriniz : ");
                String tahminKarakter = scanner.nextLine();
                if (kelime.contains(tahminKarakter)){
                    String temp = "";
                    for (int i = 0; i < kelime.length(); i++) {
                        if (kelime.charAt(i) == tahminKarakter.charAt(0)) {
                            temp += tahminKarakter.charAt(0);
                        }else{
                            temp += "*";
                        }
                    }
                    System.out.println(temp);
                }else{
                    kalanHak--;
                    System.out.println("Tahmin geçersiz..");
                    System.out.println("Mevcut kalan hakkınız: " + kalanHak);
                }
            }else{
                System.out.println("Lütfen doğru giriş yapınız!");
            }
        }
    }
}