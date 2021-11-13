import java.util.Scanner;

public class SoalNomor4 {
	public static void main(String[] args) {
		System.out.println("=====TUGAS MINGGUAN 17 SEPTEMBER NO.4=====");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan tinggi persegi:");
		int input = in.nextInt();
			
		for(int tinggi=0;tinggi<input; tinggi++) {
			for (int spasi=input; spasi>(tinggi+1);spasi--) {
				System.out.print(" ");
			}
			for (int spasi=0;spasi<(tinggi+1);spasi++) {
				System.out.print(tinggi+1-spasi);
			}
			System.out.println();
		}
		
}
}
