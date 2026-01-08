import java.util.Scanner;

public class Atm {

	Login login = new Login();

	public void calis(Hesap hesap) { // fonksiyonun alacağı parametrenin veri tipi Hesap class'ı hesap ise sadece
										// isim. Yani oluşturacağımız objeleri buraya parametre olarak koyabileceğiz

		boolean giris = login.login(hesap);

		if (giris) {
			System.out.println("Giriş Başarılı");
			System.out.println(
					"Lütfen yapmak istediğiniz işlemi seçiniz: \n 1. Bakiye görmek için 1'e basınız. \n 2. Para yatırmak için 2'ye basınız. \n 3. Para çekmek için 3'e basınız. \n 4. Çıkış yapmak için 4'e basınız.");
			Scanner scanner = new Scanner(System.in);
			int islem = scanner.nextInt();

			do {
				if (islem == 1) {
					System.out.println("Bakiye: " + hesap.getBakiye());
					System.out.println(
							"Lütfen yapmak istediğiniz işlemi seçiniz: \n 1. Bakiye görmek için 1'e basınız. \n 2. Para yatırmak için 2'ye basınız. \n 3. Para çekmek için 3'e basınız. \n 4. Çıkış yapmak için 4'e basınız.");
					islem = scanner.nextInt();
				} else if (islem == 2) {
					System.out.println("Yatırmak istediğiniz tutarı giriniz.");
					int tutar = scanner.nextInt();
					hesap.paraYatirma(tutar);
					System.out.println(
							"Lütfen yapmak istediğiniz işlemi seçiniz: \n 1. Bakiye görmek için 1'e basınız. \n 2. Para yatırmak için 2'ye basınız. \n 3. Para çekmek için 3'e basınız. \n 4. Çıkış yapmak için 4'e basınız.");
					islem = scanner.nextInt();
				} else if (islem == 3) {
					System.out.println("Çekmek istediğiniz tutarı giriniz.");
					int tutar = scanner.nextInt();
					hesap.paraCek(tutar);
					System.out.println(
							"Lütfen yapmak istediğiniz işlemi seçiniz: \n 1. Bakiye görmek için 1'e basınız. \n 2. Para yatırmak için 2'ye basınız. \n 3. Para çekmek için 3'e basınız. \n 4. Çıkış yapmak için 4'e basınız.");
					islem = scanner.nextInt();
				} else if (islem == 4) {
					System.out.println("Çıkış yapılıyor...");
					scanner.close();
					break;
				} else {
					System.out.println("Geçersiz işlem.");
				}
			} while (true);

		} else {
			System.out.println("Giriş başarısız");
		}

	}

}
