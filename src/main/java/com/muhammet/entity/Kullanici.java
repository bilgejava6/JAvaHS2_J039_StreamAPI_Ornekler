package com.muhammet.entity;

public class Kullanici {
    private Long id;
    private String ad;
    private String soyad;
    private int yas;
    private String sehir;
    private boolean aktiflik;

    public Kullanici(Long id, String ad, String soyad, int yas, String sehir, boolean aktiflik) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.sehir = sehir;
        this.aktiflik = aktiflik;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kullanici{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append(", yas=").append(yas);
        sb.append(", sehir='").append(sehir).append('\'');
        sb.append(", aktiflik=").append(aktiflik);
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public boolean isAktiflik() {
        return aktiflik;
    }

    public void setAktiflik(boolean aktiflik) {
        this.aktiflik = aktiflik;
    }
}
