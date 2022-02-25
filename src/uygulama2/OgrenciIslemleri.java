package uygulama2;

import java.util.ArrayList;

public class OgrenciIslemleri implements Islemler<Ogrenci> {

	private ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();

	@Override
	public boolean kaydet(Ogrenci t) {

		boolean durum = ogrenciler.add(t);
		return durum;
	}

	@Override
	public boolean sil(Ogrenci t) {
		boolean durum = ogrenciler.remove(t);
		return durum;
	}

	@Override
	public void listele() {

		for (Ogrenci ogrenci : ogrenciler) {

			System.out.println(ogrenci);

		}
	}

	public ArrayList<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}

}
