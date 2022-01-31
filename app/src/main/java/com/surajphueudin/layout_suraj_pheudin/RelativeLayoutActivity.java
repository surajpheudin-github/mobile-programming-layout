package com.surajphueudin.layout_suraj_pheudin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }

    public void backToMainPage(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}