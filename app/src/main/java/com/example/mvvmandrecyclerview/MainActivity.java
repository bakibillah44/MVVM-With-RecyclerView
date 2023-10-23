package com.example.mvvmandrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        CustomerAdapter adapter = new CustomerAdapter();
        recyclerView.setAdapter(adapter);



        CustomerViewModel customerViewModel = new CustomerViewModel();

        customerViewModel.getCustomer().observe(this, new Observer<List<CustomerModel>>() {
            @Override
            public void onChanged(List<CustomerModel> customerModels) {

                adapter.setCustomerList((ArrayList<CustomerModel>) customerModels);


                Toast.makeText(MainActivity.this, customerModels.get(0).getName(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}