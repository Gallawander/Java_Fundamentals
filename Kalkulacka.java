import java.util.Scanner;

public class Kalkulacka {

	public Kalkulacka() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in, "UTF-8");
		
		System.out.println("Vitajte v programe Kalkulaèka.");
		
		String p = "ano";
		do {
			System.out.println("");
			System.out.println("Zadajte prosím svoje prvé èíslo:");
			double a = Double.parseDouble(sc.nextLine());
			System.out.println("");
		
			System.out.println("Zadajte prosím svoje druhé èíslo:");
			double b = Double.parseDouble(sc.nextLine());
			System.out.println("");
		
			System.out.println("Vyberte operáciu, ktorú má kalkulaèka vykona.");
			System.out.println("");
			
			System.out.println("Sèítanie: 1");
			System.out.println("Odèítanie: 2");
			System.out.println("Násobenie: 3");
			System.out.println("Delenie: 4");
			System.out.println("");
			
			int vyber = Integer.parseInt(sc.nextLine());
			double vysledok = 0;
			
			
			switch (vyber) {
			
			case 1:
				vysledok = a + b;
				break;
				
			case 2:
				vysledok = a - b;
				break;
				
			case 3:
				vysledok = a * b;
				break;
				
			case 4:
				vysledok = a / b;
				break;
			}
				
			
			if ((vyber > 0) && (vyber < 5)) {
				if ((b != 0) && (vyber != 4)) {
					System.out.println("Výsledok zvolenej operácie je: " + vysledok);
					System.out.println("");
				}
				else {
					System.out.println("");
					System.out.println("Delenie nulou!");
					System.out.println("");
				}
			}
			else {
				System.out.println("");
				System.out.println("Neplatná vo¾ba");
				System.out.println("");
			}
				
			System.out.println("Prajete si pokraèova?  [ano/nie]");
			System.out.println("");
			
			p = sc.nextLine();
			
	} while (p.equals("ano"));
	
		
	System.out.println();
	System.out.println("Ïakujeme za využitie našej kalkulaèky.");

}
}
