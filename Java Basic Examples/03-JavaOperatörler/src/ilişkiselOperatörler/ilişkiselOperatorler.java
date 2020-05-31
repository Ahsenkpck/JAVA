package ilişkiselOperatörler;

/**
 *
 * @author akipc
 */
public class ilişkiselOperatorler {

    public static void main(String[] args) {
        /*
        == , != , < , > , <= , >=
         */

        int sayi1 = 14;
        int sayi2 = 28;
        boolean durum = sayi1 == sayi2;
        System.out.println("durum:" + durum);
        boolean durum2 = sayi1 != sayi2;
        System.out.println("durum2:" + durum2);
        boolean durum3 = sayi1 < sayi2;
        System.out.println("durum3:" + durum3);
        boolean durum4 = sayi1 >= sayi2;
        System.out.println("durum4:" + durum4);
        System.out.println("durum5:" + (sayi1 <= sayi2));
    }
}
