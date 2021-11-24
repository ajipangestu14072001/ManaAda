package com.example.manaada.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.manaada.R;
import com.example.manaada.model.Merchandise;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;
import java.util.List;

public class MerchandiseAdapter extends RecyclerView.Adapter<MerchandiseAdapter.MerchandiseViewHolder> {
    private List<Merchandise> mList = new ArrayList<>();

    public MerchandiseAdapter(List<Merchandise> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public MerchandiseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_item,parent,false);
       return new MerchandiseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MerchandiseViewHolder holder, @SuppressLint("RecyclerView") int position) {
    holder.roundedImageView.setImageResource(mList.get(position).getImage());
    holder.roundedImageView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Merchandise merchandise = mList.get(position);
            Toast.makeText(v.getContext(),merchandise.getImage(),Toast.LENGTH_SHORT).show();
        }
    });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MerchandiseViewHolder extends RecyclerView.ViewHolder{
        RoundedImageView roundedImageView;
        public MerchandiseViewHolder(@NonNull View itemView) {
            super(itemView);
            roundedImageView = itemView.findViewById(R.id.iimageView);
        }
    }
}
