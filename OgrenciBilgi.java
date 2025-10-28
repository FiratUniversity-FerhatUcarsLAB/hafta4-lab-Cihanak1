/*
 * Ad Soyad: Cihan Akalın	
 * Ogrenci No: 250541107	
 * Tarih: 24 Ekim 2025		
 * Aciklama: Ogrenci Bilgi Sistemi (Kullanicidan alinan veriyi formatli yazdirma kodu.)
 */


package odev_2;
import java.util.Scanner;
import java.util.Spliterators.AbstractDoubleSpliterator;
public class gorev1_1 {

	public static void main(String[] args) {
		// Başlık kısmımız
		System.out.println("=== OGRENCI BILGI SISTEMI ===");
		
		// 1. Scanner nesnesi oluşturuldu, klavyeden okumaya hazır.
		Scanner input = new Scanner(System.in);
		
		// Doğru girdi alabilmek adına bilgilendirme çıktısı
		System.out.print("Adinizi girin: ");
		String ad = input.next();
		
		// Doğru girdi alabilmek adına bilgilendirme çıktısı
		System.out.print("Soyadinizi girin: ");
		String soyad = input.next();
		
		// Doğru girdi alabilmek adına bilgilendirme çıktısı
		System.out.print("Ogrenci numaraniz: ");
		int ogrenciNo = input.nextInt();
		
		// Doğru girdi alabilmek adına bilgilendirme çıktısı
		System.out.println("Yasiniz: ");
		int yas = input.nextInt();
		
		// Doğru girdi alabilmek adına bilgilendirme çıktısı
		System.out.println("GPA (0.00-4.00): ");
		double gpa = input.nextDouble();
		final String Basarı = "Basarili Ogrenci";
		
		
	    System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
	    // %s -> String (metin)
        // %d -> int (tam sayı)
        // %.2f -> double - nokta sonrası 2 basamak göster.
		System.out.printf("Ad Soyad: %s %s\n", ad,soyad );
		System.out.printf("Öğrenci No: %d\n" , ogrenciNo );
		System.out.printf("Yaş: %d\n", yas);
		// GPA'nın 2 ondalık basamakla gösterilmesi zorunluluğu için %.2f kullandım.
		System.out.printf("GPA: %.2f\n" , gpa);
		// Sabit olarak tanımladığımız durumu yazdırıyorum.
		System.out.printf("Durum: %s\n" , Basarı );
	}

}
