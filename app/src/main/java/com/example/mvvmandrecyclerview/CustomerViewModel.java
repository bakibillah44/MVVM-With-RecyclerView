package com.example.mvvmandrecyclerview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class CustomerViewModel extends ViewModel {
    private CustomerRepo customerRepo;
    private MutableLiveData<List<CustomerModel>> mutableLiveData;

    public CustomerViewModel(){
        customerRepo = new CustomerRepo();
    }

    public LiveData<List<CustomerModel>> getCustomer(){
    if (mutableLiveData == null){
        mutableLiveData = customerRepo.requestCustomer();

        }
    return mutableLiveData;
    }
}
