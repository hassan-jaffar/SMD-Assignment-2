package com.example.assignment2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {
    ArrayList<Restaurant> restaurants;
    public RestaurantAdapter(ArrayList<Restaurant> list)
    {
        restaurants = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.single_restaurant_item, parent, false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvName.setText(restaurants.get(position).getName());
        holder.tvLocation.setText(restaurants.get(position).getLocation());
        holder.tvPhone.setText(restaurants.get(position).getPhone());
        holder.tvDescription.setText(restaurants.get(position).getDescription());
    }
    @Override
    public int getItemCount() {
        return restaurants.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvLocation, tvName, tvPhone, tvDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLocation = itemView.findViewById(R.id.tvLocation);
            tvPhone = itemView.findViewById(R.id.tvPhone);
            tvName = itemView.findViewById(R.id.tvName);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), tvName.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
