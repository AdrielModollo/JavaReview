package vetores;

public class Vetores {
	
	public static void main(String[] args) {
		String mes[] = {"JAN", "FEV", "MAR", "ABR", "MAI",
			"JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
		int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int c=0; c<mes.length; c++) {
			System.out.println("O m�s de " + mes[c] + " possu� " + tot[c] + " dias");
		}
	}
}
