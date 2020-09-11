package com.example.exampledb.Rdb;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class RViewModel {
    RRepository rRepository;
    LiveData<List<RTable>> list;
    public RViewModel(Application application){
        rRepository = new RRepository(application);
        list = rRepository.readAllData();
    }
    /*This is to insert the data*/
    public void insert(RTable rTable){
        rRepository.insert(rTable);
    }
    /*This is to read the data*/
    public LiveData<List<RTable>> readData(){
        return list;
    }
    /*This is to update the data*/
    public void update(RTable rTable){
        rRepository.update(rTable);
    }
    /*This is to delete the data*/
    public void delete(RTable rTable){
        rRepository.delete(rTable);
    }
}
