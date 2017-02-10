package com.serkancura.serkancura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.widget.TextView;
import com.serkancura.serkancura.helper.Font;
import com.serkancura.serkancura.helper.WebViewLoader;

public class ContactUs extends AppCompatActivity {

    private WebView webView;
    private TextView toolBarTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        Font font = new Font();
        toolBarTextView = (TextView) findViewById(R.id.toolbarTextView);
        toolBarTextView.setText("İletişim");
        font.setFont(getApplicationContext(),toolBarTextView);

        webView = (WebView) findViewById(R.id.webViewContactUs);
        WebViewLoader webViewLoader = new WebViewLoader(webView);
        webViewLoader.setWebSettings();
        webViewLoader.setLoadUrl("file:///android_asset/contact_us.html");
        
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ContactUs.this,Home.class));
        finish();
    }
}
