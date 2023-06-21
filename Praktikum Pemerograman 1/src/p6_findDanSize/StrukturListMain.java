package p6_findDanSize;

public class StrukturListMain {

	public static void main(String[] args) {
		StrukturList SLM = new StrukturList();

//		TUGAS
		System.out.println("tampilan awal");
		SLM.addHEAD(7);
		SLM.addHEAD(3);
		SLM.addHEAD(4);
		SLM.addTail(8);
		SLM.addTail(1);
		SLM.addTail(9);
		SLM.tampilElement();
		System.out.println("setelah di hapus");
		SLM.removeAll();
		SLM.tampilElement();
	}
}
