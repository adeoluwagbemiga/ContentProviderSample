package com.adeoluwa.android.contentprovider.sync;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Merlyne on 5/9/2017.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "TheWorld";
    private static final int DATABASE_VERSION = 1;

    MyDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        CountriesDb.onCreate(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        CountriesDb.onUpgrade(db, oldVersion, newVersion);
    }
}
