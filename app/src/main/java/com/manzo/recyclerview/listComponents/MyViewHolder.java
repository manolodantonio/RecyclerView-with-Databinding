package com.manzo.recyclerview.listComponents;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.manzo.recyclerview.R;
import com.manzo.recyclerview.databinding.ItemExampleBinding;

public class MyViewHolder extends RecyclerView.ViewHolder
{

    private final ItemExampleBinding binding;

    public MyViewHolder(ItemExampleBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Item item) {
        binding.setItem(item);

//        executePendingBindings() runs the binding now instead of
//        waiting for next frame: avoids data/view sync errors
        binding.executePendingBindings();
    }

}
