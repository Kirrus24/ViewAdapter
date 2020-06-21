package com.example.laboratornaya_3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(@Nullable Context context) {
        super(context, "notes", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("DB", "Database is being created");

        db.execSQL("create table items(" +
                "id integer primary key autoincrement, " +
                "title text);");

        Log.d("DB", "Database has been created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
