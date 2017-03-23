package com.bawei.jiajianhai.jinritoutiao.fragment;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.bawei.jiajianhai.jinritoutiao.R;
import com.bawei.jiajianhai.jinritoutiao.ShipinBean.Shipin;
import com.bawei.jiajianhai.jinritoutiao.utils.ImageUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;
import com.nostra13.universalimageloader.core.ImageLoader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/22
 */

public class Fragmeng_shipin extends Fragment {

    private String url;
    private ArrayList<Shipin> list_v;
    private PullToRefreshListView pullToRefreshListView;
    private String name;
    private View view;
    private MyAdapterf adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_shipin_layout,null);
        pullToRefreshListView = (PullToRefreshListView) view.findViewById(R.id.ptrefresh);

        Bundle bundle=getArguments();
        url = bundle.getString("key");
        name = bundle.getString("name");
        /*ArrayList<String> datas=new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            datas.add("列表展示：" + i);
        }
        pullToRefreshListView.setAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, datas));*/
        getData();

        pullToRefreshListView.setAdapter(adapter);
        pullToRefreshListView.setMode(PullToRefreshBase.Mode.BOTH);
        pullToRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                Toast.makeText(getActivity(), "我在这里下拉刷新了", Toast.LENGTH_SHORT).show();
                pullToRefreshListView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        adapter.notifyDataSetChanged();
                        pullToRefreshListView.onRefreshComplete();
                    }
                }, 2000);


            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                Toast.makeText(getActivity(), "我在这里上拉加载了", Toast.LENGTH_SHORT).show();
                pullToRefreshListView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        adapter.notifyDataSetChanged();
                        pullToRefreshListView.onRefreshComplete();
                    }
                }, 2000);
            }
        });

        return view;
    }


    private void getData() {
        AsyncHttpClient httpClient = new AsyncHttpClient();

        httpClient.get(getContext(), url, new TextHttpResponseHandler() {

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
             //  Toast.makeText(getActivity(), "数据获取成功。。。", Toast.LENGTH_SHORT).show();
                try {
                    JSONObject jsonObject=new JSONObject(responseString);
                    JSONArray jsonArray = jsonObject.getJSONArray(name);

                    Gson gson=new Gson();
                    Type type=new TypeToken<ArrayList<Shipin>>(){}.getType();
                   list_v= gson.fromJson(jsonArray.toString(),type);
                    adapter = new MyAdapterf();
                  //  Toast.makeText(getActivity(), "数据获取成功。。。"+list_v.toString(), Toast.LENGTH_SHORT).show();





                } catch (JSONException e) {
                    e.printStackTrace();
                }




            }
        });

    }
    class MyAdapterf extends BaseAdapter{

        viewHolderf holderf;


        @Override
        public int getCount() {
            return list_v.size();
        }

        @Override
        public Object getItem(int i) {
            return list_v.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if(view==null){
                view=View.inflate(getActivity(),R.layout.item_shipin,null);
                holderf = new viewHolderf();
                holderf.video= (JCVideoPlayerStandard) view.findViewById(R.id.video);
                view.setTag(holderf);
            }else {
                holderf = (viewHolderf) view.getTag();
            }
            holderf.video.setUp(list_v.get(i).getMp4Hd_url(),list_v.get(i).getTitle());
            ImageLoader.getInstance().displayImage(list_v.get(i).getCover(),holderf.video.thumbImageView,ImageUtils.displayImageOptions(R.drawable.ic_launcher));
            //Toast.makeText(getContext(), list_v.get(i).getTitle(), Toast.LENGTH_SHORT).show();
            return view;
        }
    }
    class viewHolderf {
        JCVideoPlayerStandard video;
    }

    @Override
    public void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }

}
