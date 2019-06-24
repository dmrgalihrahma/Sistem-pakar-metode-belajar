package com.example.damar.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.damar.finalproject.model.Klasifikasi;

public class MainActivity extends AppCompatActivity {
    ImageButton btn_konsulMetode, btn_konsultasi, btn_metode, btn_history, btn_help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_konsultasi = (ImageButton) findViewById(R.id.btn_konsultasi);
        btn_konsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKonsultasi();
            }
        });
        btn_metode = (ImageButton) findViewById(R.id.btn_metode);
        btn_metode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMetode();
            }
        });
        btn_history = (ImageButton) findViewById(R.id.btn_history);
        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHistory();
            }
        });
        btn_help = (ImageButton) findViewById(R.id.btn_help);
        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHelp();
            }
        });
        btn_konsulMetode = (ImageButton) findViewById(R.id.btn_konsulMetode);
        btn_konsulMetode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKonsulMetode();
            }
        });
    }
    public void openKonsultasi(){
        Intent intent = new Intent(this, KlasifikasiActivity.class);
        startActivity(intent);
    }
    public void openMetode(){
        Intent intent = new Intent(this, MetodeActivity.class);
        startActivity(intent);
    }
    public void openHistory(){
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }
    public void openHelp(){
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }
    public void openKonsulMetode(){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
