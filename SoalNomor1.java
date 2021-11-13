import java.util.Scanner;

public class SoalNomor1 {
	public static void main (String [] args) {
		System.out.println("=====TUGAS MINGGUAN 17 SEPTEMBER NO.1=====");
		
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan angka sepuasnya. Jika sudah puas masukkan X:");
		double x = 0;
		double y = 0;
		
		while (in.hasNextInt()) {
			double userInput = in.nextDouble();
			x =x + userInput;
			y++;
			}
		double avg = x/y;
		System.out.println("Rata-rata: "+avg);
		}
}
