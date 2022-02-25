package uygulama1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Ogretmen ogretmen1 = new Ogretmen("Hakan", "Erdoðan", 1999, "Java");
		Ogretmen ogretmen2 = new Ogretmen("Oðuzhan", "Elma", 2002, "Python");
		Ogretmen ogretmen3 = new Ogretmen("Baki", "Aykan", 1998, "C++");

		Ogrenci ogrenci1 = new Ogrenci("Furkan", "Alma", 2005, "20045");
		Ogrenci ogrenci2 = new Ogrenci("Asya", "Fer", 2008, "31245");

		Islemler<Ogretmen> islemOgretmen = new Islemler<Ogretmen>();

		islemOgretmen.kaydet(ogretmen1);
		islemOgretmen.kaydet(ogretmen2);
		islemOgretmen.kaydet(ogretmen3);
		System.out.println("Öðretmenler :");

		ArrayList<Ogretmen> ogretmenler = islemOgretmen.getListe();

		for (Ogretmen ogretmen : ogretmenler) {

			System.out.println(ogretmen.getAdi() + " " + ogretmen.getSoyadi());
		}

		System.out.println();

		Islemler<Ogrenci> islemOgrenci = new Islemler<>();

		islemOgrenci.kaydet(ogrenci2);
		islemOgrenci.kaydet(ogrenci1);
		System.out.println("Öðrenciler :");

		ArrayList<Ogrenci> ogrenciler = islemOgrenci.getListe();

		for (Ogrenci ogrenci : ogrenciler) {

			System.out.println(ogrenci.getAdi() + " " + ogrenci.getSoyadi());
		}

	}
}
