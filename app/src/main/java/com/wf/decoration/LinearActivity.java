package com.wf.decoration;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Win-wf
 * Create time: 2019/1/21 16:05
 */
public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        int direction = getIntent().getIntExtra("direction", LinearLayoutManager.VERTICAL);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        if(direction == LinearLayoutManager.HORIZONTAL) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
            recyclerView.addItemDecoration(new SimpleItemDecoration(Color.parseColor("#0000ff"), 20));
            recyclerView.setAdapter(new CommonAdapter<Integer>(this, R.layout.layout_item2, list) {
                @Override
                protected void convert(ViewHolder holder, Integer integer, int position) {
                    holder.setText(R.id.tv_item, "" + position);
                }
            });

        } else {
            recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            recyclerView.addItemDecoration(new SimpleItemDecoration(Color.parseColor("#0000ff"), 20));
            recyclerView.setAdapter(new CommonAdapter<Integer>(this, R.layout.layout_item, list) {
                @Override
                protected void convert(ViewHolder holder, Integer integer, int position) {
                    holder.setText(R.id.tv_item, "" + position);
                }
            });
        }


    }

}
