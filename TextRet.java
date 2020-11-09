import java.util.*;

public class TextRet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in, "UTF-8");
		
		//User input
		System.out.println("Zadaj vetu, ktorú chceš šifrova (bez diakritiky!)");
		String vstup = sc.nextLine().trim();
		
		//Cipher initialization
		String sprava = "";
		System.out.println("Zadaj k¾úè (èíslo od 1 do 9), pod¾a ktorého sa bude šifrova.");
		int posun = Integer.parseInt(sc.nextLine());
		
		while ((posun < 1) || (posun > 9)) {
			System.out.println("Zadali ste nevhodnı k¾úè");
			System.out.println("Zadajte k¾úè znova");
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
		System.out.println("Vaša šifrovaná správa je: " + sprava);
		}

	}

}
