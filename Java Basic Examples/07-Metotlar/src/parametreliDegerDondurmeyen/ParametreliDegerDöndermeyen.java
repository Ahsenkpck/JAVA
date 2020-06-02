package parametreliDegerDondurmeyen;

/**
 *
 * @author akipc
 */
public class ParametreliDegerDondurmeyen {

    public static void topla(int a, int b, int c, double d) {
        int toplam = a + b + c;
        double kök = Math.sqrt(d);
        System.out.println("Toplam sonucu:" + toplam);
        System.out.println("Kök değeri:" + kök);
    }

    public static void carp(int a, int b) {
        int carpım = a * b;
        System.out.println("Çarpım sonucu:" + carpım);

    }

    public static void main(String[] args) {
        topla(6, 11, 20, 2.7);
        topla(5, 3, 30, 5.9);
        carp(3, 9);
        carp(12, 18);
    }

}
