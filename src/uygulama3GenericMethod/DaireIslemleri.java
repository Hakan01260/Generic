package uygulama3GenericMethod;

public class DaireIslemleri implements Islemler<Daire> {

	private Daire daire;

	public DaireIslemleri() {

	}

	public DaireIslemleri(Daire daire) {

		this.daire = daire;
	}

	@Override
	public double alanHesapla() {

		double result = daire.getPI() * daire.getYariCap() * daire.getYariCap();

		return result;

	}

	@Override
	public double cevreHesapla() {

		double result = 2 * daire.getPI() * daire.getYariCap();

		return result;
	}

	@Override
	public double alanHesapla(Daire t) {

		double result = t.getPI() * t.getYariCap() * t.getYariCap();

		return result;
	}

	@Override
	public double cevreHesapla(Daire t) {

		double result = 2 * t.getPI() * t.getYariCap();

		return result;
	}

}
