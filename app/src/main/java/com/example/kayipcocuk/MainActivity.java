package com.example.kayipcocuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        
        // Load local HTML content
        String htmlContent = "<html><body>" +
                            "<h1>Kayıp Çocuk Arama Uygulaması</h1>" +
                            "<div class='menu'>" +
                            "<button onclick='searchAsayis()'>Asayiş Üzerinden Arama</button>" +
                            "<button onclick='searchHealth()'>Sağlık Bakanlığı Üzerinden Arama</button>" +
                            "</div>" +
                            "</body></html>";
        
        webView.loadData(htmlContent, "text/html", "UTF-8");
    }
}