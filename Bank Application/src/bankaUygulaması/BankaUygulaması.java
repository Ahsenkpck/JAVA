package bankaUygulaması;

import java.util.Scanner;
/**
 *
 * @author akipcak
 */
public class BankaUygulaması {

    static Scanner scan = new Scanner(System.in);
    static int hesaptakipara = 0;

    public static void main(String[] args) {
        String AdSoyad;

        int secenek;

        AdSoyad = AdSoyadAl();
        do {
            menü(AdSoyad);
            secenek = secenekal();
            Secenekkontrol(secenek);
           
            if (secenek == 4) {
                break;
            }
            menüyönlendir();
        } while (secenek != 4);
    }
    public static void Secenekkontrol(int sec) {
        if (sec == 1) {
            parayatir();
        } else if (sec == 2) {
            paracekme();
        } else if (sec == 3) {
            bakiyesorma();
        } else if (sec == 4) {
            çıkış();
        } else {
        System.out.println("Geçersiz bir giriş yaptınız.Lütfen tekrar giriş yapınız.");

        }
    }
    public static void menüyönlendir() {
        System.out.println("\n Menüye yönlendiriliyorsunuz...\n");

    }
    
    public static void parayatir() {
        int yatirilanpara;
        System.out.println("Para yatırmayı seçtiniz.Hesaptaki paranız:" + hesaptakipara);
        do {

        System.out.println("Yatırmak istediğiniz miktar:");
        yatirilanpara = scan.nextInt();
        if (yatirilanpara < 0) {

        System.out.println("Böyle bir para girişi yapılamaz tekrardan giriniz:");
            }
        } while (yatirilanpara < 0);
        hesaptakipara = hesaptakipara + yatirilanpara;
        System.out.println("Hesabınıza para yatırıldı.Şu an ki bakiyeniz:" + hesaptakipara);
    }
    
    public static void paracekme() {
        int cekilenpara;
        System.out.println("Para çekmeyi seçtiniz.Hesabınızdaki miktar:" + hesaptakipara);
        do {
        System.out.print("Çekmek istediğiniz tutar:");
        cekilenpara = scan.nextInt();
        System.out.println("Hesapta yeterli nakit bulunmamaktadır.Lütfen çekeceğiniz miktarı tekrar giriniz:");
        } while (cekilenpara > hesaptakipara);
        hesaptakipara = hesaptakipara - cekilenpara;
        System.out.println("Hesabınızdan para çekilmiştir.Şu an ki bakiyeniz:" + hesaptakipara);

    }
    
    public static void bakiyesorma() {
        System.out.println("Hesabınızdaki para:" + hesaptakipara);

    }
    
    public static void çıkış() {

        System.out.println("Çıkış yapılıyor.İyi günler..");

    }
    
    public static String AdSoyadAl() {
        String ad;
        String soyad;
        System.out.println("Hoşgeldiniz.Lütfen ilerlemek için ");
        System.out.print("Adınızı giriniz :");
        ad = scan.next();
        System.out.print("Soyadınızı giriniz :");
        soyad = scan.next();

        return ad + " " + soyad;

    }
    
    public static void menü(String adsoyad) {
        System.out.println(" ");
        System.out.println("HOŞGELDİN" +" "+ adsoyad);
       
        System.out.println("**MENÜ**");

        System.out.println("1) Para Yatırma");
        System.out.println("2) Para Çekme");
        System.out.println("3) Bakiye Sorma\n4) Çıkış");

    }
    
    public static int secenekal() {

        System.out.println("Bir seçenek giriniz:");
        int secenek = scan.nextInt();

        return secenek;

    }
    
}
