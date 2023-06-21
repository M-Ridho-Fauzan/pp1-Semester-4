package p4_imitasi;

import java.util.Scanner;

public class StrukturListTest {
	public static void main(String[] args) {
		Operasi op = new Operasi();
		Scanner input = new Scanner(System.in);

		op.pembuka();

		// +++++++++++++++++++++++++++++++++++++++++++++++++++

		int option;

		do {

			System.out.print(" Selamat Datang..." + "\n===============================" + "\n DAFTAR MENU"
					+ "\n 1. Tambah Depan" + "\n 2. Tambah Tengah" + "\n 3. Tambah Akhir" + "\n 4. Tanpil Data"
					+ "\n 5. Keluar" + "\n Menu pilihan anda: ");
			System.out.println("\n===============================");

			option = input.nextInt();

			switch (option) {
			case 1:
				System.out.println("Masukan data baru : ");
				double dataDepan = input.nextDouble();
				op.tambahDepan(dataDepan);
				break;
			case 2:
				System.out.println("Masukan data baru : ");
				double tambahMid = input.nextDouble();
				System.out.println("Masukan posisi data baru : ");
				int posMid = input.nextInt();
				op.addMid(tambahMid, posMid);
				break;
			case 3:
				System.out.println("Masukan Data Baru : ");
				double dataAkhir = input.nextDouble();
				op.tambahAkhir(dataAkhir);
				break;
			case 4:
				op.tampilData();
				System.out.println("==================================");
				break;
			case 5:
				System.out.println("Adios......");
				break;
			default:
				System.err.println("Invalid Option number Input!!!");
				break;
			}

		} while (option != 5);
		input.close();
	}
}
