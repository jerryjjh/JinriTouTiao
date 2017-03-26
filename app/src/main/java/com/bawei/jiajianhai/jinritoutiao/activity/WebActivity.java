package com.bawei.jiajianhai.jinritoutiao.activity;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bawei.jiajianhai.jinritoutiao.R;
import com.bawei.jiajianhai.jinritoutiao.utils.DButils;

import static com.liaoinstan.springview.R.attr.type;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/21
 */

public class WebActivity extends Activity implements View.OnClickListener {

    private EditText edittext;
    private ImageView fenxiang;
    private ImageView shoucang;
    private ImageView pinglun;
    private SQLiteDatabase database;
    private String title;
    private String from;
    private String time;
    private String image1;
    private String image2;
    private String image3;
    private String url;
    boolean shou_boolean = false;
    private int type;
    private ImageView webview_image_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_layout);
        getData();


        webview_image_back.setOnClickListener(this);
        edittext.setOnClickListener(this);
        fenxiang.setOnClickListener(this);
        shoucang.setOnClickListener(this);
        pinglun.setOnClickListener(this);


    }

    private void getData() {
        edittext = (EditText) findViewById(R.id.webview_editext_di);
        fenxiang = (ImageView) findViewById(R.id.webview_image_fenxiang);
        shoucang = (ImageView) findViewById(R.id.webview_image_shoucang);
        pinglun = (ImageView) findViewById(R.id.webView_image_pinglun);
        webview_image_back = (ImageView) findViewById(R.id.webview_image_back);
        Intent intent = getIntent();

        url = intent.getStringExtra("url");
        title = intent.getStringExtra("title");
        from = intent.getStringExtra("from");
        time = intent.getStringExtra("time");
        image1 = intent.getStringExtra("image1");
        image2 = intent.getStringExtra("image2");
        image3 = intent.getStringExtra("image3");

        type = intent.getIntExtra("type", 1);

        WebView webView = (WebView) findViewById(R.id.webview_it);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setPluginState(WebSettings.PluginState.ON);

        webView.setVisibility(View.VISIBLE);

        webView.getSettings().setUseWideViewPort(true);

        webView.loadUrl(url);
        DButils dButils = new DButils(this);

        database = dButils.getWritableDatabase();
        shou_boolean=ifShoucang(url);
        Toast.makeText(this, "shou_boolean"+shou_boolean, Toast.LENGTH_SHORT).show();
    }

    public void shoucang(int type) {
        switch (type) {
            case 0:
                Inserttype1(title, image1, url, time, from);
                break;
            case 1:
                Inserttype2(title, url, from);
                break;
            case 2:
                Inserttype3(title, url, image1, from);

                break;
            case 3:
                Inserttype4(title, url, from, image1, image2, image3);
                break;

        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.webview_editext_di:

                break;
            case R.id.webview_image_fenxiang:

                break;
            case R.id.webview_image_shoucang:

                if (!shou_boolean) {
                    shoucang(type);
                    Toast.makeText(this, "收藏成功！", Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(this, "取消收藏", Toast.LENGTH_SHORT).show();
                    quxiaoshoucang(url);
                }

                shou_boolean = !shou_boolean;
                break;
            case R.id.webView_image_pinglun:

                break;
            case R.id.webview_image_back:
                finish();
        }
    }

    public int quxiaoshoucang(String url) {

        String[] args = {String.valueOf(url)};
        return database.delete("news", "url=?", args);
    }

    public long Inserttype1(String title, String image1, String url, String time, String from) {

        ContentValues cv = new ContentValues();
        cv.put("type", 1);
        cv.put("url", url);
        cv.put("title", title);
        cv.put("time", time);
        cv.put("_from", from);
        cv.put("image1", image1);

        return database.insert("news", null, cv);

    }

    public long Inserttype4(String title, String url, String from, String image1, String image2, String image3) {

        ContentValues cv = new ContentValues();
        cv.put("type", 4);
        cv.put("url", url);
        cv.put("title", title);
        cv.put("_from", from);
        cv.put("image1", image1);
        cv.put("image2", image2);
        cv.put("image3", image3);

        return database.insert("news", null, cv);

    }

    public long Inserttype2(String title, String url, String from) {

        ContentValues cv = new ContentValues();
        cv.put("type", 2);
        cv.put("title", title);
        cv.put("url", url);
        cv.put("_from", from);
        return database.insert("news", null, cv);

    }

    public long Inserttype3(String title, String url, String image1, String from) {

        ContentValues cv = new ContentValues();
        cv.put("type", 3);
        cv.put("title", title);
        cv.put("url", url);
        cv.put("_from", from);
        cv.put("image1", image1);

        return database.insert("news", null, cv);

    }
    public boolean ifShoucang(String url){
        Toast.makeText(this, "url="+url, Toast.LENGTH_SHORT).show();
        String sql="select * from news where url= '"+url+"'";
        Cursor cursor = database.rawQuery(sql, null);
        if (cursor.moveToNext()){
            return  true;
        }else {

            return false;
        }


    }


}
