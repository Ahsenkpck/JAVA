package donguBreak;

/**
 *
 * @author akipc
 */
public class donguDoWhile {

    public static void main(String[] args) {
        int a = 0;
        do {
            System.out.println("A:" + a);
            a++;
            if (a == 8) {

                break;
            }

        } while (a < 10);

    }

}
