import java.util.Arrays;
import java.util.Scanner;

public class Polia {

	public Polia() {
		// TODO Auto-generated constructor stub
	}
		
	public static void main(String[] args) {
	//Pole 1//
			int[] pole = new int [10];
			pole[0] = 1;
			for (int i = 0; i < 10; i++) {
					pole[i]= i + 1;
			}
			for (int i = 0; i < pole.length; i++) {
				System.out.print(pole[i] + " ");
			}
			
			System.out.println("");
			
	//Pole 1 - reversed//
			int[] poler = new int [10];
			poler[0] = 10;
			for (int j = 0; j < poler.length; j++) {
				poler[j]  = 10 - j;
			}
			
			for (int j : poler) {
				System.out.print(j + " ");
			}
			
			System.out.println("");
	
	//Pole 2//
			Scanner sc = new Scanner (System.in, "UTF-8");
			
			String[] rodina = {"Martin", "Ma�o", "Zuzka", "M�ria", "Veronika"};
			Arrays.sort(rodina);
			
				System.out.println("Zadaj niekoho z rodiny Ondrejov�ch.");
				
				String ondrej = sc.nextLine();
				int pozicia = Arrays.binarySearch(rodina, ondrej);
				if (pozicia >=0) {
					System.out.println("Toto je �lovek z rodiny Ondrejov�ch");
				}
				else {
					System.out.println("Tento �lovek nepatr� medzi Ondrejovcov!");
				}
			
				System.out.println("");
				
	//Po��tadlo priemeru
			System.out.print("Zadaj po�et ��sel, z ktor�ch chce� vypo��ta� priemer: ");	
			int pocet = Integer.parseInt(sc.nextLine());
			
			float [] cisla = new float [pocet];
			
			for (int k = 0; k < pocet; k++) {
				System.out.printf("Zadaj %d ��slo: ", k + 1);
				cisla[k] = Float.parseFloat(sc.nextLine());
			}
			
			float sucet = 0;
			for (float k : cisla) {
				sucet += k;
			}
			
			float priemer = sucet / cisla.length;
			
			System.out.printf("Priemer tvojich zn�mok je: %f", priemer);
			
	
	}

}
