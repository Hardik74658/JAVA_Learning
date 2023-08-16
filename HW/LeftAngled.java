import java.util.Scanner;

public class LeftAngled {
    public static void main(String args[]) {
        int i, n, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            for (int k = n - i; k > 0; k--) {
                System.out.print(" \t");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
