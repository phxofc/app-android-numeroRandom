package com.example.foddapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View view){
        TextView textResultado;
        textResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(11);
        //serve para set texto em alguma variavel
        textResultado.setText("número sorteado foi: "+numero);



    }








}