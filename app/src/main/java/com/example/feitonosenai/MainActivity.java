package com.example.feitonosenai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        // Espera 2 Segundos antes de começar
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                iniciaProgressBar();
            }
        }, 2000);

   }

   private void iniciaProgressBar() {
        if (i < 100) {
            progressBar.setProgress(i++);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    iniciaProgressBar();
                }
            }, 50);
        } else
            comecaLogin();
   }

    private void comecaLogin() {
        Intent intencao = new Intent(this, LoginActivity.class);
        startActivity(intencao);
    }
}