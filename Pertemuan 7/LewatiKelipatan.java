import java.util.Scanner;

public class LewatiKelipatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int N = input.nextInt();

        System.out.print("Output : ");

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }

            System.out.print(i + " ");
        }
        input.close();
    }
}
