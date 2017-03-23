package com.bawei.jiajianhai.jinritoutiao.adapter;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bawei.jiajianhai.jinritoutiao.R;
import com.bawei.jiajianhai.jinritoutiao.activity.WebActivity;
import com.bawei.jiajianhai.jinritoutiao.bean.DataBeanX;
import com.bawei.jiajianhai.jinritoutiao.utils.ImageUtils;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/19
 */
public class MyAdapter extends BaseAdapter {
    FragmentActivity activity;
    ArrayList<DataBeanX> datas;
    final int VIEW_TYPE = 4;
    final int TYPE_1 = 0;
    final int TYPE_2 = 1;
    final int TYPE_3 = 2;
    final int TYPE_4 = 3;
    private ViewHolder1 holder1;
    private ViewHolder2 holder2;
    private ViewHolder3 holder3;
    private ViewHolder4 holder4;

    public MyAdapter(FragmentActivity activity, ArrayList<DataBeanX> datas) {
        this.activity = activity;
        this.datas = datas;
    }

    @Override
    public int getItemViewType(int position) {
        if (datas.get(position).isHas_video()) {
            return TYPE_1;
        } else {
            if (!datas.get(position).isHas_image()) {
                return TYPE_2;
            } else {
                if (datas.get(position).isHas_image()&&datas.get(position).getImage_list().size() == 0) {
                    return TYPE_3;
                } else if (datas.get(position).getImage_list().size()==3) {
                    return TYPE_4;
                }
            }

        }
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return VIEW_TYPE;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int i) {
        return datas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        int type = getItemViewType(i);
        if (view == null) {
            switch (type) {
                case TYPE_1:
                    view = View.inflate(activity, R.layout.itme1, null);
                    holder1 = new ViewHolder1();
                    holder1.title1 = (TextView) view.findViewById(R.id.item1_text_title);
                    holder1.from1 = (TextView) view.findViewById(R.id.item1_text_from);
                    holder1.itemImage = (ImageView) view.findViewById(R.id.item1_image_shipintu);
                    holder1.shijian = (TextView) view.findViewById(R.id.item1_texe_shijian);
                    view.setTag(holder1);
                    break;
                case TYPE_2:
                    view = View.inflate(activity, R.layout.item2, null);
                    holder2 = new ViewHolder2();
                    holder2.title2 = (TextView) view.findViewById(R.id.item2_text_title);
                    holder2.from2 = (TextView) view.findViewById(R.id.item2_text_from);
                    //holder2 = new ViewHolder2();
                    view.setTag(holder2);
                    break;
                case TYPE_3:
                    view = View.inflate(activity, R.layout.itme3, null);
                    holder3 = new ViewHolder3();
                    holder3.title3 = (TextView) view.findViewById(R.id.item3_text_title);
                    holder3.from3 = (TextView) view.findViewById(R.id.item3_text_from);
                    holder3.itemImage3 = (ImageView) view.findViewById(R.id.item3_image_shipintu);

                    view.setTag(holder3);
                    break;
                case TYPE_4:
                    view = View.inflate(activity, R.layout.itme4, null);
                    holder4 = new ViewHolder4();
                    holder4.title4 = (TextView) view.findViewById(R.id.item4_text_title);
                    holder4.from4 = (TextView) view.findViewById(R.id.item4_text_from);
                    holder4.itemImage4_1 = (ImageView) view.findViewById(R.id.item4_image_1);
                    holder4.itemImage4_2 = (ImageView) view.findViewById(R.id.item4_image_2);
                    holder4.itemImage4_3 = (ImageView) view.findViewById(R.id.item4_image_3);
                    holder4.linear= (LinearLayout) view.findViewById(R.id.linear4);
                    view.setTag(holder4);
                    break;
            }

        } else {
            switch (type) {
                case TYPE_1:
                    holder1 = (ViewHolder1) view.getTag();
                    break;
                case TYPE_2:
                    holder2 = (ViewHolder2) view.getTag();
                    break;
                case TYPE_3:
                    holder3 = (ViewHolder3) view.getTag();
                    break;
                case TYPE_4:
                    holder4 = (ViewHolder4) view.getTag();
                    break;
            }


        }
        switch (type) {
            case TYPE_1:
                holder1.title1.setText(datas.get(i).getTitle());
                holder1.from1.setText(datas.get(i).getSource());
                int video_duration = datas.get(i).getVideo_duration();
                if(video_duration!=0){
                    int i1 = video_duration % 60;
                    if(i1<10){
                        String time="   "+video_duration/60+":"+"0"+i1;
                        holder1.shijian.setText(time);
                    }else {
                        String time="   "+video_duration/60+":"+i1;
                        holder1.shijian.setText(time);
                    }


                }


//                Log.i("sss",datas.get(i).getLarge_image_list().get(0).getUrl());
               ImageLoader.getInstance().displayImage(datas.get(i).getMiddle_image().getUrl(), holder1.itemImage, ImageUtils.displayImageOptions(R.mipmap.ic_qq_login_normal));
                holder1.itemImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(activity, WebActivity.class);
                        intent.putExtra("url",datas.get(i).getShare_url());
                        activity.startActivity(intent);

                        activity.overridePendingTransition(R.anim.enter,R.anim.exit);
                    }
                });
                holder1.title1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(activity, WebActivity.class);
                        intent.putExtra("url",datas.get(i).getUrl());
                        activity.startActivity(intent);

                        activity.overridePendingTransition(R.anim.enter,R.anim.exit);
                    }
                });
                break;
            case TYPE_2:
                holder2.title2.setText(datas.get(i).getTitle());
                holder2.from2.setText(datas.get(i).getSource());
                holder2.title2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(activity, WebActivity.class);
                        intent.putExtra("url",datas.get(i).getUrl());
                        activity.startActivity(intent);

                        activity.overridePendingTransition(R.anim.enter,R.anim.exit);
                    }
                });
                break;
            case TYPE_3:
                holder3.title3.setText(datas.get(i).getTitle());
                holder3.from3.setText(datas.get(i).getSource());
                ImageLoader.getInstance().displayImage(datas.get(i).getMiddle_image().getUrl(), holder3.itemImage3, ImageUtils.displayImageOptions(R.mipmap.ic_qq_login_normal));
                holder3.title3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(activity, WebActivity.class);
                        intent.putExtra("url",datas.get(i).getUrl());
                        activity.startActivity(intent);

                        activity.overridePendingTransition(R.anim.enter,R.anim.exit);
                    }
                });
                holder3.itemImage3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(activity, WebActivity.class);
                        intent.putExtra("url",datas.get(i).getUrl());
                        activity.startActivity(intent);

                        activity.overridePendingTransition(R.anim.enter,R.anim.exit);
                    }
                });
                break;
            case TYPE_4:
                holder4.title4.setText(datas.get(i).getTitle());
                holder4.from4.setText(datas.get(i).getSource());

                ImageLoader.getInstance().displayImage(datas.get(i).getImage_list().get(0).getUrl(), holder4.itemImage4_1, ImageUtils.displayImageOptions(R.mipmap.ic_qq_login_normal));
                ImageLoader.getInstance().displayImage(datas.get(i).getImage_list().get(1).getUrl(), holder4.itemImage4_2, ImageUtils.displayImageOptions(R.mipmap.ic_qq_login_normal));
                ImageLoader.getInstance().displayImage(datas.get(i).getImage_list().get(2).getUrl(), holder4.itemImage4_3, ImageUtils.displayImageOptions(R.mipmap.ic_qq_login_normal));

                holder4.linear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(activity, WebActivity.class);
                        intent.putExtra("url",datas.get(i).getUrl());
                        activity.startActivity(intent);

                        activity.overridePendingTransition(R.anim.enter,R.anim.exit);
                    }
                });
                break;
        }

        return view;
    }

    class ViewHolder1 {

        TextView title1;
        TextView from1;
        ImageView itemImage;
        TextView shijian;

    }

    class ViewHolder2 {
        TextView title2;
        TextView from2;
    }

    class ViewHolder3 {

        TextView title3;
        TextView from3;
        ImageView itemImage3;

    }

    class ViewHolder4 {
        TextView title4;
        TextView from4;
        ImageView itemImage4_1;
        ImageView itemImage4_2;
        ImageView itemImage4_3;
        LinearLayout linear;
    }
}
