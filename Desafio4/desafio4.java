package desafios;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.nextLine();

		String[] linhas = new String[n];

		for (int i = 0; i < n; i++) {

			linhas[i] = sc.nextLine();
		}

		for (int i = 0; i < n; i++) {
			String linha = linhas[i];
			int tamanho = linha.length();

			String parteEsquerda = linha.substring(0, tamanho / 2);
			String parteDireita = linha.substring(tamanho / 2);

			String linhaDecifrada = "";

			for (int j = parteEsquerda.length() - 1; j >= 0; j--) {
				linhaDecifrada += parteEsquerda.charAt(j);
			}

			for (int j = parteDireita.length() - 1; j >= 0; j--) {
				linhaDecifrada += parteDireita.charAt(j);
			}

			System.out.println(linhaDecifrada);
		}

		sc.close();

	

	}

}
