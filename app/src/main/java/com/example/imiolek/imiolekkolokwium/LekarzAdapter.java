package com.example.imiolek.imiolekkolokwium;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Daniel on 17.01.2018.
 */

public class LekarzAdapter extends RecyclerView.Adapter<LekarzAdapter.ViewHolder> {

    private ArrayList<Lekarz> LekarzArray = new ArrayList<>();

    public LekarzAdapter(ArrayList<Lekarz> lekarzarray) {
        LekarzArray = lekarzarray;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(LekarzArray.get(position).getName() + "");
        holder.setPrice(LekarzArray.get(position).getSpecialization() + "");
    }

    @Override
    public int getItemCount() {
        return LekarzArray.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @BindView(R.id.LekarzName)
        TextView LekarzName;

        @BindView(R.id.LekarzSpecialization)
        TextView LekarzSpecialization;

        private void setName(String name) {
            LekarzName.setText(name);
        }

        private void setPrice(String price) {
            LekarzSpecialization.setText(price);
        }
    }}