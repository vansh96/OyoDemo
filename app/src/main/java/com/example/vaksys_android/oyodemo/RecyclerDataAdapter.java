package com.example.vaksys_android.oyodemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vaksys-android on 11/15/17.
 */

public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.MyViewHolder> {

    Context context;
    ArrayList<String> textList;

        public RecyclerDataAdapter(Context context,ArrayList textList)
        {
            this.context = context;
            this.textList = textList;
        }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_inner_data,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.textView.setText(textList.get(position));
    }

    @Override
    public int getItemCount() {
        return textList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.recycler_inner_data_text);
        }
    }
}
