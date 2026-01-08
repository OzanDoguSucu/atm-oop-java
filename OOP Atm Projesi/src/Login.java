import java.util.Scanner;

public class Login {

	public boolean login(Hesap hesap) {

		// true ya da false değer döndürerek kullanıcı bilgilerinin eşleşmesini kontrol
		// edeceğiz.

		Scanner scanner = new Scanner(System.in);
		String kullaniciAdi;
		String parola;

		System.out.println("Kullanıcı Adı: ");
		kullaniciAdi = scanner.nextLine();
		System.out.println("Parola: ");
		parola = scanner.nextLine();

		if (hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)) {
			return true; // 1
		} else {
			return false; // 0
		}

	}

}
