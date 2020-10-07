import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		
		int age = 0;
		Scanner sc = new Scanner (System.in);

		System.out.println("Masukkan umur anda:");
		age = sc.nextInt();

		if(age >= 17)
			System.out.print("Anda sudah boleh buat KTP");
	}
}

/*
Kode di atas digunakan untuk mencoba seleksi if untuk menguji suatu kondisi,
jika kondisi tersebut terpenuhi maka akan dilanjutkan, jika suatu kondisi tidak terpenuhi
maka akan diuji kondisi yang lain
*/