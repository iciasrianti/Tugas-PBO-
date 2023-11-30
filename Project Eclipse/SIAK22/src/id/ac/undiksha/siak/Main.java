package id.ac.undiksha.siak;


import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mahasiswa ici =  new Mahasiswa();
		
		ici.setNim("2215101046");
		ici.setNama("Ici");
		ici.setTanggalLahir("7 Juli 2004");
		ici.setJeniskelamin(true);
		ici.setProdi("Ilmu Komputer");
		ici.setAlamat("Singaraja");
		
		/*ani.nim = "2215092";
		ani.nama = "ani";
		ani.tanggalLahir = "1 Januari 2000";
		ani.jeniskelamin = true;
		ani.prodi = "Ilmu Komputer";
		ani.alamat = "Singaraja";
		*/
		
		System.out.println(ici.getNim());
		System.out.println(ici.getNama());
		System.out.println(ici.getTanggalLahir());
		System.out.println(ici.isJeniskelamin());
		System.out.println(ici.getProdi());
		System.out.println(ici.getAlamat());
		
		
		 Dosen dewi = new Dosen();
	        dewi.setNip("12345");
	        dewi.setNama_dosen("Dewi");
	        dewi.setAlamat("Denpasar");
	        dewi.setBidang_keahlian("Matematika");
	        dewi.setJenisKelamin(false);

	        
	        System.out.println(dewi.getNip());
	        System.out.println(dewi.getNama_dosen());
	        System.out.println(dewi.getAlamat());
	        System.out.println(dewi.getJenisKelamin());
	        System.out.println(dewi.getBidang_keahlian());
		
		
	}

}