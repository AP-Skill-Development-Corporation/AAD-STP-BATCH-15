package com.example.exampledb.Rdb;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface RDao {

    @Insert
    void insert(RTable rTable);

    @Query("Select * from StudentData")
    LiveData<List<RTable>> getAll();

    @Delete
    void delete(RTable rTable);

    @Update
    void update(RTable rTable);
    
}
