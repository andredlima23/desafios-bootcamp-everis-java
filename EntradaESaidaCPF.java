import java.util.Scanner;
import java.util.Locale;

public class EntradaESaidaCPF{
	public static void main(String[] args) {

		Locale.setDefault(new Locale("en", "US"));

		Scanner sc = new Scanner(System.in);
		
		String[] cpf = new String[4]; 

                //continue a solucao

		cpf = sc.nextLine().split("\\.|-");

    for (int i = 0; i <= 3 ; i++){
			System.out.printf("%s\n",cpf[i]);
    }

		sc.close();
	}
}