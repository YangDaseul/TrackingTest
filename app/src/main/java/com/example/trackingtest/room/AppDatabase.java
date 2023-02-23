package com.example.trackingtest.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.trackingtest.model.TestInfoVO;

@Database(entities = {TestInfoVO.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TestInfoDao testInfoDao();

}
