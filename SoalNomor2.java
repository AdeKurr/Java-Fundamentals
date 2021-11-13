import java.util.Scanner;

public class SoalNomor2 {
	public static void main (String [] args) {
		System.out.println("=====TUGAS MINGGUAN 17 SEPTEMBER NO.2=====");
		
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan nama:");
		String exit = "Exit";
		String n = ("");
		String init = ("");
		while (in.hasNextLine()){
		String userInput = in.nextLine();		
			if (!userInput.equalsIgnoreCase(exit) ) {
				String nama = userInput + " ";
				n = n+" "+ userInput;
				init = init.substring(0)+userInput;
			}else {
				System.out.println("Inisial "+ n +" adalah "+init.charAt(0));
			}
		}
		System.out.println("end");
	}
}
