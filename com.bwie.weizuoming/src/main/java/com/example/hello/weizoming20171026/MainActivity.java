package com.example.hello.weizoming20171026;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.hello.weizoming20171026.adapert.MyAdapter;
import com.example.hello.weizoming20171026.bean.DataDataBean;

import java.util.ArrayList;
import java.util.List;

/**
 *主Activity
 * 韦作铭
 * 20171026
 */
public class MainActivity extends AppCompatActivity {
    private DrawerLayout dl;

    private RelativeLayout rl;
    private List<DataDataBean> list = new ArrayList<>();

    private MyAdapter myAdapter;
    private int page_num=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl = (DrawerLayout) findViewById(R.id.drawer_layout);
        //主内容区域的布局

        //抽屉布局
        rl = (RelativeLayout) findViewById(R.id.drawer_relative);
        ImageView imageView=(ImageView)findViewById(R.id.image_touxiang) ;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"LOG",Toast.LENGTH_SHORT).show();
                dl.closeDrawer(rl);
            }
        });


        dl.setDrawerListener(new DrawerLayout.DrawerListener() {


            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }


            @Override
            public void onDrawerOpened(View drawerView) {
                Toast.makeText(MainActivity.this,"打开",Toast.LENGTH_SHORT).show();
            }


            @Override
            public void onDrawerClosed(View drawerView) {
                Toast.makeText(MainActivity.this,"关闭",Toast.LENGTH_SHORT).show();
            }


            @Override
            public void onDrawerStateChanged(int newState) {
                Log.i("zhaungtai---",newState+"---");
            }
        });
        //默认显示1
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new FrmentListView()).commit();
   }
}
