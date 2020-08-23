package com.mimdal.picturealbum;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<RecyclerItem> images;
    private Context context;


    public MyAdapter(List<RecyclerItem> images, Context context) {
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.image.setImageResource(images.get(position).getImage());


    }

    @Override
    public int getItemCount() {
//        Log.i("LOG", "" + images.size());
        return images.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            Log.i("LOG",""+getAdapterPosition());
        }
    }
}
