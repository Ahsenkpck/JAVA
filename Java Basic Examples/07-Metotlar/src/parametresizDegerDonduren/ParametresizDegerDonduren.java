package parametresizDegerDonduren;

/**
 *
 * @author akipc
 */
public class ParametresizDegerDonduren {

    public static int topla() {
        int a = 10;
        int b = 5;
        int toplam = a + b;
        return toplam;

    }

    public static void main(String[] args) {
        int d = topla();
        System.out.println("Toplam:" + d);
        double sonuc = carp();
        System.out.println("Çarpma sonucunuz:" + sonuc);
    }

    public static double carp() {
        int a = 5;
        double b = 4.6;
        return a * b;
    }
}
