package donguBreak;

/**
 *
 * @author akipc
 */
public class donguBreakWhile {

    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            if (a == 5) {
                break;

            }

            System.out.println("a:" + a);
            a++;

        }
        System.out.println("dongu bitti");
    }
}
