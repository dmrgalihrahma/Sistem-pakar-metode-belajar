package com.example.damar.finalproject.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.damar.finalproject.Hasil.Kinestetik1;
import com.example.damar.finalproject.Hasil.Kinestetik2;
import com.example.damar.finalproject.Hasil.Visual1;
import com.example.damar.finalproject.Hasil.Visual2;
import com.example.damar.finalproject.R;

public class Visual2Activity extends AppCompatActivity {
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
        btn1.setText("Dengan Permainan");
        btn2.setText("Tanpa Permainan");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPermainan();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTanpaPermainan();
            }
        });

    }

    public void openPermainan() {
        Intent i = new Intent(this, Visual1.class);
        startActivity(i);
    }
    public void openTanpaPermainan() {
        Intent intent = new Intent(this, Visual2.class);
        startActivity(intent);
    }
}
