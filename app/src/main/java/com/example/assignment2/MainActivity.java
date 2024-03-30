package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    RecyclerView rvRestaurants;
    RestaurantAdapter myAdapter;
    ArrayList<Restaurant> restaurantList;
    Button btnAddNewRestaurant;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        rvRestaurants.setHasFixedSize(true);
        myAdapter = new RestaurantAdapter(restaurantList);
        rvRestaurants.setLayoutManager(new LinearLayoutManager(this));
        rvRestaurants.setAdapter(myAdapter);
        btnAddNewRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restaurantList.add(new Restaurant("Casa di Burger", "456 Main St", "555-4321", "Authentic burgers and pizza"));
                Toast.makeText(MainActivity.this, ""+restaurantList.size(), Toast.LENGTH_SHORT).show();
                myAdapter.notifyDataSetChanged();
            }
        });
    }
    private void init()
    {
        restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant("Casa di Pizza", "123 Main St", "555-1234", "Authentic Italian cuisine"));
        restaurantList.add(new Restaurant("Taste of India", "456 Oak St", "555-5678", "Delicious Indian dishes"));
        restaurantList.add(new Restaurant("Sushi Palace", "789 Elm St", "555-9012", "Fresh sushi and sashimi"));
        restaurantList.add(new Restaurant("Mexican Grill", "321 Maple Ave", "555-3456", "Spicy Mexican food"));
        restaurantList.add(new Restaurant("Burger Joint", "678 Pine St", "555-7890", "Juicy burgers and fries"));
        restaurantList.add(new Restaurant("Pasta Paradise", "901 Walnut St", "555-2345", "Variety of pasta dishes"));
        restaurantList.add(new Restaurant("Thai Spice", "543 Birch St", "555-6789", "Flavorful Thai cuisine"));
        restaurantList.add(new Restaurant("Steakhouse", "876 Cedar St", "555-0123", "Premium cuts of steak"));
        restaurantList.add(new Restaurant("Vegetarian Delight", "234 Oak St", "555-4567", "Healthy vegetarian options"));
        restaurantList.add(new Restaurant("Seafood Shack", "567 Elm St", "555-8901", "Fresh seafood dishes"));



        rvRestaurants = findViewById(R.id.rvRestaurants);
        btnAddNewRestaurant = findViewById(R.id.btnAddNewContact);
    }
}