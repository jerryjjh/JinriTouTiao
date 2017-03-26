package com.bawei.jiajianhai.jinritoutiao.activity;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bawei.jiajianhai.jinritoutiao.R;
import com.bawei.jiajianhai.jinritoutiao.adapter.ShouCangAdapter;
import com.bawei.jiajianhai.jinritoutiao.bean.News;
import com.bawei.jiajianhai.jinritoutiao.utils.DButils;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/24
 */
public class Shoucang extends Activity {

    private PullToRefreshListView listview;
    private SQLiteDatabase database;

    private ArrayList<News> list_news=new ArrayList<>();
    private ImageView backto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoucang_layout);
        listview = (PullToRefreshListView) findViewById(R.id.shoucang_PullToRefreshListView);

        backto = (ImageView) findViewById(R.id.shoucang_image_backto);
        DButils dButils = new DButils(this);
        database = dButils.getWritableDatabase();

        backto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        chaxun();
        listview.setAdapter(new ShouCangAdapter(this,list_news));
    }
    public Cursor chaxun(){
        Cursor cur = null;
        try{
            /**
             * _id Integer primary key autoincrement,type Integer,url text,title text," +
             " time text,_from text,image1 text,image2 text,image3 text
             *  private  String title;
             private  String time;
             private  String url;
             private  String from;
             private  String image1;
             private  String image2;
             private  String image3;
             */
            String sql = "select * from news ";

            cur = database.rawQuery(sql,null);
            while (cur.moveToNext()){
                int _id = cur.getInt(0);
                int type = cur.getInt(1);
                String url = cur.getString(2);
                String title = cur.getString(3);
                String time = cur.getString(4);
                String from = cur.getString(5);
                String image1 = cur.getString(6);
                String image2 = cur.getString(7);
                String image3 = cur.getString(8);
                News n=new News(_id,type,url,title,time,from,image1,image2,image3);
                list_news.add(n);
            }

        }catch (Exception e) {
            cur = null;
            Log.e("SearchPhoto  Exception",e.getMessage());
            e.printStackTrace();
        }
        return cur;
    }
}
