package com.surajphueudin.layout_suraj_pheudin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE  = "np.com.surajpheudin.layout-suraj-pheudin.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToLinearLayout(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, LinearLayoutActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void navigateToRelativeLayout(View view) {
        Intent intent = new Intent(this, RelativeLayoutActivity.class);
        startActivity(intent);
    }

    public void navigateToTableLayout(View view) {
        Intent intent = new Intent(this, TableLayoutActivity.class);
        startActivity(intent);
    }

    public void navigateToFrameLayout(View view) {
        Intent intent = new Intent(this, FrameLayoutActivity.class);
        startActivity(intent);
    }



}