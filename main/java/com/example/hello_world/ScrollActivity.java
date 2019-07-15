package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class ScrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview1);
        List<String> datas = initData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ScrollAdapter(datas));
    }

    public List<String> initData(){
        List<String> datas = new LinkedList<String>();
        for (int i=1;i<=20;i++)
        {
            datas.add("This is the "+i+"st");
        }
        return datas;
    }
}
