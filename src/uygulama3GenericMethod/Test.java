package uygulama3GenericMethod;

public class Test {

	public static void main(String[] args) {

		Daire daire1 = new Daire(5.3);

		DaireIslemleri daireIslemleri = new DaireIslemleri();

		double dairealan = daireIslemleri.alanHesapla(daire1);
		double dairecevre = daireIslemleri.cevreHesapla(daire1);

		System.out.println("Daire :");
		System.out.println("Alan :" + dairealan);
		System.out.println("Çevre :" + dairecevre);
		System.out.println();

		Kare kare1 = new Kare(7);

		KareIslemleri kareIslemleri = new KareIslemleri();

		double karealan = kareIslemleri.alanHesapla(kare1);
		double karecevre = kareIslemleri.cevreHesapla(kare1);

		System.out.println("Kare :");
		System.out.println("Alan :" + karealan);
		System.out.println("Çevre :" + karecevre);

		System.out.println("=======================");

		Daire daire2 = new Daire(8);
		DaireIslemleri daireIslemleri2 = new DaireIslemleri(daire2);

		System.out.println("Daire 2:");
		System.out.println("Alan :" + daireIslemleri2.alanHesapla());
		System.out.println("Çevre :" + daireIslemleri2.cevreHesapla());
		System.out.println();

		Kare kare2 = new Kare(2);
		KareIslemleri kareIslemleri2 = new KareIslemleri(kare2);
		System.out.println("Kare 2:");
		System.out.println("Alan :" + kareIslemleri2.alanHesapla());
		System.out.println("Çevre :" + kareIslemleri2.cevreHesapla());

		System.out.println("=======================");
		
		hesapla(daire1);
		hesapla(kare1);

	}

	public static <T> void hesapla(T t) {

		System.out.println(t);

	}

}
