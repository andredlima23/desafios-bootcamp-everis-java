import java.io.IOException;
import java.util.Scanner;

public class ExibindoNumerosPares {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            for (int i = 2; i <= N; i += 2) {
                System.out.println(i);
            }
        }
    }
}