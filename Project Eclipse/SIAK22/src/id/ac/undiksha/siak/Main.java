package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Manusia;
import id.ac.undiksha.siak.people.Dosen;


public class Main {
	
	public static void main(String[] args) { //TODO
		
		/*Mahasiswa ani = new Mahasiswa();
		
		ani.setNim("12345");
		ani.setNama("Ani");
		ani.setAlamat("Singaraja");
		ani.setTanggalLahir("1 Januari 2000");
		ani.setJenisKelamin(true);
		ani.setProdi("Ilmu Komputer");*/
		
		Dosen agus = new Dosen();
		
		agus.setNip("199745");
		agus.setNama("AGUS");
		agus.setAlamat("Buton");
		agus.setTanggalLahir("08 Juli 1983");
		agus.setJenisKelamin(true);
		agus.setMatakuliah("Mata Kuliah: Pemrograman Berorientasi Objek");
		
		
		/*System.out.println (ani.getNim());
		System.out.println (ani.getNama());
		System.out.println (ani.getAlamat());
		System.out.println (ani.getTanggalLahir());
		System.out.println (ani.getJenisKelamin());
		System.out.println (ani.getProdi());*/
		
		System.out.println ("------------");
		
		System.out.println (agus.getNip());
		System.out.println (agus.getNama());
		System.out.println (agus.getAlamat());
		System.out.println (agus.getTanggalLahir());
		System.out.println (agus.getJenisKelamin());
		System.out.println (agus.getMatakuliah());
		
		System.out.println ("------------");
		
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.printAll();
		mhs1.getProdi().setKodeProdi("07");
		mhs1.getProdi().setNamaProdi("ILKOM");
		
		/*ani.nim 			="12345";
		ani.nama			= "Ani";
		ani.alamat			="Singaraja";
		ani.tanggalLahir	="1 januari 2000";
		ani.jenisKelamin	= true;
		ani.prodi			="Ilmu Komputer";
		
		System.out.println(ani.nim);
		System.out.println(ani.nama);
		System.out.println(ani.alamat);
		System.out.println(ani.tanggalLahir);
		System.out.println(ani.jenisKelamin);
		System.out.println(ani.prodi);*/
		System.out.println ("------------");
		
		Mahasiswa ici = new Mahasiswa(
				"Ici",
				"Pasarwajo",
				"07 Juli 2004",
				true,
				
				"2215101046",
				"ILMU KOMPUTER"
				);
		ici.printAll();
		
		
		System.out.println ("------------");
		
		Dosen fauzan = new Dosen(
				"199745",
				"Fauzan",
				"Buton",
				"Mata Kuliah: Pemrograman Berorientasi Objek",
				"08 Juli 1983",
				true
				
				);
		fauzan.printAll();
		
		System.out.println ("------------");
		
		Manusia mn1 = new Mahasiswa();
		mn1.printAll();
		
		System.out.println ("------------");
		
		/*Mahasiswa mhs1 = new Manusia();*/
		
				
	}
}
