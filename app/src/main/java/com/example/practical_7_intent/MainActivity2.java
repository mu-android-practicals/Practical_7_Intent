package com.example.practical_7_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv = findViewById(R.id.textView);

        String passedData = getIntent().getExtras().getString("data");
        tv.setText("Text from previous activity : "+passedData);
    }
}