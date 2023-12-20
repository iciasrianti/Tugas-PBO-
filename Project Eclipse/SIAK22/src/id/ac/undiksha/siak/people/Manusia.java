package id.ac.undiksha.siak.people;

public abstract class Manusia {
	private String nama;
	private String alamat;
	private String tanggalLahir;
	private boolean jenisKelamin;
 
	public Manusia() {
		this.nama			="<masukkan nama>";
		this.alamat			="<masukkan alamat>";
		this.tanggalLahir	="<masukkan tanggal lahir>";
	}

	public Manusia(
			String nama, 
			String alamat, 
			String tanggalLahir, 
			boolean jenisKelamin
		) {
		super();
		this.nama 			= nama;
		this.alamat 		= alamat;
		this.tanggalLahir 	= tanggalLahir;
		this.jenisKelamin 	= jenisKelamin;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public boolean isJenisKelamin() {
		return jenisKelamin;
	}
	
	public String getJenisKelamin() {
		if (this.isJenisKelamin()) {
			return "Perempuan";
		}else {
			return "Laki-laki";
		}
	}

	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	
	public void printAll() {
		System.out.println (this.getNama());
		System.out.println (this.getAlamat());
		System.out.println (this.getTanggalLahir());
		System.out.println (this.getJenisKelamin());
	}
	
}

