package SayiStringDonusumu;

/**
 *
 * @author akipc
 */
public class TipDonusum3 {

    public static void main(String[] args) {
        int sayi1 = 15;
        int sayi2 = 25;
        int toplam = sayi1 + sayi2;
        System.out.println("toplam sonucu:" + toplam);
        String don1 = String.valueOf(sayi1);
        String don2 = String.valueOf(sayi2);
        String toplamstring = don1 + don2;
        System.out.println("toplam string sonucu:" + toplamstring);
        double d = 12.45;
        String ss = String.valueOf(d);
        System.out.println("double değer dönüşümü:" + ss);

    }
}
