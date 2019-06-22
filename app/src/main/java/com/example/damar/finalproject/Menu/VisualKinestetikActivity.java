package com.example.damar.finalproject.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.damar.finalproject.Hasil.AudioKinestetik1;
import com.example.damar.finalproject.Hasil.AudioKinestetik2;
import com.example.damar.finalproject.Hasil.VisualKinestetik1;
import com.example.damar.finalproject.Hasil.VisualKinestetik2;
import com.example.damar.finalproject.R;

public class VisualKinestetikActivity extends AppCompatActivity {
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
        q1 = "Apakah anak cenderung lebih suka belajar dengan permainan atau tidak?";
        text.setText(q1);
        btn1.setText("Dengan bermain");
        btn2.setText("Tanpa bermain");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGames();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNoGames();
            }
        });

    }

    public void openGames() {
        Intent i = new Intent(VisualKinestetikActivity.this, VisualKinestetik1.class);
        startActivity(i);
    }
    public void openNoGames() {
        Intent intent = new Intent(VisualKinestetikActivity.this, VisualKinestetik2.class);
        startActivity(intent);
    }
}
