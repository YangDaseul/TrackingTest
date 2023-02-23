package com.example.trackingtest.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trackingtest.model.TestInfoVO;

import java.util.List;

@Dao
public interface TestInfoDao {

    @Query("SELECT * FROM testinfovo")
    List<TestInfoVO> getAllTestInfo();

    @Insert
    void insert(TestInfoVO testInfoVO);

    @Delete
    void delete(TestInfoVO testInfoVO);

    @Update
    void update(TestInfoVO testInfoVO);
}
