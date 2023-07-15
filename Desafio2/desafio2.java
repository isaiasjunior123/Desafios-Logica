package desafios;

import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		
		  Scanner sc = new Scanner(System.in);
		  sc.useLocale(Locale.US);

	        
	        double valor = sc.nextDouble();
	        int centavos = (int) (valor * 100 + 0.5);

	        int[] notasMoedas = { 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1 };
	        int[] contadores = new int[notasMoedas.length];

	        for (int i = 0; i < notasMoedas.length; i++) {
	            contadores[i] = centavos / notasMoedas[i];
	            centavos %= notasMoedas[i];
	        }

	        System.out.println("NOTAS:");
	        for (int i = 0; i < 6; i++) {
	            System.out.println(contadores[i] + " nota(s) de R$ " + (notasMoedas[i] / 100.0));
	        }

	        System.out.println("MOEDAS:");
	        for (int i = 6; i < notasMoedas.length; i++) {
	            System.out.println(contadores[i] + " moeda(s) de R$ " + (notasMoedas[i] / 100.0));
	        }

	        sc.close();
	}

}
