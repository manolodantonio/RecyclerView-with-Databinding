package com.manzo.recyclerview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.manzo.recyclerview.listComponents.Item;
import com.manzo.recyclerview.listComponents.MyAdapter;

public class MainActivity extends AppCompatActivity implements
        MyAdapter.MyItemClickListener
{


    final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
    final MyAdapter myAdapter = new MyAdapter(this);
    public RecyclerView rv_mainList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_mainList = (RecyclerView) findViewById(R.id.rv_main_list);
        rv_mainList.setAdapter(myAdapter);
        rv_mainList.setLayoutManager(linearLayoutManager);
        rv_mainList.setHasFixedSize(false); // Todo: true with static dataset to increases performances
    }

    @Override
    public void onMyItemClick(Item clickedItem) {
        String title = clickedItem.getTitle();
        Toast.makeText(this, "Clicked item " + title, Toast.LENGTH_SHORT).show(); // Todo: remove, just for debug
    }

}
