package com.wf.decoration;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void horizontalDivider(View view){
        Intent intent = new Intent(this, LinearActivity.class);
        intent.putExtra("direction", LinearLayoutManager.VERTICAL);
        startActivity(intent);
    }

    public void verticalDivider(View view){
        Intent intent = new Intent(this, LinearActivity.class);
        intent.putExtra("direction", LinearLayoutManager.HORIZONTAL);
        startActivity(intent);
    }

    public void gridDivider(View view){
        Intent intent = new Intent(this, GridActivity.class);
        intent.putExtra("direction", LinearLayoutManager.HORIZONTAL);
        startActivity(intent);
    }
}
