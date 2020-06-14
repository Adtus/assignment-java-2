package com.example.gameofappsinternship_challenge2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PhotoTemplateRecyclerViewAdapter extends RecyclerView.Adapter<PhotoTemplateRecyclerViewAdapter.ViewHolder> {

    private int[] images; //Image array
    private Context context;

    public PhotoTemplateRecyclerViewAdapter(int[] images, Context context) {
        this.images = images;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_template, parent, false);
        ViewHolder holder = new ViewHolder(view, context, images);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        int imageId = images[position]; //Set to the image array's length position
        holder.image.setImageResource(imageId); //Calls and sets that image to the corresponding position

    }

    @Override
    public int getItemCount() {
        return images.length; //Gets the image array's length
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView image;
        Context context;
        int[] images;

        public ViewHolder(@NonNull View itemView, Context context, int[] images) {
            super(itemView);
            image = itemView.findViewById(R.id.imageHolder);

            itemView.setOnClickListener(this);
            this.context = context;
            this.images = images;
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, OnImageClick.class); //Sends the selected image to OnImageClick.class
            intent.putExtra("image_id", images[getAdapterPosition()]); //Gets the image array's position

            context.startActivity(intent);
        }
    }

}
