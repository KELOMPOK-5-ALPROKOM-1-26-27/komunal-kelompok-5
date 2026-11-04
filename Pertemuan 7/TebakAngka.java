import java.util.Scanner;
public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angkaRahasia = 42;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan tebakan ke-" + i + ": ");
            int tebakan = input.nextInt();

            if (tebakan < 1 || tebakan > 100) {
                System.out.println("Angka harus antara 1-100!");
                i--;
                continue;
            }

            if (tebakan == angkaRahasia) {
                System.out.println("Benar! Kamu menang.");
                break;
            } else if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil!");
            } else {
                System.out.println("Terlalu besar!");
            }

            if (i == 5) {
                System.out.println("Kalah!");
                return;
            }
        }
    }
}
