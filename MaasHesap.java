/*
 * Ad Soyad: Cihan Akalın	
 * Ogrenci No: 250541107	
 * Tarih: 24 Ekim 2025		
 * Aciklama: Maaş Hesabı Kodu
 */


package odev_2;
import java.lang.classfile.constantpool.DoubleEntry;
import java.util.Scanner;
public class gorev3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Kişinin Adı
		System.out.println("Lütfen isminizi giriniz: ");
		String ad = input.nextLine();
		
		System.out.println("Lütfen soyisminizi giriniz: ");
		String soyad = input.nextLine();
		
		// İşlem yapabilmek adına brüt maaş girdisi isteği
		System.out.println("Lütfen Brüt Maaşınızı Giriniz: ");
		double maas = input.nextDouble();
		
		// haftalık çalışma saati
		System.out.println("Lütfen Günlük Çalışma Saatinizi Giriniz: ");
		int saat = input.nextInt();
		
		// Mesai saati girdisi
		System.out.println("Lütfen Mesai Saatinizi Giriniz: ");
		int mesai = input.nextInt();
		
		//Aylık çalışma gün sayısı
		System.out.printf("Aylık çalışma gün sayısı giriniz:  ");
		int ay = input.nextInt();
		
		
		System.out.println("===============================");
		System.out.printf("\nÇalışan adı soyadı: %s %s " ,  ad , soyad);
		System.out.println("\n===============================");
		
		// Mesai ücret işlemi
		double mesaiücreti = (maas / 160) * mesai * 1.5;
		System.out.printf("\nMesai Ücreti: %.2f" , mesaiücreti);
		
		//Toplam Gelir Çıktısı
		double toplamgelir = maas + mesaiücreti;
		
		//Kesintiler ile hesaplamalar
		double sgk = toplamgelir * 0.14;
		double gelirvergisi = toplamgelir * 0.15;
		double damgavergisi = toplamgelir * 0.00759;
		double toplamkesinti = sgk + gelirvergisi + damgavergisi;
		
		// Gelelim net maaş hesabına
		
		double netmaas = toplamgelir - toplamkesinti;
		System.out.printf("\nNet maaş: %.2f " , netmaas);
		
		//kesinti oranı
		double kesintiorani = (toplamkesinti / toplamgelir) * 100;
		System.out.printf("\nToplam kesinti oranı: %.2f " , kesintiorani);
		
		//saatlik net kazanç
		int ayliksaat = saat * 4;
		double saatlik = netmaas / ayliksaat;
		
		System.out.printf("\nSaatlik Net Kazanç: %.2f " , saatlik);
		
		//Günlük net kazanç hesabı
		double günlük = netmaas / ay;
		System.out.printf("\nGünlük net kazanç: %.2f " , günlük);
		
		
		
		
				
		
		

	}

}

