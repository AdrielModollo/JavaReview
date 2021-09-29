package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite um nome:");
		String nome = dados.nextLine();
		System.out.println("Digite uma nota:");
		float nota = dados.nextFloat();
		
		System.out.printf("A nota de %s é: %.2f \n" ,nome, nota); //Formata o campo por casas decimais
	}
}
