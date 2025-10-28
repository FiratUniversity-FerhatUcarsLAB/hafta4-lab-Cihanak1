
/*
 * Ad Soyad: Cihan Akalın	
 * Ogrenci No: 250541107	
 * Tarih: 24 Ekim 2025		
 * Aciklama: Geometrik Hesap Kodu
 */



package odev_2;
import java.awt.im.InputContext;
import java.util.Scanner;
public class gorev2_1 {

	public static void main(String[] args) {
		// Scanner nesnesi tanımlandı.
		Scanner input = new Scanner(System.in);
		
		// Başlık kısmımız
		System.out.println("========================");
		System.out.println(" GEOMETRIK HESAPLAYICI"  );
		System.out.println("========================");
		final double pi = 3.14159;
		//Yaricap istenir
		System.out.println("Lütfen Bir Yarıcap giriniz(cm): ");
		double yaricap = input.nextDouble();
		System.out.println("  --Daire İçin Hesaplamalar--  ");
		//Hesaplama yaptırılıp çıktı alınır.
		double alan = yaricap * yaricap * pi;
	    System.out.printf("\n* Daire alanı: %.2f" , alan);
	    
	    //Sıra daire çevresinde
	    double cevre = 2 * yaricap * pi;
	    System.out.printf("\n* Daire Çevresi:  %.2f" , cevre);
	    
	    // Şimdi de çap hesabında 
	    double cap = 2 * yaricap;
	    System.out.printf("\nDaire capı:  %.2f" , cap);
	    
	    System.out.println("  \n\n** Küre İçin Hesaplamalar **  ");
	    //küre için olan bölüme geçiyoruz.
	    double kürehacmi = (4.0 / 3.0) * pi * Math.pow(yaricap, 3);
	    System.out.printf("\n* Küre Hacmi: %.2f " , kürehacmi);
	    
	    double alani = 4 * pi * Math.pow(yaricap, 2);
	    System.out.printf("\n* Küre Alanı: %.2f " , alani);
	    // Kodumuz burada bitti gerekli işlemler istenildiği gibi yapıldı.
	    System.out.println("\n\nİşlemler Başarıyla Yapıldı :)");
 	    
		
		
		
		
	}

}
