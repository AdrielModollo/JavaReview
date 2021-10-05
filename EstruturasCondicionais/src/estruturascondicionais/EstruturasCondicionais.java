package estruturascondicionais;

import java.util.Scanner;

public class EstruturasCondicionais {
	
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Em que você nasceu?");
		int nasc = t.nextInt();
		int i = 2021-nasc;
		System.out.println("Sua idade é " + i);
		if (i>=18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
	}
}
