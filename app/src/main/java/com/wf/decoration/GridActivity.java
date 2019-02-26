package com.wf.decoration;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
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
public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

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
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.addItemDecoration(new SimpleItemDecoration(
                Color.parseColor("#ff0000"),
                Color.parseColor("#000000"),
                20, 40));
        recyclerView.setAdapter(new CommonAdapter<Integer>(this, R.layout.layout_item, list) {
            @Override
            protected void convert(ViewHolder holder, Integer integer, int position) {
                holder.setText(R.id.tv_item, "" + position);
            }
        });

    }
}
