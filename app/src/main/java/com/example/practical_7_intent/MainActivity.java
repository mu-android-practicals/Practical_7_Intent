package com.example.practical_7_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.btn);
        EditText input=findViewById(R.id.inoutTxt);

        button.setOnClickListener(v -> {
            String Data = input.getText().toString();

            Intent intent=new Intent(this, MainActivity2.class);
            intent.putExtra("data",Data);
            startActivity(intent);


        });
    }
}