package com.manzo.recyclerview.listComponents;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.manzo.recyclerview.R;
import com.manzo.recyclerview.databinding.ItemExampleBinding;

/**
 * Created by Manolo on 01/02/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    public interface MyItemClickListener {
        void onMyItemClick(Item item);
    }


    private Context context;
    public static MyItemClickListener myItemClickListener;

    public MyAdapter(MyItemClickListener listener) {
        myItemClickListener = listener;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        ItemExampleBinding itemExampleBinding = ItemExampleBinding.inflate(
                layoutInflater, parent, false);
        itemExampleBinding.setClickListener(myItemClickListener);
        return new MyViewHolder(itemExampleBinding);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // We create a sample item that only contains the position number
        Item item = new Item(String.valueOf(position)); // TODO: load items from dataset
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return 10; // TODO: replace with dataset actual length
    }
}

