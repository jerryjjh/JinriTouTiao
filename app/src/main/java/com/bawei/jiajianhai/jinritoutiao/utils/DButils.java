package com.bawei.jiajianhai.jinritoutiao.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/17
 */

public class DButils extends SQLiteOpenHelper {
    public DButils(Context context) {
        super(context, "toutiao", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql="create table news(_id Integer primary key autoincrement,type Integer,url text,title text," +
                " time text,_from text,image1 text,image2 text,image3 text)";
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
