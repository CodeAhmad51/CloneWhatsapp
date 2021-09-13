package com.example.modwhatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewholder> {


    List<String> data;

    Adapter(List<String> data){
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.chat_item_layout,parent,false);
        return new MyViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        String msg = data.get(position);
        holder.message.setText(msg);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewholder extends RecyclerView.ViewHolder{
        TextView message;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);

            message = itemView.findViewById(R.id.chat_item_text);

        }
    }
}
