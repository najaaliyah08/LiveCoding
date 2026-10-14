import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int i;

        System.out.println("Masukkan angka: ");
        int n = in.nextInt();

        for (i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total = total + i;
            }
        }
        System.out.println("Total: " + total);
    }
}