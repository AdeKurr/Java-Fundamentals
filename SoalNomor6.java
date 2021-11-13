import java.util.Scanner;

public class SoalNomor6 {
	public static void main(String[] args) throws Exception {
		System.out.println("=====TUGAS MINGGUAN 17 SEPTEMBER NO.6=====");
		Scanner in = new Scanner (System.in);
		System.out.println("Masukan jumlah maksimal deret: ");
		int input = in.nextInt();
		int fib1 = 1;
		int fib2 = 1;
		int fibn = 1;
		
		for (int i=1; i<=input; i++) {
			System.out.print(fib2+" ");
			fibn = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibn;
		}
	}
}