import java.util.Scanner;
public class JumlahDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int count = 0;
        while (n > 0) {
            count++;
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Jumlah digit: " + count);
        System.out.println("Jumlah nilai digit: " + sum);
        input.close();
    }
}
