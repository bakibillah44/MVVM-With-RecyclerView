package com.example.mvvmandrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {

    ArrayList<CustomerModel> arrayList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.customer_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.img.setImageResource(arrayList.get(position).getImg());
        holder.txtName.setText(arrayList.get(position).getName());
        holder.txtNumber.setText(arrayList.get(position).getPhone());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public void setCustomerList(ArrayList<CustomerModel> customerModels){
                this.arrayList = customerModels;
                notifyDataSetChanged();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txtName, txtNumber;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imgCustomer);
            txtName = itemView.findViewById(R.id.txtName);
            txtNumber = itemView.findViewById(R.id.txtNumber);
        }
    }
}
