package com.example.exp7;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int ch=1;
    float font=30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView t=(TextView) findViewById(R.id.TextView);
        Button b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setTextSize(font);
                font=font+5;
                if (font==50)
                    font=30;
            }
        });
        setContentView(R.layout.activity_main);
        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (ch){
                    case 1: t.setTextColor(Color.BLACK);
                    break;
                    case 2: t.setTextColor(Color.MAGENTA);
                    break;
                    case 3: t.setTextColor(Color.GRAY);
                    break;
                    case 4: t.setTextColor(Color.CYAN);
                }
                ch++;
                if(ch==5)
                    ch=1;
            }
        });
    }
}