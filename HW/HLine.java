import java.util.*;

public class HLine {

    public static void main(String args[]) {
        int i, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print("*\t");
        }
    }

}