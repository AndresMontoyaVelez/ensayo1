package com.example.integral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }

    public void iniciar(View view){
        Intent i = new Intent(this, index.class);
        startActivity(i);
    }


    public  void back(View view){
        Intent b = new Intent(this, MainActivity.class);
        startActivity(b);
    }




}
