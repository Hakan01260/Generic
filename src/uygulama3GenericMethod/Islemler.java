package uygulama3GenericMethod;

public interface Islemler<T> {

	public double alanHesapla();

	public double cevreHesapla();

	public double alanHesapla(T t);

	public double cevreHesapla(T t);

}
