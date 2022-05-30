package com.example.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class my2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my2);

       TextView name2 = findViewById(R.id.name2);
       TextView type2 = findViewById(R.id.type2);
       TextView birth_2 = findViewById(R.id.birth_2);
       TextView typeinput2 = findViewById(R.id.typeinput2);

        SharedPreferences sharedPreferences = getSharedPreferences("MY", MODE_PRIVATE);
        String name = sharedPreferences.getString("name", "");
        String type = sharedPreferences.getString("type", "");
        String str1 = sharedPreferences.getString("year","" );
        String str2 = sharedPreferences.getString("month", "");
        String str3 = sharedPreferences.getString("day", "");



        name2.setText(name);
        type2.setText(type);
        birth_2.setText(str1+"."+str2+"."+str3);
        typeinput2.setText(type);














    }
}