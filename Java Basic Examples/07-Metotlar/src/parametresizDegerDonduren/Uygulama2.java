package parametresizDegerDonduren;

/**
 *
 * @author akipc
 */
public class Uygulama2 {

    public static void main(String[] args) {

        boolean durum = karsilastir();
        System.out.println("Karşılaştırma durumunuz:" + durum);
    }

    public static boolean karsilastir() {
        int a = 26;
        int b = 22;
        if (a > b) {
            return true;

        }
        return false;

    }

}
