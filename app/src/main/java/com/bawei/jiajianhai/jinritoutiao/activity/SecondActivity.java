package com.bawei.jiajianhai.jinritoutiao.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bawei.jiajianhai.jinritoutiao.R;
import com.bawei.jiajianhai.jinritoutiao.fragment.Framgentzong;
import com.bawei.jiajianhai.jinritoutiao.utils.ImageUtils;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.gui.RegisterPage;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/3/14
 */
public class SecondActivity extends FragmentActivity {

    private ImageView benren;
    private ImageView serch;
    private ImageView shuaxin;
    private TabLayout tablatout;
    private ViewPager viewPager;
    Boolean flag2=false;
    String yejianmoshi = null;
    int yejianImageId = 0;
    private int theme = R.style.AppTheme;
    private ImageButton gengduo;
    private TextView yejian;
    private ImageView sli_image_yejian;
    private SlidingMenu slidingmenu;
    private Boolean flag = false;
    private String phone;
    private RelativeLayout relativeLayout;
    private TextView sli_text_myQQName;
    private ArrayList<Fragment> list_fragment = new ArrayList<Fragment>();
    private String[] titles = new String[]{"推荐", "热点", "本地", "社会", "娱乐", "科技", "汽车", "体育", "财经", "军事", "国际"};
    String[] urls = new String[]
            {"http://ic.snssdk.com/2/article/v25/stream/?count=20&min_behot_time=1455521444&bd_city=%E5%8C%97%E4%BA%AC%E5%B8%82&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455521401&loc_mode=5&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000",
                    "http://ic.snssdk.com/2/article/v25/stream/?category=news_hot&count=20&min_behot_time=1455521166&bd_city=%E5%8C%97%E4%BA%AC%E5%B8%82&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455521401&loc_mode=5&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&app_nme=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000",
                    "http://ic.snssdk.com/2/article/v25/stream/?category=news_local&count=20&min_behot_time=1455521226&bd_city=%E5%8C%97%E4%BA%AC%E5%B8%82&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455521401&loc_mode=5&user_city=%E5%8C%97%E4%BA%AC&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&ap_name=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000",
                    "http://ic.snssdk.com/2/article/v25/stream/?category=news_society&count=20&min_behot_time=1455521720&bd_city=%E5%8C%97%E4%BA%AC%E5%B8%82&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455522107&loc_mode=5&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000",
                    "http://ic.snssdk.com/2/article/v25/stream/?category=news_entertainment&count=20&min_behot_time=1455522338&bd_city=%E5%8C%97%E4%BA%AC%E5%B8%82&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455522784&loc_mode=5&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000",
                    "http://ic.snssdk.com/2/article/v25/stream/?category=news_tech&count=20&min_behot_time=1455522427&bd_city=%E5%8C%97%E4%BA%AC%E5%B8%82&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455522784&loc_mode=5&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000",
                    "http://ic.snssdk.com/2/article/v25/stream/?category=news_car&count=20&bd_city=%E5%8C%97%E4%BA%AC%E5%B8%82&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455522784&loc_mode=5&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000",
                    "http://ic.snssdk.com/2/article/v25/stream/?category=news_sports&count=20&min_behot_time=1455522629&bd_city=%E5%8C%97%E4%BA%AC%E5%B8%82&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455522784&loc_mode=5&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000",
                    "http://ic.snssdk.com/2/article/v25/stream/?category=news_finance&count=20&min_behot_time=1455522899&bd_city=%E5%8C%97%E4%BA%AC%E5%B8%82&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455523440&loc_mode=5&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000",
                    "http://ic.snssdk.com/2/article/v25/stream/?category=news_military&count=20&min_behot_time=1455522991&bd_city=%E5%8C%97%E4%BA%AC%E5%B8%82&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455523440&loc_mode=5&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000",
                    "http://ic.snssdk.com/2/article/v25/stream/?category=news_world&count=20&min_behot_time=1455523059&bd_city=%E5%8C%97%E4%BA%AC%E5%B8%82&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455523440&loc_mode=5&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000"};
    private String name;
    private String iconurl;
    private String gender;
    private UMAuthListener umAuthListener = new UMAuthListener() {

        @Override
        public void onStart(SHARE_MEDIA platform) {
            //授权开始的回调
        }

        @Override
        public void onComplete(SHARE_MEDIA platform, int action, Map<String, String> data) {
            //   Toast.makeText(getApplicationContext(), "Authorize succeed", Toast.LENGTH_SHORT).show();
            switch (action) {
                // 授权成功的状态
                case UMAuthListener.ACTION_AUTHORIZE:
                   // Toast.makeText(SecondActivity.this, "ACTION_AUTHORIZE111", Toast.LENGTH_SHORT).show();
                    UMShareAPI mShareAPI = UMShareAPI.get(SecondActivity.this);
                    mShareAPI.getPlatformInfo(SecondActivity.this, platform, umAuthListener);
                    break;
                // 登录成功后的 获取用户信息的-----------------------------------------------


                case UMAuthListener.ACTION_GET_PROFILE:
                  //  Toast.makeText(SecondActivity.this, "zoule", Toast.LENGTH_SHORT).show();
                    name = data.get("name");
                    iconurl = data.get("iconurl");
                    gender = data.get("gender");


                    flag2=true;
                   dengluzhuangtai();

                    Toast.makeText(SecondActivity.this, name + gender + "：欢迎您来到今日头条", Toast.LENGTH_SHORT).show();
                    break;


            }

        }

        @Override
        public void onError(SHARE_MEDIA platform, int action, Throwable t) {
            Toast.makeText(getApplicationContext(), "Authorize fail", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onCancel(SHARE_MEDIA platform, int action) {
            Toast.makeText(getApplicationContext(), "Authorize cancel", Toast.LENGTH_SHORT).show();
        }
    };
    private Framgentzong fragmentzong;

    private void dengluzhuangtai() {
        relativeLayout.setVisibility(View.INVISIBLE);

        sli_text_myQQName = (TextView) findViewById(R.id.sli_text_MyQQName);
        sli_text_myQQName.setText(name);
        ImageView sli_image_Mytouxiang = (ImageView) findViewById(R.id.sli_image_Mytouxiang);
        //ImageLoader.getInstance().displayImage(iconurl,sli_image_Mytouxiang, ImageUtils.displayImageOptions(R.mipmap.ic_qq_login_normal));
        //ImageLoader.getInstance().displayImage(iconurl,benren, ImageUtils.displayImageOptions(R.mipmap.ic_qq_login_normal));
        ImageOptions options = new ImageOptions.Builder().setCircular(true).setCrop(true).setSize(80,80).build();
        x.image().bind(benren,iconurl,options);
        x.image().bind(sli_image_Mytouxiang,iconurl,options);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        if (savedInstanceState != null) {
            name=savedInstanceState.getString("name");
            iconurl=savedInstanceState.getString("image");

            flag2 = savedInstanceState.getBoolean("flag2");
            theme = savedInstanceState.getInt("theme");
            //设置主题 此方法必须在setContentView()之前调用
            setTheme(theme);
            flag = savedInstanceState.getBoolean("flag");
        }

        setContentView(R.layout.second_layout);

        initview();
        if (flag) {
            yejian.setText("日间模式");
            sli_image_yejian.setImageResource(R.mipmap.dayicon_leftdrawer_normal_night);
        } else {
            yejian.setText("夜间模式");
            sli_image_yejian.setImageResource(R.mipmap.daymode_popover);
        }
        if(flag2){
            dengluzhuangtai();
        }
        initdata();

        shipei();

    }


    private void shipei() {
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tablatout.setupWithViewPager(viewPager);
        tablatout.setTabsFromPagerAdapter(adapter);
    }


    private void initdata() {

        tablatout.setTabMode(TabLayout.MODE_SCROLLABLE);

        for (int i = 0; i < titles.length; i++) {
            tablatout.addTab(tablatout.newTab().setText(titles[i]));
            Bundle bundle = new Bundle();
            bundle.putString("key", urls[i]);
            fragmentzong = new Framgentzong();
            fragmentzong.setArguments(bundle);
            list_fragment.add(fragmentzong);
        }

    }

    private void initview() {

        SMSSDK.initSDK(this, "1c16281aa4eb6", "50984e21b1aa93bde62cde0afc4028d4");


        gengduo = (ImageButton) findViewById(R.id.zhu_imagebutton_gengduo);
        benren = (ImageView) findViewById(R.id.zhu_image_benren);
        serch = (ImageView) findViewById(R.id.zhu_image_serch);
        shuaxin = (ImageView) findViewById(R.id.zhu_image_shuaxin);
        tablatout = (TabLayout) findViewById(R.id.zhu_tablayout);
        viewPager = (ViewPager) findViewById(R.id.zhu_viewpager);


        slidingmenu = new SlidingMenu(SecondActivity.this);
        slidingmenu.setMode(SlidingMenu.LEFT);
        slidingmenu.setBehindOffset(200);
        slidingmenu.attachToActivity(SecondActivity.this, SlidingMenu.SLIDING_CONTENT);
        slidingmenu.setMenu(R.layout.sliding_layout);
        relativeLayout = (RelativeLayout) findViewById(R.id.sli_Relati_touyihang);
        ImageButton cellogin = (ImageButton) findViewById(R.id.sliding_image_cellogin);
        ImageButton qqlogin = (ImageButton) findViewById(R.id.sliding_image_qqlogin);
        TextView sliding_text_gengduo = (TextView) findViewById(R.id.sliding_text_gengduo);
        LinearLayout shoucang = (LinearLayout) findViewById(R.id.sliding_linear_shoucang);
        LinearLayout sli_lin_lixian = (LinearLayout) findViewById(R.id.sli_lin_lixian);
        LinearLayout sli_lin_shezhi = (LinearLayout) findViewById(R.id.sli_lin_shezhi);
        LinearLayout sli_lin_yejian = (LinearLayout) findViewById(R.id.sli_lin_yejian);


        yejian = (TextView) findViewById(R.id.sli_text_yejian);
        sli_image_yejian = (ImageView) findViewById(R.id.sli_image_yejian);
        sli_lin_shezhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this,Shezhi.class));
                overridePendingTransition(R.anim.enter,R.anim.exit);
            }
        });
        sli_lin_lixian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this,LixianxiazaiActivity.class));
                overridePendingTransition(R.anim.enter,R.anim.exit);
            }
        });
        cellogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegisterPage registerPage = new RegisterPage();
                registerPage.setRegisterCallback(new EventHandler() {
                    public void afterEvent(int event, int result, Object data) {
// 解析注册结果
                        if (result == SMSSDK.RESULT_COMPLETE) {
                            @SuppressWarnings("unchecked")
                            HashMap<String, Object> phoneMap = (HashMap<String, Object>) data;
                            String country = (String) phoneMap.get("country");
                            phone = (String) phoneMap.get("phone");

// 提交用户信息（此方法可以不调用）
                            //registerUser(country, phone);
                        }
                    }
                });
                registerPage.show(SecondActivity.this);
            }
        });
        qqlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UMShareAPI mShareAPI = UMShareAPI.get(SecondActivity.this);
                mShareAPI.doOauthVerify(SecondActivity.this, SHARE_MEDIA.QQ, umAuthListener);
            }
        });

        sli_lin_yejian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                flag = !flag;

                theme = (theme == R.style.AppTheme) ? R.style.NightAppTheme : R.style.AppTheme;
                //重新创建
                recreate();
            }
        });
        benren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slidingmenu.showMenu();
            }
        });
        serch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, SerchActivity.class));
                overridePendingTransition(R.anim.enter, R.anim.exit);
            }
        });
        shuaxin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnimationUtils animationU = new AnimationUtils();
                Animation animation = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.zhuan);
                shuaxin.startAnimation(animation);


            }
        });
        gengduo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this,GengduoActivity.class));
                overridePendingTransition(R.anim.enter,R.anim.exit);

            }
        });


    }


    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list_fragment.get(position);
        }

        @Override
        public int getCount() {
            return list_fragment.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }

    //保存数据
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("theme", theme);
        outState.putBoolean("flag", flag);
        outState.putBoolean("flag2", flag2);
        outState.putString("name",name);
        outState.putString("image",iconurl);


    }

    //恢复数据
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        theme = savedInstanceState.getInt("theme");


        slidingmenu.showMenu();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);

    }
}
