package p4_imitasi2;

public class StrukturListTest {

	public static void main(String[] args) {
		StrukturList op = new StrukturList();

		op.tambahAkhir(3);
		op.tambahAkhir(4);
		op.addMid(7, 2);
		op.addMid(8, 2);
		op.tambahDepan(5);
		op.tampilData();

	}
}
