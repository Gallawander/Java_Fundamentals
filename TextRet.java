import java.util.*;

public class TextRet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in, "UTF-8");
		
		//User input
		System.out.println("Zadaj vetu, ktor� chce� �ifrova� (bez diakritiky!)");
		String vstup = sc.nextLine().trim();
		
		//Cipher initialization
		String sprava = "";
		System.out.println("Zadaj k��� (��slo od 1 do 9), pod�a ktor�ho sa bude �ifrova�.");
		int posun = Integer.parseInt(sc.nextLine());
		
		while ((posun < 1) || (posun > 9)) {
			System.out.println("Zadali ste nevhodn� k���");
			System.out.println("Zadajte k��� znova");
			posun = Integer.parseInt(sc.nextLine());
		}
		
		if ((posun >= 1) && (posun <= 9)) {
			//Ciphering
			for (char vystup : vstup.toCharArray()) {
				int i = (int) vystup;
				i += posun;
				
				// Overflow control
				if (i > (int)'z') {
				    i -= 26;
				}
				char znak = (char) i;
				sprava += znak;
			}
		
		//Output
		System.out.println("Va�a �ifrovan� spr�va je: " + sprava);
		}

	}

}
