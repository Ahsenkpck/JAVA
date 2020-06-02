package parametreliDegerDonduren;

/**
 *
 * @author akipc
 */
public class ParametreliDegerDonduren {

    public static void main(String[] args) {

        double d = carp(2.7f, 5.3f);
        System.out.println("Çarpma sonucunuz:" + d);
        d = carp(4.7f, 5.9f);
        System.out.println("Çarpma sonucunuz2:" + d);
        double b = bol(5, 3);
        System.out.println("Bölme sonucunuz:" + b);
        b = bol(26, 7);
        System.out.println("Bölme sonucu2:" + b);
        int toplam = topla(3, 9);
        System.out.println("Toplam sonucunuz:" + toplam);
        toplam = topla(98, 45);
        System.out.println("Toplama sonucu2:" + toplam);

    }

    public static int topla(float a, float b) {

        int toplam = (int) (a + b);
        return toplam;

    }

    public static double carp(float a, float b) {
        return a * b;

    }

    public static double bol(int a, int b) {
        return (double) (a / b);

    }
}
