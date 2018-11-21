package com.example.tecinfo.calculamedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Double valor1;
    private Double valor2;
    private Double valor3;
    private Double valor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView titulo = (TextView) findViewById(R.id.titulo);
        final TextView nota1 = (TextView) findViewById(R.id.nota1);
        final TextView nota2 = (TextView) findViewById(R.id.nota2);
        final TextView nota3 = (TextView) findViewById(R.id.nota3);
        final TextView nota4 = (TextView) findViewById(R.id.nota4);
        final Button btn_calcular = (Button) findViewById(R.id.btn_calcular);
        final TextView resultado = (TextView) findViewById(R.id.resultado);
    }
}
