package com.demos.retrofitgooglenearby.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.demos.retrofitgooglenearby.R;
import com.demos.retrofitgooglenearby.models.PlaceDo;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.MyViewHolder> {

    private List<PlaceDo> places;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.place_view_cell, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvAddress.setText(places.get(position).getVicinity());
        holder.tvName.setText(places.get(position).getName());
        holder.tvRating.setText(places.get(position).getRating().toString());

    }

    public PlacesAdapter(List<PlaceDo> places) {

        this.places = places;
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvAddress)
        TextView tvAddress;

        @BindView(R.id.tvName)
        TextView tvName;

        @BindView(R.id.tvRating)
        TextView tvRating;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
