package com.bawei.jiajianhai.jinritoutiao.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bawei.jiajianhai.jinritoutiao.R;
import com.bawei.jiajianhai.jinritoutiao.adapter.ShouCangAdapter;
import com.bawei.jiajianhai.jinritoutiao.bean.News;
import com.bawei.jiajianhai.jinritoutiao.utils.DButils;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

import static java.lang.System.in;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/25
 */
public class Baoliao extends Activity {


    private SQLiteDatabase database;

    private ArrayList<News> list_news = new ArrayList<>();
    private ImageView backto;
    private EditText biaoti;
    private EditText fenxiang;
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private Button fabiao;
    private Button quxiao;
    private String bt;
    private String fx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baoliao_layout);
        DButils dButils = new DButils(this);
        database = dButils.getWritableDatabase();


        backto = (ImageView) findViewById(R.id.baoliao_image_backto);
        biaoti = (EditText) findViewById(R.id.baoliao_editext_biaoti);
        fenxiang = (EditText) findViewById(R.id.baoliao_editext_fenxiang);
        fabiao = (Button) findViewById(R.id.baoliao_button_fabiao);
        quxiao = (Button) findViewById(R.id.baoliao_button_quxiao);
        image1 = (ImageView) findViewById(R.id.baoliao_image_fabiao1);
        image2 = (ImageView) findViewById(R.id.baoliao_image_fabiao2);
        image3 = (ImageView) findViewById(R.id.baoliao_image_fabiao3);


        backto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        quxiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] items = new String[]{"拍照", "选择本地相册"};
                AlertDialog.Builder builder = new AlertDialog.Builder(Baoliao.this);
                builder.setTitle("请选择图片来源：");
                builder.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 0) {
                            Intent intent2 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                            startActivityForResult(intent2, 119);
                        } else {
                            Intent intent3 = new Intent();
            /* 开启Pictures画面Type设定为image */
                            intent3.setType("image/*");
      /* 使用Intent.ACTION_GET_CONTENT这个Action */
                            intent3.setAction(Intent.ACTION_GET_CONTENT);
      /* 取得相片后返回本画面 */
                            startActivityForResult(intent3, 114);

                        }
                    }
                });
                builder.create().show();
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] items = new String[]{"拍照", "选择本地相册"};
                AlertDialog.Builder builder = new AlertDialog.Builder(Baoliao.this);
                builder.setTitle("请选择图片来源：");
                builder.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 0) {
                            Intent intent2 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                            startActivityForResult(intent2, 112);
                        } else {
                            Intent intent3 = new Intent();
            /* 开启Pictures画面Type设定为image */
                            intent3.setType("image/*");
      /* 使用Intent.ACTION_GET_CONTENT这个Action */
                            intent3.setAction(Intent.ACTION_GET_CONTENT);
      /* 取得相片后返回本画面 */
                            startActivityForResult(intent3, 111);

                        }
                    }
                });
                builder.create().show();
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] items = new String[]{"拍照", "选择本地相册"};
                AlertDialog.Builder builder = new AlertDialog.Builder(Baoliao.this);
                builder.setTitle("请选择图片来源：");
                builder.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 0) {
                            Intent intent2 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                            startActivityForResult(intent2, 110);
                        } else {
                            Intent intent3 = new Intent();
            /* 开启Pictures画面Type设定为image */
                            intent3.setType("image/*");
      /* 使用Intent.ACTION_GET_CONTENT这个Action */
                            intent3.setAction(Intent.ACTION_GET_CONTENT);
      /* 取得相片后返回本画面 */
                            startActivityForResult(intent3, 118);

                        }
                    }
                });
                builder.create().show();
            }
        });


        fabiao.setOnClickListener(new View.OnClickListener() {

            private byte[] bytesimage3;
            private byte[] bytesimage2;
            private byte[] bytesimage1;

            @Override
            public void onClick(View view) {


                Bitmap drawingCache1 = Bitmap.createBitmap(image1.getDrawingCache());
                Bitmap drawingCache2 = Bitmap.createBitmap(image2.getDrawingCache());
                Bitmap drawingCache3 = Bitmap.createBitmap(image3.getDrawingCache());

                try {
                    FileOutputStream fileOutputStream=new FileOutputStream(new File(Environment.getExternalStorageDirectory().getPath(),"/image1"));



                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }


                bytesimage1 = convertBitmap2Bytes(drawingCache1);
                bytesimage2 = convertBitmap2Bytes(drawingCache2);
                bytesimage3 = convertBitmap2Bytes(drawingCache3);

                String stringimage1 = byteArrayToStr(bytesimage1);
                String stringimage2 = byteArrayToStr(bytesimage2);
                String stringimage3 = byteArrayToStr(bytesimage3);


                bt = biaoti.getText().toString();
                fx = fenxiang.getText().toString();
                Toast.makeText(Baoliao.this, "发表成功！", Toast.LENGTH_SHORT).show();
                Inserttype4(bt, "url", "我的发表", stringimage1, stringimage2, stringimage3);
                finish();
            }
        });

    }

    public long Inserttype4(String title, String url, String from, String bytesimage1, String bytesimage2, String bytesimage3) {

        ContentValues cv = new ContentValues();
        cv.put("type", 4);
        cv.put("url", url);
        cv.put("title", title);
        cv.put("_from", from);

        cv.put("image1", bytesimage1);
        cv.put("image2", bytesimage2);
        cv.put("image3", bytesimage3);

        return database.insert("news", null, cv);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 119:
                Bitmap paizhao = (Bitmap) data.getExtras().get("data");
                image1.setImageBitmap(paizhao);

                break;
            case 112:
                Bitmap paizhao2 = (Bitmap) data.getExtras().get("data");
                image2.setImageBitmap(paizhao2);
                break;
            case 110:
                Bitmap paizhao3 = (Bitmap) data.getExtras().get("data");
                image3.setImageBitmap(paizhao3);
                break;
            case 114:
                Uri uri = data.getData();
                ContentResolver cr = this.getContentResolver();
                try {
                    InputStream inputStream = cr.openInputStream(uri);
                    Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                    image1.setImageBitmap(bitmap);


                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 111:
                Uri uri2 = data.getData();
                ContentResolver cr2 = this.getContentResolver();
                try {
                    InputStream inputStream = cr2.openInputStream(uri2);
                    Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                    image2.setImageBitmap(bitmap);


                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 118:
                Uri uri3 = data.getData();
                ContentResolver cr3 = this.getContentResolver();
                try {
                    InputStream inputStream = cr3.openInputStream(uri3);
                    Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                    image3.setImageBitmap(bitmap);


                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    public Cursor chaxun() {
        Cursor cur = null;
        try {

            String sql = "select * from news ";

            cur = database.rawQuery(sql, null);
            while (cur.moveToNext()) {
                int _id = cur.getInt(0);
                int type = cur.getInt(1);
                String url = cur.getString(2);
                String title = cur.getString(3);
                String time = cur.getString(4);
                String from = cur.getString(5);
                String image1 = cur.getString(6);
                String image2 = cur.getString(7);
                String image3 = cur.getString(8);
                News n = new News(_id, type, url, title, time, from, image1, image2, image3);
                list_news.add(n);
            }

        } catch (Exception e) {
            cur = null;
            Log.e("SearchPhoto  Exception", e.getMessage());
            e.printStackTrace();
        }
        return cur;
    }

    public static byte[] convertBitmap2Bytes(Bitmap bm) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        bm.compress(Bitmap.CompressFormat.PNG, 100, baos);
        return baos.toByteArray();
    }

    public static byte[] strToByteArray(String str) {
        if (str == null) {
            return null;
        }
        byte[] byteArray = str.getBytes();
        return byteArray;
    }
    public static String byteArrayToStr(byte[] byteArray) {
        if (byteArray == null) {
            return null;
        }
        String str = new String(byteArray);
        return str;
    }

}
