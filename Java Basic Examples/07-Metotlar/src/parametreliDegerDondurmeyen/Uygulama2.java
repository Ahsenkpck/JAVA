package parametreliDegerDondurmeyen;

/**
 *
 * @author akipc
 */
public class Uygulama2 {

    public static void mesajyaz(String ad, String soyad, int yaş) {

        String isim = ad;
        String soyisim = soyad;
        int yas = yaş;
        System.out.println("Merhaba");
        System.out.println("İsminiz:" + isim);
        System.out.println("Soyisminiz:" + soyisim);
        System.out.println("Yaşınız:" + yas);
    }

    public static void karakteral(char c) {
        System.out.println("Alınan karakter:" + c);
    }

    public static void main(String[] args) {
        mesajyaz("Ahsen", "Kıpçak", 19);
        karakteral('a');
    }

}
