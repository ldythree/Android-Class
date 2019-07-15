package com.example.hello_world;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ScrollAdapter extends RecyclerView.Adapter<ScrollAdapter.MyViewHolder> {

    private List<String> datas;
    public ScrollAdapter(List<String> data){
        this.datas = data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mView.setText(datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView.findViewById(R.id.TextView1);
        }
    }
}
