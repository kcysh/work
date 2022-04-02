package com.example.page5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Dictionary;

public class MainActivity extends AppCompatActivity {
    private ArrayList<item> iList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        iList = new ArrayList<>();

        setItemInfo();
        setAdapter();
    }


    private void setAdapter() {
        recyclerAdapter adapter = new recyclerAdapter(iList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
    private void setItemInfo() {
        iList.add(new item("익명1","댓글예시1 입니다."));
        iList.add(new item("익명2","댓글예시2 입니다."));
        iList.add(new item("익명3","댓글예시3 입니다."));
        iList.add(new item("익명4","댓글예시4 입니다."));
        iList.add(new item("익명5","댓글예시5 입니다."));

    }

}