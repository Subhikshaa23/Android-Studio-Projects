package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Button btn1, btn2, btn3, btn4;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        res = (TextView) findViewById(R.id.res);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txt1.getText().toString());
                int b = Integer.parseInt(txt2.getText().toString());
                int c = a + b;
                res.setText(Integer.toString(c));
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txt1.getText().toString());
                int b = Integer.parseInt(txt2.getText().toString());
                int c = a - b;
                res.setText(Integer.toString(c));
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txt1.getText().toString());
                int b = Integer.parseInt(txt2.getText().toString());
                int c = a * b;
                res.setText(Integer.toString(c));
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txt1.getText().toString());
                int b = Integer.parseInt(txt2.getText().toString());
                int c = a / b;
                res.setText(Integer.toString(c));
            }

        });
    }

}