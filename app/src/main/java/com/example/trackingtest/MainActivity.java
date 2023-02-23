package com.example.trackingtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.trackingtest.model.TestInfoVO;
import com.example.trackingtest.viewmodel.TestInfoViewModel;

public class MainActivity extends AppCompatActivity {
    private TestInfoViewModel testInfoViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testInfoViewModel = new ViewModelProvider(this).get(TestInfoViewModel.class);
        insertData();
    }

    private void insertData(){
        for (int i = 1; i <= 10; i++){
            TestInfoVO testInfoVO = new TestInfoVO(i, "abc", "abcdefg", "35", "M", "156", "58", "홍길동");
            testInfoViewModel.insertData(testInfoVO);
        }
    }
}