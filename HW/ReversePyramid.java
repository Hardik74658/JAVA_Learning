import java.util.Scanner;

public class ReversePyramid {
    public static void main(String args[]) {
        int i, n, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = input.nextInt();
        for (i = 5; i >= 1; i--) {
            for (int space = n - i; space > 0; space--) {
                System.out.print(" \t");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("* \t\t");
            }
            System.out.println();
        }
    }
}
