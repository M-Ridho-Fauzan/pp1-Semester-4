package p4;

import java.util.Scanner;

public class Operasi {
	Node head;

	boolean isEmpty() {
		return (head == null);
	}

//	void createList() {
//	    Scanner input = new Scanner(System.in);
//	    System.out.println("Masukkan jumlah elemen yang ingin ditambahkan ke dalam list: ");
//	    int n = input.nextInt();
//	    for (int i = 0; i < n; i++) {
//	        System.out.println("Masukkan data ke-" + ( i + 1 ) + ": ");
//	        double dataBaru = input.nextDouble();
//	        tambahAkhir(dataBaru);
//	    }
//	    System.out.println("List telah berhasil dibuat!");
//	}

	void tambahDepan(double dataBaru) {// menambahkan data dari depan jika hitungan memakai ini tida akan ngurut malah
										// akan jadi hitung mundur
		Node tambahData = new Node(dataBaru);
		tambahData.setData(dataBaru);
		tambahData.setNext(null);
		if (isEmpty()) {
			head = tambahData;
		} else {
			tambahData.setNext(head);
			head = tambahData;
		}
		System.out.println("Data telah di tambahkan!!");
		System.out.println("==================================");
	}

	public void addMid(double data, int position) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node curNode = head;

			if (position == 1) {
				newNode.setNext(curNode);
				head = newNode;
			} else {
				Node posNode = null;
				int i = 1;

				while (curNode != null && i < position) {
					posNode = curNode;
					curNode = curNode.getNext();
					i++;
				}

				posNode.setNext(newNode);
				newNode.setNext(curNode);
			}
		}
	}

	void tambahAkhir(double dataBaru) {// menambahkan data dari belakang, jika hitungan agar ngurut pakai ini
		Node tambahData = new Node(dataBaru);
		tambahData.setData(dataBaru);
		tambahData.setNext(null);
		if (isEmpty()) {
			head = tambahData;
		} else {
			Node bantu = head;
			while (bantu.getNext() != null) {
				bantu = bantu.getNext();
			}
			bantu.setNext(tambahData);
		}
		System.out.println("Data telah di tambahkan!!");
		System.out.println("==================================");
	}

	void tampilData() {
		Node posisi = head;
		if (isEmpty()) {
			System.err.println("Data masih kosong !!");
		} else {
			System.out.print("Data nya Adalah: " + "\n");
			while (posisi != null) {
				System.out.println(posisi.getData() + ", ");
				posisi = posisi.getNext();
			}
		}
	}

	public static void main(String[] args) {
		Operasi op = new Operasi();
		Scanner input = new Scanner(System.in);

		System.out.print("Apakah Anda ingin melanjutkan (new/tidak)? ");
		String start = input.nextLine();
		if (start.equalsIgnoreCase("ya")) {
			System.out.println("Anda memilih ya.");
		} else if (start.equalsIgnoreCase("tidak")) {
			System.out.println("Anda memilih tidak.");
			System.exit(0);
		} else {
			System.err.println("Input tidak valid.");

		}

		// +++++++++++++++++++++++++++++++++++++++++++++++++++

		int option;
		do {

			System.out.println(" Selamat Datang..." + "\n===============================" + "\n DAFTAR MENU"
					+ "\n 1. Tambah Depan" + "\n 2. Tambah Tengah" + "\n 3. Tambah Akhir" + "\n 4. Tanpil Data"
					+ "\n 5. Keluar" + "\n Menu pilihan anda:" + "\n===============================");

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
