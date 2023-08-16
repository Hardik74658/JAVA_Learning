import java.util.Scanner;

public class ReverseLeftAngled {
    public static void main(String args[]) {
        int i, n, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = input.nextInt();
        for (i = 5; i >= 1; i--) {
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
