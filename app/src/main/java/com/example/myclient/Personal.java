package com.example.myclient;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Personal extends Activity {
    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal);
        String[] data={
                "希尔瓦娜斯 教授项目：射击         好评度：3星" ,
                "阿尔萨斯 教授项目：马术           好评度：4星",
                "吉安娜.普罗德莫尔 教授项目：体操   好评度：5星",
                "瓦里安.乌瑞恩 教授项目：格斗术     好评度：5星",
                "安度因 教授项目：赛后康复         好评度：4星",
                "伊利丹.怒风 教授项目：田径        好评度：4星",
                "怀特迈恩 教授项目：球操           好评度：5星",
                "莉亚德琳 教授项目：击剑           好评度：5星",
                "奥蕾莉亚 教授项目：射击           好评度：6星",
                "图拉扬   教授项目：剑术           好评度：5星",
                "拉斯塔哈 教授项目：马术           好评度：4星"};
        mRecyclerView= (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(new MyAdapter(data));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
