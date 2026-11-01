import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = hi.nextInt();

        int i = 1;
        int jumlah = 1;

        while (i <= n) {
            jumlah *= i;
            i++;
        }

        System.out.printf("Mengalikan angka 1 sampai %d = %d", n, jumlah);

    }
}
