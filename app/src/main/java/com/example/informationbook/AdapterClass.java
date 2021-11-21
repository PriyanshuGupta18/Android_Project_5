package com.example.informationbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CarrdViewHolder> {
    private ArrayList<ModelClass> modelList;
    private Context context;

    public AdapterClass(ArrayList<ModelClass> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CarrdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        return new CarrdViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarrdViewHolder holder, int position) {
        ModelClass model=modelList.get(position);
        holder.textViewSplash.setText(model.getCategory_name());
        holder.imageViewSplash.setImageResource(context.getResources().getIdentifier(model.getImage_name(),"drawable",context.getPackageName()));


    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CarrdViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewSplash;
        private TextView textViewSplash;
        public CarrdViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewSplash=itemView.findViewById(R.id.imageViewSplash);
            textViewSplash=itemView.findViewById(R.id.textViewSplash);
        }
    }
}
