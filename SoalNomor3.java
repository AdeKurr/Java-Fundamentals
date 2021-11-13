import java.util.Scanner;

public class SoalNomor3 {
	public static void main(String[] args) {
		System.out.println("=====TUGAS MINGGUAN 17 SEPTEMBER NO.3=====");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan tinggi persegi:");
		int step = in.nextInt();
		
		for (int tinggi=0; tinggi<step;tinggi++) {
			for (int spasi=0; spasi<(tinggi+1);spasi++) {
				System.out.print("*");
			}
			for (int angka=0; angka<(step-tinggi-1);angka++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
}
}
