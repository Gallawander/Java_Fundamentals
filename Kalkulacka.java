import java.util.Scanner;

public class Kalkulacka {

	public Kalkulacka() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in, "UTF-8");
		
		System.out.println("Vitajte v programe Kalkula�ka.");
		
		String p = "ano";
		do {
			System.out.println("");
			System.out.println("Zadajte pros�m svoje prv� ��slo:");
			double a = Double.parseDouble(sc.nextLine());
			System.out.println("");
		
			System.out.println("Zadajte pros�m svoje druh� ��slo:");
			double b = Double.parseDouble(sc.nextLine());
			System.out.println("");
		
			System.out.println("Vyberte oper�ciu, ktor� m� kalkula�ka vykona�.");
			System.out.println("");
			
			System.out.println("S��tanie: 1");
			System.out.println("Od��tanie: 2");
			System.out.println("N�sobenie: 3");
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
					System.out.println("V�sledok zvolenej oper�cie je: " + vysledok);
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
				System.out.println("Neplatn� vo�ba");
				System.out.println("");
			}
				
			System.out.println("Prajete si pokra�ova�?  [ano/nie]");
			System.out.println("");
			
			p = sc.nextLine();
			
	} while (p.equals("ano"));
	
		
	System.out.println();
	System.out.println("�akujeme za vyu�itie na�ej kalkula�ky.");

}
}
