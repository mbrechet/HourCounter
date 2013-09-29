package com.mbr.hourcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by fnzl2784 on 28/09/13.
 */
public class MainPage extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.xml.main_layout);
        WebView wv = (WebView)findViewById(R.id.webview);
        wv.loadUrl("file:///android_asset/html/index.html");
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        final JsWrapper jsWrapper = new JsWrapper(this,wv);
        wv.addJavascriptInterface(jsWrapper,"JsWrapper");

    }

}
