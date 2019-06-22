package com.example.damar.finalproject.Hasil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.damar.finalproject.R;

public class Kinestetik2 extends AppCompatActivity {
    public TextView metode1, metode2, keterangan1;
    String hasil1 = "Tanpa Permainan";
    String ket1 = "bla bla bla";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        metode1 = (TextView) findViewById(R.id.txt_metode1);
        keterangan1 = (TextView) findViewById(R.id.txt_ket1);

        metode1.setText("metode 1:"+hasil1);
        keterangan1.setText("keterangan: "+ket1);

    }
}
