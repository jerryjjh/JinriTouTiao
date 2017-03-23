package com.bawei.jiajianhai.jinritoutiao.fragment;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.bawei.jiajianhai.jinritoutiao.R;
import com.bawei.jiajianhai.jinritoutiao.adapter.MyAdapter;
import com.bawei.jiajianhai.jinritoutiao.bean.Bean;
import com.bawei.jiajianhai.jinritoutiao.bean.DataBeanX;
import com.google.gson.Gson;
import com.liaoinstan.springview.container.AliFooter;
import com.liaoinstan.springview.container.MeituanFooter;
import com.liaoinstan.springview.container.MeituanHeader;
import com.liaoinstan.springview.container.RotationHeader;
import com.liaoinstan.springview.widget.SpringView;

import java.io.IOException;
import java.util.ArrayList;

import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.methods.HttpGet;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;
import cz.msebera.android.httpclient.util.EntityUtils;

import static com.bawei.jiajianhai.jinritoutiao.R.drawable.ic_launcher;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/18
 */

public class Framgentzong extends Fragment {

    private ListView listView;
    private ArrayList<DataBeanX> datas;
    private String url;
    private SpringView springView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.f1_layout,null);
        springView = (SpringView) view.findViewById(R.id.springview);
        listView = (ListView) view.findViewById(R.id.fragment_listview);
        springView.setType(SpringView.Type.FOLLOW);
        RotationHeader header = new RotationHeader(getActivity());
        springView.setHeader(header);
        springView.setFooter(new MeituanFooter(getActivity()));

        Bundle bundle=getArguments();
        url = bundle.getString("key");

        MyAsyncTask task=new MyAsyncTask();
        task.execute();


        springView.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {

                springView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        shipei(datas);
                        springView.onFinishFreshAndLoad();
                    }
                },1000);
            }

            @Override
            public void onLoadmore() {
                springView.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        springView.onFinishFreshAndLoad();
                    }
                },1000);
            }
        });
        return view;
    }
    class MyAsyncTask extends AsyncTask<String,Integer,String>{

        @Override
        protected String doInBackground(String... strings) {
            HttpClient httpclient=new DefaultHttpClient();
            HttpGet get=new HttpGet(url);
            try {
                HttpResponse response = httpclient.execute(get);
                HttpEntity entity = response.getEntity();
                String s = EntityUtils.toString(entity);

                return s;

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                Gson gson=new Gson();
                Bean bean = gson.fromJson(s, Bean.class);
                datas = (ArrayList<DataBeanX>) bean.getData();

                shipei(datas);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }
    }

    private void shipei(ArrayList<DataBeanX> datas) {

          listView.setAdapter(new MyAdapter(getActivity(),datas));

    }
}

