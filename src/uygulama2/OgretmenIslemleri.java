package uygulama2;

import java.util.ArrayList;

public class OgretmenIslemleri implements Islemler<Ogretmen> {

	private ArrayList<Ogretmen> ogretmenler = new ArrayList<>();

	@Override
	public boolean kaydet(Ogretmen t) {
		boolean durum = ogretmenler.add(t);
		return durum;
	}

	@Override
	public boolean sil(Ogretmen t) {
		boolean durum = ogretmenler.remove(t);
		return durum;
	}

	@Override
	public void listele() {

		for (Ogretmen ogretmen : ogretmenler) {

			System.out.println(ogretmen);
		}

	}
	
	public ArrayList<Ogretmen> getOgretmenler() {
		return ogretmenler;
	}

}
