package com.oilaviy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView txtViewName1 = findViewById(R.id.menu_item_1);
        Log.i("MainActivity.java" , txtViewName1.getText().toString());


        // Find second menu item TextView and print the text to the logs
        TextView textView2 = findViewById(R.id.menu_item_2);
        Log.i("MainActivity.java", textView2.getText().toString());

        // Find third menu item TextView and print the text to the logs
        TextView textView3 = findViewById(R.id.menu_item_3);
        Log.i("MainActivity.java", textView3.getText().toString());

    }
}