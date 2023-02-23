package com.example.trackingtest.room;

import android.content.Context;

import androidx.room.Room;

public class DatabaseHolder {

    private AppDatabase db = null;

    public DatabaseHolder(){

    }

    public synchronized AppDatabase getDatabase() {
        if (db == null) {
            throw new IllegalStateException("Database is null");
        }
        return db;
    }

    public synchronized void openDatabase(Context context) {
        db = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "AppDatabase").build();
    }

}
