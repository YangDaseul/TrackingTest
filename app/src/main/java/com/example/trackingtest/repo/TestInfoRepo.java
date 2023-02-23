package com.example.trackingtest.repo;

import android.os.AsyncTask;

import com.example.trackingtest.model.TestInfoVO;
import com.example.trackingtest.room.DatabaseHolder;
import com.example.trackingtest.room.TestInfoDao;

import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.inject.Inject;

public class TestInfoRepo {
    private TestInfoDao testInfoDao;

    @Inject
    public TestInfoRepo(DatabaseHolder databaseHolder){
        testInfoDao = databaseHolder.getDatabase().testInfoDao();
    }

    public void insertData(TestInfoVO testInfoVO){
        testInfoDao.insert(testInfoVO);
    }
    public List<TestInfoVO> getAll(){
        List<TestInfoVO> testInfo = null;
        try{
            testInfo = new getAllDataAsyncTask(testInfoDao).execute().get();
        }catch (ExecutionException | InterruptedException e){
            e.printStackTrace();
        }
        return testInfo;
    }

    private static class getAllDataAsyncTask extends AsyncTask<Void, Void, List<TestInfoVO>> {
        private TestInfoDao mAsyncTaskDao;
        getAllDataAsyncTask(TestInfoDao a_dao) {
            mAsyncTaskDao = a_dao;
        }

        @Override
        protected List<TestInfoVO> doInBackground(Void... url) {

            return mAsyncTaskDao.getAllTestInfo();
        }
    }



}

