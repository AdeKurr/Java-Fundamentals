import java.util.Scanner;

public class SoalNomor5 {
	public static void main(String[] args) {
		System.out.println("=====TUGAS MINGGUAN 17 SEPTEMBER NO.5=====");
		
		Scanner in=new Scanner(System.in);
		System.out.println("Masukan nomor telepon: ");
		String notel = in.nextLine();
		
		int length =String.valueOf(notel).length();
		if (length ==9) {
			String area = notel.substring(0,3);
			String depan = notel.substring(3,6);
			String belakang = notel.substring(6,9);
			System.out.println("("+area+")"+" "+depan+"-"+belakang);		
		}
		else if (length ==10) {
			String area = notel.substring(0,4);
			String depan = notel.substring(4,7);
			String belakang = notel.substring(7,10);
			System.out.println("("+area+")"+" "+depan+"-"+belakang);	
		}
		else if (length ==11) {
			String area = notel.substring(0,4);
			String depan = notel.substring(4,7);
			String belakang = notel.substring(7,11);
			System.out.println("("+area+")"+" "+depan+"-"+belakang);
		}
		else if (length>11 || length <9) {
			System.out.println("Nomor telepon tidak sah.");
		}
	}
}

