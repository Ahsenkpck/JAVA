package ifKontrol;

/**
 *
 * @author akipc
 */
public class ifKontrol {

    public static void main(String[] args) {
        int sayi1 = 45;
        int sayi2 = 35;
        boolean durum = sayi1 > sayi2;
        if (durum) {

            System.out.println("sayi1 buyuktur sayi2 den");
            if ((sayi1 - sayi2) > 5) {
                System.out.println("sayi1 in sayi2 den farkı 5 den büyüktür");
            }
        }
        if (sayi1 < sayi2) {

            System.out.println("sayi1 sayi2 den kucuktur");
        }
        if (sayi1 != sayi2) {

            System.out.println("sayi1 eşit değildir sayi2 ye");
        }
        if (sayi1 == sayi2) {

            System.out.println("sayi1 eşittir sayi2 ye");
        }
        System.out.println("karşılaştrıma işlemleri bitti");
    }
}
