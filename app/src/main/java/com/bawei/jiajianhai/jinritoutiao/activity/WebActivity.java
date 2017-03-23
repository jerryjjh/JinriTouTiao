package com.bawei.jiajianhai.jinritoutiao.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.bawei.jiajianhai.jinritoutiao.R;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/21
 */

public class WebActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_layout);
        Intent intent=getIntent();
        String url = intent.getStringExtra("url");

        WebView webView = (WebView) findViewById(R.id.webview_it);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setPluginState(WebSettings.PluginState.ON);

        webView.setVisibility(View.VISIBLE);

        webView.getSettings().setUseWideViewPort(true);
        

        webView.loadUrl(url);


    }
}
