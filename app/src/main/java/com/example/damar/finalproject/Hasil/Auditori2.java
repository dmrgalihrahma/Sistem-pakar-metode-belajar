package com.example.damar.finalproject.Hasil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.damar.finalproject.R;

public class Auditori2 extends AppCompatActivity {
    public TextView metode1, metode2, metode3, keterangan1, keterangan2, keterangan3;
    String hasil1 = "Metode Diskusi Umum";
    String ket1 = "bla bla bla";
    String hasil2 = "Metode Panel dan Seminar";
    String ket2 = "bla bla bla";
    String hasil3 = "Metode Sumbang Saran";
    String ket3 = "bla bla bla";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        metode1 = (TextView) findViewById(R.id.txt_metode1);
        keterangan1 = (TextView) findViewById(R.id.txt_ket1);
        metode2 = (TextView) findViewById(R.id.txt_metode2);
        keterangan2 = (TextView) findViewById(R.id.txt_ket2);
        metode3 = (TextView) findViewById(R.id.txt_metode3);
        keterangan3 = (TextView) findViewById(R.id.txt_ket3);

        metode1.setText("1. "+hasil1);
        keterangan1.setText("keterangan: "+ket1);
        metode2.setText("2. "+hasil2);
        keterangan2.setText("keterangan: "+ket2);
        metode3.setText("3. "+hasil3);
        keterangan3.setText("keterangan: "+ket3);
    }
}
