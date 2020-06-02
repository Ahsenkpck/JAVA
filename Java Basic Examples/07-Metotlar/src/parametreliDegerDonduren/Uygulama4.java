package parametreliDegerDonduren;

/**
 *
 * @author akipc
 */
public class Uygulama4 {

    public static void main(String[] args) {
        int sonucmax = max(10, 20);
        System.out.println("Max sonuc:" + sonucmax);
        int sonucmin = min(15, 18);
        System.out.println("Min sonuc:" + sonucmin);
    }

    public static int max(int a, int b) {

        if (a > b) {
            return a;

        } else {
            return b;
        }

    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;

    }
}
