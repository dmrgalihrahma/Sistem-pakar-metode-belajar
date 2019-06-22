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
import com.example.damar.finalproject.Hasil.Kinestetik1;
import com.example.damar.finalproject.Hasil.Kinestetik2;
import com.example.damar.finalproject.R;

public class KinestetikActivity extends AppCompatActivity {
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
        q1 = "Apakah anak cenderung lebih bisa menerima materi dengan belajar di dalam ruangan (Indoor) atau di luar ruangan (Outdoor)?";
        text.setText(q1);
        btn1.setText("Indoor");
        btn2.setText("Outdoor");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIndoor();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOutdoor();
            }
        });

    }

    public void openIndoor() {
        Intent i = new Intent(KinestetikActivity.this, Kinestetik1.class);
        startActivity(i);
    }
    public void openOutdoor() {
        Intent intent = new Intent(KinestetikActivity.this, Kinestetik2.class);
        startActivity(intent);
    }
}
