
public class Hesap { // para çekme, para yatırma

	private String kullaniciAdi;
	private String parola;
	private int bakiye;

	public Hesap(String kullaniciAdi, String parola, int bakiye) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.parola = parola;
		this.bakiye = bakiye;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public void paraYatirma(int miktar) {
		if (miktar <= 0) {
			System.out.println("Geçersiz Miktar");
		} else {
			this.bakiye += miktar;
			System.out.println("Yeni Bakiye:" + this.bakiye);
		}
	}

	public void paraCek(int miktar) {
		if (this.bakiye - miktar < 0) {
			System.out.println("Yetersiz Bakiye. \n Mevcut Bakiye: " + this.bakiye);
		} else {
			this.bakiye -= miktar;
			System.out.println("Yeni Bakiye: " + this.bakiye);
		}
	}

}
