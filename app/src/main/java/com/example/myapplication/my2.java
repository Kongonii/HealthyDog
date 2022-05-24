package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class my2 extends AppCompatActivity {
    TextView name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my2);

        Intent receive_intent = getIntent();


        name2 = findViewById(R.id.name2);

        String name = receive_intent.getStringExtra("이름");



        name2.setText(name);







    }
}
