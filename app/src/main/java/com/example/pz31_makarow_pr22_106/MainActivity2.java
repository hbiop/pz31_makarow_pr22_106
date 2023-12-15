package com.example.pz31_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
Button btn;
TextView a;
int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
        a = findViewById(R.id.textView);
    }

    @Override
    public void onClick(View v) {
        i++;
        a.setText("Кол-во нажатий " + i);
    }
}