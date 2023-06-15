package com.example.onschedule.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class NailDBHelper {
    private static  final String DATABASE_NAME = "NAIL_DATABASE";
    private static  final String TABLE_NAME = "NAIL_TABLE";
    private static  final String COL_1 = "ID";
    private static  final String COL_2 = "FULLNAME";
    private static  final String COL_3 = "EMAIL";
    private static  final String COL_4 = "PHONE";
    private static  final String COL_5 = "TIME";
    private static  final String COL_6 = "SERVICE";
    private static  final String COL_7 = "TASK";
    private static  final String COL_8 = "STATUS";
    public NailDBHelper(@Nullable Context context ) {
        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT , " +
                "FULLNAME TEXT,EMAIL TEXT,PHONE TEXT,TIME TEXT, SERVICE TEXT, TASK TEXT, STATUS INTEGER)");
    }
}
