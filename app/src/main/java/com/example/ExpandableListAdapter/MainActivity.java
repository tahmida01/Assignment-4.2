package com.example.ExpandableListAdapter;

import android.os.Bundle;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment42.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private List<String> categoryList;
    private HashMap<String, List<String>> productList;
    private CustomExpandableListAdapter expandableListAdapter; // Updated here to use CustomExpandableListAdapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the ExpandableListView
        expandableListView = findViewById(R.id.expandableListView);

        // Initialize category and product data
        categoryList = new ArrayList<>();
        productList = new HashMap<>();

        // Sample data
        categoryList.add("Dining");
        categoryList.add("Clothing");
        categoryList.add("Chocolates");

        // Products for each category
        List<String> dining = new ArrayList<>();
        dining.add("Plates");
        dining.add("Glasses");
        dining.add("Cutlery Set");
        dining.add("Serving Tray");

        List<String> clothing = new ArrayList<>();
        clothing.add("Shirts");
        clothing.add("Pants");
        clothing.add("Sari");
        clothing.add("Gown");

        List<String> chocolates = new ArrayList<>();
        chocolates.add("Dairy Milk");
        chocolates.add("Kitkat");
        chocolates.add("Pulse");
        chocolates.add("Dark Chocolate");

        // Putting the products into the product list with category names as keys
        productList.put("Dining", dining);
        productList.put("Clothing", clothing);
        productList.put("Chocolates", chocolates);

        // Set the adapter for the ExpandableListView
        expandableListAdapter = new CustomExpandableListAdapter(this, categoryList, productList); // Using the new adapter name
        expandableListView.setAdapter(expandableListAdapter);
    }
}