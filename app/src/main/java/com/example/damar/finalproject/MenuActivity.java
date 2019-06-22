package com.example.damar.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.damar.finalproject.Hasil.AudioVisual1;
import com.example.damar.finalproject.Hasil.Kinestetik1;
import com.example.damar.finalproject.Menu.AudioKinestetikActivity;
import com.example.damar.finalproject.Menu.AuditoriActivity;
import com.example.damar.finalproject.Menu.KinestetikActivity;
import com.example.damar.finalproject.Menu.VisualActivity;
import com.example.damar.finalproject.Menu.VisualKinestetikActivity;

public class MenuActivity extends AppCompatActivity {
    Button auditori, visual, kinestetik, audiovisual, audiokinestetik, visualkinestetik;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        auditori = (Button) findViewById(R.id.btn_auditori);
        auditori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAuditori();
            }
        });
        visual = (Button) findViewById(R.id.btn_visual);
        visual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVisual();
            }
        });
        kinestetik = (Button) findViewById(R.id.btn_kinestetik);
        kinestetik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKinestetik();
            }
        });
        audiovisual = (Button) findViewById(R.id.btn_av);
        audiovisual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAudioVisual();
            }
        });
        audiokinestetik = (Button) findViewById(R.id.btn_ak);
        audiokinestetik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAudioKinestetik();
            }
        });
        visualkinestetik = (Button) findViewById(R.id.btn_vk);
        visualkinestetik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVisualKinestetik();
            }
        });
    }

    private void openAuditori() {
        Intent i = new Intent(this, AuditoriActivity.class);
        startActivity(i);
    }

    private void openVisual() {
        Intent i = new Intent(this, VisualActivity.class);
        startActivity(i);
    }

    private void openKinestetik() {
        Intent i = new Intent(this, KinestetikActivity.class);
        startActivity(i);
    }

    private void openAudioVisual() {
        Intent i = new Intent(this, AudioVisual1.class);
        startActivity(i);
    }

    private void openAudioKinestetik() {
        Intent i = new Intent(this, AudioKinestetikActivity.class);
        startActivity(i);
    }

    private void openVisualKinestetik() {
        Intent i = new Intent(this, VisualKinestetikActivity.class);
        startActivity(i);
    }
}
