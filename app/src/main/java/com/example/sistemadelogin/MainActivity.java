package com.example.sistemadelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Sistema SESI/SENAI");

        btnEntrar.findViewById(R.id.botaoEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent telaDeNotas = new Intent(getApplicationContext(), TelaDeNotas.class);
                startActivity(telaDeNotas);
            }
        });
    }
}