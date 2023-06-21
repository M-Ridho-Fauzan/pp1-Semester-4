package pert8;

public class ListMkTest {
	public static void main(String[] args) {
		StrukturListMHS run = new StrukturListMHS();

		MataKuliah MHS1 = new MataKuliah("Asep Saepul", "2100", 1);
		MataKuliah MHS2 = new MataKuliah("Arif Saepul", "2101", 2);
		MataKuliah MHS3 = new MataKuliah("Yoga Saepul", "2102", 3);

		run.addTail(MHS1);
		run.addTail(MHS2);
		run.addTail(MHS3);

		run.displayElement();
	}
}