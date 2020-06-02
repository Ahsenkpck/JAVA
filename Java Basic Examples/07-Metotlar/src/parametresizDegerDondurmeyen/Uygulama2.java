package parametresizDegerDondurmeyen;

/**
 *
 * @author akipc
 */
public class Uygulama2 {

    public static void main(String[] args) {
        topla();
        System.out.println("");
        carp();
        System.out.println("");
        topla();

    }

    public static void carp() {
        int a = 6;
        int b = 7;
        int carpım = a * b;
        System.out.println("Çarpım sonucu:" + carpım);

    }

    public static void topla() {
        int a = 6;
        int b = 7;
        int toplam = a + b;
        System.out.println("Toplam sonucu:" + toplam);

    }
}
