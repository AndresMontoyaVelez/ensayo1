package com.example.integral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void cancelar (View view){
        Intent c = new Intent(this, MainActivity.class);
        startActivity(c);
    }

    public void confirmar (View view){
        Intent cc = new Intent(this, index.class);
        startActivity(cc);
    }

}