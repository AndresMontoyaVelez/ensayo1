package com.example.integral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }


    public void cierre (View view){
        Intent c = new Intent(this, MainActivity.class);
        startActivity(c);
        finish();
    }

}