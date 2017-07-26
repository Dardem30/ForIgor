/**
 * Created by Роман on 26.07.2017.
 */
public class Chessdesc {
    public static void main(String[] args) {
        for (int j=1; j<5; j++) {
            for (int i = 1; i < 9; i++) {
                if (i % 2 != 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }

            }
            System.out.println();
            for (int i = 1; i < 9; i++) {
                if (i % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }
}
