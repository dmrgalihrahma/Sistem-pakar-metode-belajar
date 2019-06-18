package com.example.damar.finalproject.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.damar.finalproject.model.Klasifikasi;
import com.example.damar.finalproject.model.Metode;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DBNAME = "database.db";
    public static final String DBLOCATION = "/data/data/com.example.damar.finalproject/databases/";
    private Context mContext;
    private SQLiteDatabase mDatabase;


    public DatabaseHelper(Context context){
        super(context,DBNAME,null,1);
        this.mContext = context;
    }
    @Override
    public void onCreate(SQLiteDatabase db){

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    public void openDatabase(){
        String dbPath = mContext.getDatabasePath(DBNAME).getPath();
        if (mDatabase != null && mDatabase.isOpen()){
            return;
        }
        mDatabase = SQLiteDatabase.openDatabase(dbPath, null,SQLiteDatabase.OPEN_READWRITE);
    }
    public void closeDatabase(){
        if (mDatabase!=null){
            mDatabase.close();
        }
    }
    public List<Metode> getListMetode(){
        Metode metode = null;
        List<Metode> metodeList = new ArrayList<>();
        openDatabase();
        Cursor cursor = mDatabase.rawQuery("SELECT * FROM metode", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            metode = new Metode(cursor.getInt(0),cursor.getInt(1),cursor.getInt(2),cursor.getInt(3),cursor.getString(4),cursor.getString(5),cursor.getString(6));
            metodeList.add(metode);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return metodeList;
    }

    public List<Klasifikasi> getListKlasifikasi(){
        Klasifikasi klasifikasi = null;
        List<Klasifikasi> klasifikasiList = new ArrayList<>();
        openDatabase();
        Cursor cursor = mDatabase.rawQuery("SELECT * FROM klasifikasi", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            klasifikasi = new Klasifikasi(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3), cursor.getInt(4));
            klasifikasiList.add(klasifikasi);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return klasifikasiList;
    }

    public List<Klasifikasi> getListKlasifikasiByGroup(String index){
        Klasifikasi klasifikasi = null;
        List<Klasifikasi> klasifikasiList = new ArrayList<>();
        openDatabase();
        Cursor cursor = mDatabase.rawQuery("SELECT * FROM klasifikasi k WHERE k.group_index = ? ORDER BY k.kategori_id ASC", new String[] {index});
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            klasifikasi = new Klasifikasi(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3), cursor.getInt(4));
            klasifikasiList.add(klasifikasi);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return klasifikasiList;
    }

    public List<Klasifikasi> getListKlasifikasiGroup(){
        Klasifikasi klasifikasi = null;
        List<Klasifikasi> klasifikasiList = new ArrayList<>();
        openDatabase();
        Cursor cursor = mDatabase.rawQuery("SELECT * FROM klasifikasi k GROUP BY k.group_index", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            klasifikasi = new Klasifikasi(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3), cursor.getInt(4));
            klasifikasiList.add(klasifikasi);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return klasifikasiList;
    }
}
