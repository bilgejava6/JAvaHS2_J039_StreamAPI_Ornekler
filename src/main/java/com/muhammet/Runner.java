package com.muhammet;

import com.muhammet.entity.Kullanici;

import static com.muhammet.utility.Veri.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        /**
         * Temel Seviye Sorular
         */
        /**
         * 1. Aktif Kullanıcıları filtreleyerek bir başka listeye aktarın ve bu listeyi yazdırın
         * Cevap:
         *         List<Kullanici> aktifKullanicilar = null;
         *
         *         // Java17+ aktifKullanicilar = Veri.getKullaniciList().stream().filter(k-> k.isAktiflik()).toList();
         *         // Java17 öncesi aktifKullanicilar = Veri.getKullaniciList().stream().filter(k-> k.isAktiflik()).collect(Collectors.toList());
         *
         *         aktifKullanicilar = Veri.getKullaniciList().stream().filter(Kullanici::isAktiflik).toList();
         *
         *         System.out.println(aktifKullanicilar);
         */
        /**
         * 2. Kullanıcı listesinde var olan kullanıcıların adların başka bir listeye aktarıldığı ve bu ad listesinin
         * ekrana yazıldığı kodu yazınız.
         * CEVAP:
         *
         *       List<String> adList = getKullaniciList().stream().map(Kullanici::getAd).toList();
         *         System.out.println(adList);
         */
        /**
         * 3. Ankara da yaşan kullanıcıların listesini çıkartıp ekrana yazdırınız.
         * CEVAP:
         * List<Kullanici> ankaraKullanicilari = getKullaniciList().stream().filter(k-> k.getSehir().equals("Ankara")).toList();
         *         System.out.println(ankaraKullanicilari);
         */
        /**
         * 4. Yaşı 18 ve üzeri olan 65 yaşından küçük olanları listele
         * CEVAP:
         *
         *         List<Kullanici> calisabilirKulalnicilar = null;
         *         Long calisabilirKullaniciSayisi = 0L;
         *         Stream<Kullanici> kullaniciStream = getKullaniciList().stream().filter(k-> k.getYas()>17 && k.getYas()<65);
         *         // calisabilirKulalnicilar = kullaniciStream.toList();
         *         calisabilirKullaniciSayisi = kullaniciStream.count();
         */
        /**
         * 5. Kullanıcı adı A ile başlayan kullanıcıların listesini yazdırınız.
         * CEVAP:
         *         List<Kullanici> aIleBaslayanlar = getKullaniciList().stream().filter(k-> k.getAd().startsWith("A")).toList();
         *         System.out.println(aIleBaslayanlar);
         */
        /**
         * 6. Kullanıcıların yaşlarının toplamı nedir?
         * CEVAP:
         *         int yasToplami = getKullaniciList().stream().mapToInt(Kullanici::getYas).sum();
         *         OptionalDouble yasOrtalamasi = getKullaniciList().stream().mapToInt(Kullanici::getYas).average();
         *         System.out.println("kullanıcı yaş toplamı....: "+ yasToplami);
         *         yasOrtalamasi.ifPresent(System.out::println);
         *         yasOrtalamasi.ifPresent(o->System.out.println((int)o));
         */
        /**
         * 7. Kullanıcıların yaşlarına göre sıralanmasını istiyorum ancak ilk 3 kişiyi listelemeniz gerekli.
         * İPUCU: sorted, limit
         * CEVAP:
         *
         *         List<Kullanici> enKucuk3Kullanici = getKullaniciList().stream()
         *                 .sorted(Comparator.comparingInt(Kullanici::getYas))
         *                 .limit(3)
         *                 .toList();
         *         System.out.println(enKucuk3Kullanici);
         */
        /**
         * 8. Kullanıcıların adlarını ve soyadlarını büyük harfe çevirip listeyelin.
         * CEVAP:
         *         List<String> adSoyadlistesi = getKullaniciList().stream()
         *                         .map(k-> k.getAd().toUpperCase()+" "+ k.getSoyad().toUpperCase()).toList();
         *         adSoyadlistesi.forEach(System.out::println);
         *         System.out.println("""
         *
         *                 ---------------------------------------
         *
         *                 """);
         *         getKullaniciList().stream().map(k->{
         *             String adSoyad = k.getAd().concat(" ").concat(k.getSoyad());
         *             return adSoyad.toUpperCase();
         *         }).forEach(System.out::println);
         */
        /**
         * 9. Bir kullanıcının var olup olmadığını bulunuz. var ise vardır diyelim.
         * ipucu: anyMatch()
         * CEVAP:
         *         Scanner scanner = new Scanner(System.in);
         *         System.out.print("Aranılan kullanıcı adı....: ");
         *         String ad = scanner.nextLine();;
         *         boolean kullaniciVarMi= false;
         *         kullaniciVarMi = getKullaniciList().stream().anyMatch(k-> k.getAd().equalsIgnoreCase(ad));
         *         if(kullaniciVarMi) System.out.println("Kullanıcı vardır");
         *         else System.out.println("Kullanıcı bulunamadı.");
         */
        /**
         * 10. Kullanıcıları il bilgilerine göre gruplayalım. yani Map<String, List<Kullanıcı>>
         *     CEVAP:
         *             Map<String,List<Kullanici>> kullaniciIlListesi = getKullaniciList().stream()
         *                 .collect(Collectors.groupingBy(Kullanici::getSehir));
         *         System.out.println(kullaniciIlListesi);
         */
        /**
         * ÖDEV:
         * Orta Seviyede Alıştırmalar
         * 	11.	Soyadı “Yılmaz” olan kullanıcıları listele.
         * 	12.	Yaşı en küçük kullanıcıyı bul.
         * 	•	min() ile yaşı en küçük kullanıcıyı bulun.
         * 	13.	Yaşı en büyük kullanıcıyı bul.
         * 	•	max() ile yaşı en büyük kullanıcıyı bulun.
         * 	14.	Şehirdeki kullanıcı sayısını hesapla.
         * 	•	Her şehirde kaç kullanıcı olduğunu bulun.
         * 	15.	Yaşı 18’den küçük olanları farklı bir listeye topla.
         * 	16.	Adı ve soyadı birleşik bir liste oluştur.
         * 	•	Örneğin, “Ali Kaya” şeklinde bir liste oluşturun.
         * 	17.	Aktif olmayan kullanıcıların toplam yaşını bul.
         * 	18.	Kullanıcıları yaşlarına göre sıralayıp yaşları bir listeye topla.
         * 	19.	Her şehre göre kullanıcıların adlarının listesini oluştur.
         * 	20.	Yaşı çift olan kullanıcıların adlarını listele.
         *
         * İleri Seviyede Alıştırmalar
         * 	21.	Tüm kullanıcılar aktif mi?
         * 	•	allMatch() kullanarak tüm kullanıcıların aktif olup olmadığını kontrol edin.
         * 	22.	Yaşı 20 ile 30 arasında olan kullanıcıları listele.
         * 	23.	Kullanıcıların adlarını ters sırada listele.
         * 	•	Adları alfabetik olarak ters sırada sıralayın.
         * 	24.	Her şehrin en genç kullanıcısını bul.
         * 	25.	Kullanıcı sayısı 3’ten fazla olan şehirleri bul.
         * 	26.	Kullanıcıların soyadlarının uzunluklarını topla.
         * 	27.	Yaşı 30’dan küçük olanların adlarını bir String’e birleştir.
         * 	•	Örneğin: "Ali, Ayşe, Mehmet"
         * 	28.	Her yaştaki kullanıcıların sayısını hesapla.
         * 	29.	Yaşı benzersiz bir şekilde listele.
         * 	•	distinct() kullanarak yaşları benzersiz olarak listeleyin.
         * 	30.	Yaşı 18’den küçük olan bir kullanıcı var mı?
         * 	•	anyMatch() kullanarak kontrol edin.
         */

    }
}
