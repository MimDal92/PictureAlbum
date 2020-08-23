package com.mimdal.picturealbum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<RecyclerItem> images = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        setData();

        MyAdapter myAdapter = new MyAdapter(images, this);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2,RecyclerView.VERTICAL, false);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position % 3 == 0)
                    return 2;
                else
                    return 1;
            }
        });
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(myAdapter);
    }

    private void setData() {


        images.add(new RecyclerItem(R.drawable.imag18));
        images.add(new RecyclerItem(R.drawable.imag11));
        images.add(new RecyclerItem(R.drawable.imag17));
        images.add(new RecyclerItem(R.drawable.imag25));
        images.add(new RecyclerItem(R.drawable.imag26));
        images.add(new RecyclerItem(R.drawable.imag28));

        images.add(new RecyclerItem(R.drawable.imag24));
        images.add(new RecyclerItem(R.drawable.imag3));
        images.add(new RecyclerItem(R.drawable.imag4));
        images.add(new RecyclerItem(R.drawable.imag30));
        images.add(new RecyclerItem(R.drawable.imag31));

    }
}
