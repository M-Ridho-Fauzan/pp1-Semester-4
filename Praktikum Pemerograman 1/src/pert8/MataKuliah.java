package pert8;

public class MataKuliah {
	private String Kode;// namaMhs
	private String Nama;// nrpMhs
	private int SKS;

	public MataKuliah(String Kode, String Nama, int SKS) {
		super();
		this.Kode = Kode;
		this.Nama = Nama;
	}

//	Setter & Getter

//	======= Kode
	public String getKode() {
		return Kode;
	}

	public void setKode(String Kode) {
		this.Kode = Kode;
	}

//	======= Nama
	public String getNama() {
		return Nama;
	}

	public void setNama(String Nama) {
		this.Nama = Nama;
	}

//	======== SKS
	public int getSKS() {
		return SKS;
	}

	public void setSKS(int SKS) {
		this.SKS = SKS;
	}
}