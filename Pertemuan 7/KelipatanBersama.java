import java.util.Scanner;

public class KelipatanBersama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan A : ");
        int A = input.nextInt();

        System.out.print("Masukkan B : ");
        int B = input.nextInt();

        System.out.print("Batas X : ");
        int X = input.nextInt();

        for (int i = X + 1; ; i++) {
            if (i % A == 0 && i % B == 0) {
                System.out.println("Bilangan ditemukan: " + i);
                break;
            }
        }
        input.close();
    }
}
