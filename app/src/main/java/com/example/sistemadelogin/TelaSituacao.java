package com.example.sistemadelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaSituacao extends AppCompatActivity implements View.OnClickListener {

    Button btnSair;
    private TextView showNome;
    private TextView showMedia;
    private TextView showSituacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_situacao);

        showNome = findViewById(R.id.showNome);
        showMedia = findViewById(R.id.showMedia);
        showSituacao = findViewById(R.id.showSituacao);

        Intent it = getIntent();
        if (it != null) {
            Bundle params = it.getExtras();
            if (params != null) {
                showNome.setText(params.getString("nomeAluno"));
                float media = params.getFloat("mediaAluno");
                String situacao = Float.toString(media);
                showMedia.setText(situacao);
                if (media > 7) {
                    showSituacao.setText("APROVADO");
                } else {
                    showSituacao.setText("REPROVADO");
                }
            }
        }

        btnSair = findViewById(R.id.botaoSair);
        btnSair.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}