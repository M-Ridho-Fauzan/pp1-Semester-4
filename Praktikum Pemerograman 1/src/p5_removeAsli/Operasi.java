package p5_removeAsli;

import java.util.Scanner;

public class Operasi {
	Node head;

//	p5 menambahkan ini

	private Node HEAD = null;
	private int position;

//	p5 sampai sini

	boolean isEmpty() {
		return (head == null);
	}

	void tambahDepan(int dataBaru) {
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

	public void addMid(int data, int position) {
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

	void tambahAkhir(int dataBaru) {
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

//	p5 menambahkan ini

	public void dispose(Node temp) {
		temp.next = null;
		temp = null;
	}

	public void removeHead() {
		if (isEmpty()) {
			System.out.println("List kosong");
		} else {
			Node temp = HEAD;
			HEAD = HEAD.getNext();
			dispose(temp);
		}
	}

	void removeMid(int x) {
		Node preNode = null;
		Node delNode = null;
		boolean ketemu = false;
		int i = 1;

		if (HEAD != null) {
			delNode = HEAD;

			while (delNode.next != null && !ketemu) {
				if (delNode.data == x) {
					ketemu = true;
				} else {
					preNode = delNode;
					delNode = delNode.next;
					i++;
				}
			}

			if (ketemu) {
				if (i == 1) {
					HEAD = null;
				} else {
					preNode.next = delNode.next;
					delNode = null;
				}
			}
		}
	}

	void removeTail() {
		Node preNode = null;
		Node lastNode;

		if (HEAD != null) {
			if (HEAD.getNext() == null) {
				HEAD = null;
			} else {
				lastNode = HEAD;
				while (lastNode.getNext() != null) {
					preNode = lastNode;
					lastNode = lastNode.getNext();

				}
//				Jika salah maka program di bawah akan mengeror kan diri sendiri
				preNode.setNext(null);
				dispose(lastNode);
			}
		}
	}

//	===============

	void removeAll() {
		System.err.println("!!  Yakin hapus semua data? (ya/tidak)  !!");
		Scanner input = new Scanner(System.in);
		String konfirmasi = input.nextLine();

		if (konfirmasi.equalsIgnoreCase("ya")) {
			head = null;
			System.out.println("Semua elemen telah dihapus!");
			System.out.println("==================================");
		} else {
			System.out.println("Penghapusan semua data dibatalkan.");
			System.out.println("==================================");
		}
	}

//	p5 sampai sini

	void tampilData() {
		Scanner input = new Scanner(System.in);
		Node posisi = head;
		if (isEmpty()) {
			System.err.println("Data masih kosong !!");
		} else {
			System.out.print("Data nya Adalah: " + "\n [ ");
			while (posisi != null) {
				System.out.print(+posisi.getData() + ", ");
				posisi = posisi.getNext();
			}
			System.out.print(" ]");
		}
	}

//	=============

	void pembuka() {
		Scanner input = new Scanner(System.in);
		String start = "";
		int count = 0;
		while (count < 3 && !start.equalsIgnoreCase("new") && !start.equalsIgnoreCase("tidak")) {
			System.out.print("Apakah Anda ingin melanjutkan" + "\n ('new' untuk melanjutkan)"
					+ "\n (Tidak untuk selesai)....? ");
			start = input.nextLine();
			if (start.equalsIgnoreCase("new")) {
				System.out.println("List berhasil di buat.");
			} else if (start.equalsIgnoreCase("tidak")) {
				System.out.println("Anda memilih tidak.");
				System.exit(0);
			} else {
				count++;
				if (count == 3) {
					System.err.println("Anda telah mencapai batas percobaan. Program akan keluar.");
					System.exit(0);
				}
				System.err.println("Input tidak valid. Anda memiliki " + (3 - count) + " percobaan lagi.");
				start = "";
			}
		}
	}
}
