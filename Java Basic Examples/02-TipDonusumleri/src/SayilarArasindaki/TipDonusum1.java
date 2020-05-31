package SayilarArasindaki;
/**
 *
 * @author akipc
 */
public class TipDonusum1 {

    public static void main(String[] args) {
        //long 2 milyar degeri int e çevirdiğimizde int te kapasite hepsini alamayacağından veri kaybına neden olur.

        byte bsayi = 15;
        int isayi = (int) bsayi;

        float fsayi = 55.223f;
        int insayi = (int) fsayi;
        byte bysayi = (byte) fsayi;
        int sayi = 25;
        double dsayi = (double) sayi;
        System.out.println("int sayinin değeri:" + insayi);
        System.out.println("byte sayının değeri:" + bysayi);
        System.out.println("sayı:" + sayi);
        System.out.println("doble sayı değeri:" + dsayi);
    }

}
