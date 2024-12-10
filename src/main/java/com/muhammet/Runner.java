package com.muhammet;

import com.muhammet.entity.Kullanici;

import static com.muhammet.utility.Veri.*;

import java.util.List;
import java.util.stream.Collectors;

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
         * 3.
         */
    }
}
