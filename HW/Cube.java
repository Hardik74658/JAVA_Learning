import java.util.*;

public class Cube {

    public static void main(String args[]) {
        int i, n, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
