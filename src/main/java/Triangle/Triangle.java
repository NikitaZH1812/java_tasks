package Triangle;

public class Triangle {
    public static void TrianglePrinter (int rows) {
        int counter = 0;

        while (counter <= rows) {

            for (int i = 1; i <= rows - counter; i++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * counter - 1; k++) {
                System.out.print("*");
            }

            counter++;

            System.out.println();
        }
    }
}

