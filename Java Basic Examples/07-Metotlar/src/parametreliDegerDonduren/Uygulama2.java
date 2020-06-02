package parametreliDegerDonduren;

/**
 *
 * @author akipc
 */
public class Uygulama2 {

    public static void main(String[] args) {
        boolean d = karsilastir(5, 3);
        System.out.println("Durum değeri:" + d);
        d = karsilastir(15, 18);
        System.out.println("İkinci durum:" + d);
    }

    public static boolean karsilastir(int a, int b) {

        boolean durum = (a > b) ? true : false;
        return durum;

        /*   if (a > b) {
            return true;

        } else {
            return false;
        }
         */
    }

}
