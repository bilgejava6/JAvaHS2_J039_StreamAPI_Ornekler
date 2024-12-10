package com.muhammet.utility;

import com.muhammet.entity.Kullanici;

import java.util.ArrayList;
import java.util.List;

public class Veri {
    public static List<Kullanici> getKullaniciList(){
        List<Kullanici> result = new ArrayList();
        result.add(new Kullanici(1L,"Mehmet","TAŞ",43,"Ankara",true));
        result.add(new Kullanici(2L,"Ayhan","TURAN",32,"İstanbul",true));
        result.add(new Kullanici(3L,"Ali","ALKIŞ",23,"İzmir",false));
        result.add(new Kullanici(4L,"Berkant","BAKAN",76,"Bursa",true));
        result.add(new Kullanici(5L,"Cemil","UÇSUZ",56,"Samsun",false));
        result.add(new Kullanici(6L,"Canan","KAYA",44,"Hatay",true));
        result.add(new Kullanici(7L,"Deniz","DEMİR",23,"Antalya",false));
        result.add(new Kullanici(8L,"Demet","ÖZGÜN",18,"Afyon",true));
        result.add(new Kullanici(9L,"Eylül","TAŞKIN",17,"Ankara",true));
        result.add(new Kullanici(10L,"Eymen","TURNA",29,"İstanbul",true));
        result.add(new Kullanici(11L,"Faruk","AKMAZ",25,"Ankara",false));
        result.add(new Kullanici(12L,"Gülay","BUZ",37,"İstanbul",true));
        result.add(new Kullanici(13L,"Hakan","OĞUZ",41,"Bursa",true));
        result.add(new Kullanici(14L,"Işıl","İLKER",54,"Edirne",false));
        result.add(new Kullanici(15L,"Kemal","TAŞ",42,"Erzurum",true));
        result.add(new Kullanici(16L,"Kevser","BAKAN",52,"Konya",true));
        result.add(new Kullanici(17L,"Leman","AYMAZ",87,"Sivas",false));
        result.add(new Kullanici(18L,"Oylum","KUŞ",19,"Karabük",true));
        result.add(new Kullanici(19L,"Öner","DEMİR",22,"Mersin",false));
        result.add(new Kullanici(20L,"Yeliz","KAYA",23,"Samsun",true));
        result.add(new Kullanici(21L,"Zeynep","KAYA",44,"Bursa",false));
        return result;
    }
}
