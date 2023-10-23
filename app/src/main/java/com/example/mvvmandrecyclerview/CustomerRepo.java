package com.example.mvvmandrecyclerview;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo {
    private final String TAG = getClass().getSimpleName();

    ArrayList<CustomerModel> arrayList = new ArrayList<>();

    public MutableLiveData<List<CustomerModel>> requestCustomer(){

        final MutableLiveData<List<CustomerModel>> mutableLiveData = new MutableLiveData<>();

        arrayList.add(new CustomerModel(R.drawable.ic_launcher_background,"Baki", "01744594714"));
        arrayList.add(new CustomerModel(R.drawable.ic_launcher_background,"Baki", "01744594714"));
        arrayList.add(new CustomerModel(R.drawable.ic_launcher_background,"Baki", "01744594714"));
        arrayList.add(new CustomerModel(R.drawable.ic_launcher_background,"Baki", "01744594714"));
        arrayList.add(new CustomerModel(R.drawable.ic_launcher_background,"Baki", "01744594714"));
        arrayList.add(new CustomerModel(R.drawable.ic_launcher_background,"Baki", "01744594714"));
        arrayList.add(new CustomerModel(R.drawable.ic_launcher_background,"Baki", "01744594714"));
        arrayList.add(new CustomerModel(R.drawable.ic_launcher_background,"Baki", "01744594714"));
        arrayList.add(new CustomerModel(R.drawable.ic_launcher_background,"Baki", "01744594714"));
        arrayList.add(new CustomerModel(R.drawable.ic_launcher_background,"Baki", "01744594714"));
        arrayList.add(new CustomerModel(R.drawable.ic_launcher_background,"Baki", "01744594714"));


        mutableLiveData.setValue(arrayList);
        return mutableLiveData;
    }

}
