package id.ac.undiksha.siak.people;

public class Dosen extends Manusia{
	
	private String nip;
	private String matakuliah;
	
	public Dosen() {
		this.nip		="<199745>";
		this.matakuliah	="<Mata Kuliah: Pemrograman Berorientasi Objek>";
	}
	
	
	
	public Dosen(
			String nip, 
			String matakuliah, 
			String nama, 
			String alamat,  
			String tanggalLahir, 
			boolean jenisKelamin
		) {
		super();
		this.nip = nip;
		this.matakuliah = matakuliah;
	}



	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public String getNip() {
		return this.nip;
	}


	public String getMatakuliah() {
		return matakuliah;
	}

	public void setMatakuliah(String matakuliah) {
		this.matakuliah = matakuliah;
	}
	
	public void printAll() {
		System.out.println (this.getNip());
		System.out.println (this.getMatakuliah());
		
	}



	public void setJenisKelamin(boolean jenisKelamin) {
		// TODO Auto-generated method stub
		
	}

	
	
}