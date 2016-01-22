package com.hankarun.movietvguide;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MovieDataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "favoritetable.db";
    private static final int DATABASE_VERSION = 1;

    public MovieDataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        MovieTable.onCreate(database);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion,
                          int newVersion) {
        MovieTable.onUpgrade(database, oldVersion, newVersion);
    }
}
