package com.muhammet;

import com.muhammet.entity.Kullanici;

import static com.muhammet.utility.Veri.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
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
         *
         */



    }
}
