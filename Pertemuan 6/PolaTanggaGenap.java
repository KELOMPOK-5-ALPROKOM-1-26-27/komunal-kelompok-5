import java.util.Scanner;

public class PolaTanggaGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int val = 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val += 2;
            }
            System.out.println();
        }

        input.close();
    }
}
