package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
    }

    public void Drink(View V){
        Intent i = new Intent(this, Drink.class);
        startActivity(i);
    }

    public void Snaks(View V){
        Intent i = new Intent(this, Snaks.class);
        startActivity(i);
    }

    public void Foods(View V){
        Intent i = new Intent(this, Foods.class);
        startActivity(i);
    }


}