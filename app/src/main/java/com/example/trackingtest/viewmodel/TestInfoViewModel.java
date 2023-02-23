package com.example.trackingtest.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.trackingtest.model.TestInfoVO;
import com.example.trackingtest.repo.TestInfoRepo;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class TestInfoViewModel extends ViewModel {
    private TestInfoRepo testInfoRepo;

//    public MutableLiveData<List<TestInfoVO>> testInfoList = new MediatorLiveData<>();

    @Inject
    public TestInfoViewModel(TestInfoRepo testInfoRepo){
        this.testInfoRepo = testInfoRepo;
    }

    public void insertData(TestInfoVO testInfoVO){
        testInfoRepo.insertData(testInfoVO);
    }

//    public void getAll(){
//        testInfoList.setValue(testInfoRepo.getAll());
//    }

}
