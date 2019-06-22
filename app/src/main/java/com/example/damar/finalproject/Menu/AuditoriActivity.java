package com.example.damar.finalproject.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.damar.finalproject.Hasil.Auditori1;
import com.example.damar.finalproject.Hasil.Auditori2;
import com.example.damar.finalproject.R;

public class AuditoriActivity extends AppCompatActivity {
    Button btn1, btn2;
    TextView text;
    String mulai = "0";
    String q1,q2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsulmetode);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        text = (TextView) findViewById(R.id.question);
        q1 = "Apakah anak cenderung lebih bisa menerima materi dengan belajar secara individu atau kelompok?";
        text.setText(q1);
        btn1.setText("Individu");
        btn2.setText("Kelompok");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIndividu();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKelompok();
            }
        });

    }

    public void openIndividu() {
        Intent i = new Intent(AuditoriActivity.this, Auditori1.class);
        startActivity(i);
    }
    public void openKelompok() {
        Intent intent = new Intent(AuditoriActivity.this, Auditori2.class);
        startActivity(intent);
    }
}
