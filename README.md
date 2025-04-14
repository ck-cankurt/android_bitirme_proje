# Çocuk Kaybolmalarında Veli Yardımcısı

Bu proje, Trakya Üniversitesi Bilgisayar Teknolojileri Bölümü bitirme projesi olarak geliştirilmiştir.
Proje Raporu :
* https://github.com/ck-cankurt/android_bitirme_proje/blob/c299453576ef184325a31197b39626f7c3710e42/docs/SON_RAPOR_Redaksiyon.pdf

## İstatistiksel Analiz

### Kayıp Çocuk İstatistikleri Dashboard'u
![image](https://github.com/user-attachments/assets/db5cd107-6fe5-468e-99ad-40fda0557a31)



## Uygulama Mimarisi ve Akış

### Kullanıcı Akış Şeması
```mermaid
flowchart TB
    Start((Başlangıç)) --> Login{Giriş}
    Login -->|Başarılı| Dashboard[Ana Ekran]
    Login -->|Başarısız| Register[Kayıt Ol]
    Register --> Login
    
    Dashboard --> Prevention[Önleme]
    Dashboard --> Emergency[Acil Durum]
    Dashboard --> Settings[Ayarlar]
    
    Prevention --> P1[Uzman Görüşleri]
    Prevention --> P2[Güvenlik Önlemleri]
    Prevention --> P3[Risk Faktörleri]
    Prevention --> P4[Konum Takibi]
    
    Emergency --> E1[Asayiş Araması]
    Emergency --> E2[Hastane Sorgusu]
    Emergency --> E3[Yakın Karakollar]
    Emergency --> E4[Acil Bildirim]
```

### Sistem Mimarisi
```mermaid
classDiagram
    class MainActivity {
        -WebView webView
        -DatabaseHelper dbHelper
        -SharedPreferences prefs
        +onCreate()
        +onResume()
        +loadContent()
        +handleIntent()
    }
    
    class WebViewClient {
        +shouldOverrideUrlLoading()
        +onPageFinished()
        +onPageStarted()
        +onReceivedError()
    }
    
    MainActivity --> WebViewClient
    MainActivity --> DatabaseHelper
    MainActivity --> ApiService
```

### Performans Metrikleri
![image](https://github.com/user-attachments/assets/2559f0d2-f917-4842-a04d-34c2ca95da16)



## Özellikler

### Önleme Modülü
- Uzman görüşleri ve tavsiyeleri
- Güvenlik önlemleri rehberi
- Risk faktörleri analizi
- Gerçek zamanlı konum takibi
- Güvenli bölge tanımlama

### Acil Durum Modülü
- Hızlı bildirim sistemi
- Asayiş.gov.tr entegrasyonu
- E-devlet ve SABİM entegrasyonu
- Hastane sorgulama
- Yakın karakol/hastane haritası
- SOS butonu

### Raporlama
- İstatistiksel analizler
- Durum takibi
- PDF rapor oluşturma
- Veri senkronizasyonu

## Teknik Detaylar

### Geliştirme Ortamı
- Android Studio 1.5
- Java SE Development Kit 8u77
- Minimum Android API: 16 (4.1.2)
- WebView komponenti
- Material Design UI

### Veritabanı
- SQLite
- Offline-first yaklaşımı
- Veri senkronizasyonu

### API Entegrasyonları
- Asayiş.gov.tr API
- E-devlet API
- SABİM API
- Google Maps API

## Proje Yapısı

```
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   ├── res/
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle
├── docs/
│   ├── api/
│   ├── architecture/
│   └── user-guide/
├── assets/
│   └── images/
└── README.md
```

## Katkıda Bulunanlar

- Can KURT
- Trakya Üniversitesi Bilgisayar Teknolojileri Bölümü

## Lisans

Bu proje akademik bir çalışmadır. Tüm hakları saklıdır.
