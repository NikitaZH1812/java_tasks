package Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args1) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість рядків:");

        int rows = sc.nextInt();

        Triangle Triangle = new Triangle();
        Triangle.TrianglePrinter(rows);
    }
}
