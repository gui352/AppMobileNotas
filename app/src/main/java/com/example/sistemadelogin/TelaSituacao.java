package com.example.sistemadelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaSituacao extends AppCompatActivity {

    Button btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_situacao);

        btnSair = findViewById(R.id.botaoSair);

        btnSair.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent telaInicial = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(telaInicial);
                }
        });
    }
}