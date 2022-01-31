package com.surajphueudin.layout_suraj_pheudin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TableLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
    }

    public void setClickedButton(View view) {
        TextView result = (TextView) findViewById(R.id.textView14);
        Button btn = (Button) findViewById(view.getId());
        String value = (String) btn.getText();
        result.setText(value);
    }
}