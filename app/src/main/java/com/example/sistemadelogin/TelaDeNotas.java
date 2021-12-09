package com.example.sistemadelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaDeNotas extends AppCompatActivity {

    private EditText nome, nota1, nota2, nota3, nota4;

    private TextView showNome;
    private TextView showMedia;
    private TextView showSituacao;

    Button btnCancelar, btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_notas);

        setTitle("Tela de Cadastro de Notas");

        btnCancelar = findViewById(R.id.botaoCancelar);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnCadastrar.findViewById(R.id.botaoCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent telaDeSituacao = new Intent(getApplicationContext(), TelaSituacao.class);
                startActivity(telaDeSituacao);
            }
        });

        nota1 = findViewById(R.id.nota1);
        nota2 = findViewById(R.id.nota2);
        nota3 = findViewById(R.id.nota3);
        nota4 = findViewById(R.id.nota4);
        nome = findViewById(R.id.nomeAluno);

        showNome = findViewById(R.id.showNome);
        showMedia = findViewById(R.id.showMedia);
        showSituacao = findViewById(R.id.showSituacao);
    }

    public void calcularMedia(View view) {
        float media;
        float x = 4;

        float valor1 = Integer.parseInt(nota1.getText().toString());
        float valor2 = Integer.parseInt(nota2.getText().toString());
        float valor3 = Integer.parseInt(nota3.getText().toString());
        float valor4 = Integer.parseInt(nota4.getText().toString());

        media = ( valor1 + valor2 + valor3 + valor4 ) / x;

        showMedia.setText(String.valueOf(( valor1 + valor2 + valor3 + valor4 ) / x));

        if(media < 7){
            showSituacao.setText("Infelizmente você reprovou");
        }else if (media >= 7){
            showSituacao.setText("Parabéns você está aprovado");
        }else {
            showSituacao.setText("Error 404");
        }
    }
}