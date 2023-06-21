package p5_removeAsli;

import java.util.Scanner;

public class StrukturListTest {
	public static void main(String[] args) {
		Operasi op = new Operasi();
		Scanner input = new Scanner(System.in);

		op.pembuka();

		// +++++++++++++++++++++++++++++++++++++++++++++++++++

		int option;

		do {

			System.out.print("\n Selamat Datang..." + "\n===============================" + "\n DAFTAR MENU"
					+ "\n 1. Tambah Depan" + "\n 2. Tambah Tengah" + "\n 3. Tambah Akhir" + "\n ---- Menu Hapus ---- "
					+ "\n 4. Hapus Depan" + "\n 5. Hapus Belakang" + "\n 6. Hapus yang di pilih"
					+ "\n 7. Hapus semua data" + "\n ---- Menu System ---- " + "\n 8. Tanpil Data" + "\n 9. Keluar");
			System.out.println("\n===============================");
			System.out.print("\n Menu pilihan anda: ");
			option = input.nextInt();

			switch (option) {
			case 1:
				System.out.print("Masukan data baru : ");
				int dataDepan = input.nextInt();
				op.tambahDepan(dataDepan);
				break;
			case 2:
				System.out.print("Masukan data baru : ");
				int tambahMid = input.nextInt();
				System.out.print("Masukan posisi data baru : ");
				int posMid = input.nextInt();
				op.addMid(tambahMid, posMid);
				break;
			case 3:
				System.out.print("Masukan Data Baru : ");
				int dataAkhir = input.nextInt();
				op.tambahAkhir(dataAkhir);
				break;
			case 4:
				op.removeHead();
				System.out.println("Data bagian depan berhasil di hapus.." + "\n Data menjadi: \n");
				op.tampilData();
				break;
			case 5:
				op.removeTail();
				System.out.println("Data bagian belakang berhasil di hapus.." + "\n Data menjadi: \n");
				op.tampilData();
				break;
			case 6:
				System.out.println(" Pilih data yang mau di hapus \n");
				op.tampilData();
				System.out.print("\n Pilihan Anda: ");
				int hapusMid = input.nextInt();
				op.removeMid(hapusMid);
				System.out.println("Data berhasil di hapus.." + "\nData menjadi: \n");
				op.tampilData();
				break;
			case 7:
				op.removeAll();
				break;
			case 8:
				op.tampilData();
				break;
			case 9:
				System.out.println("Adios......");
				break;
			default:
				System.err.println("Invalid Option number Input!!!");
				break;
			}

		} while (option != 9);
		input.close();
	}
}
