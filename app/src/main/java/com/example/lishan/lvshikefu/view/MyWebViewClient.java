package com.example.lishan.lvshikefu.view;

import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.lykj.aextreme.afinal.utils.Debug;

public class MyWebViewClient extends WebViewClient {

    public boolean shouldOverrideUrlLoading(WebView webview, String url) {
        webview.loadUrl(url);
        return true;
    }

    public void onPageFinished(WebView view, String url) {
        CookieManager cookieManager = CookieManager.getInstance();
        String CookieStr = cookieManager.getCookie(url);
       Debug.e("Cookies"+"Cookies = " + CookieStr);
        super.onPageFinished(view, url);
    }

}