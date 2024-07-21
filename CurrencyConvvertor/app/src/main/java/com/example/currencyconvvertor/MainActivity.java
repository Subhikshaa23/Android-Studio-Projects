package com.example.currencyconvvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img1 = (ImageView) findViewById(R.id.img1);
        ImageView img2 = (ImageView) findViewById(R.id.img2);
        ImageView img3 = (ImageView) findViewById(R.id.img3);
        txt = (EditText) findViewById(R.id.txt);
        Button btn = (Button) findViewById(R.id.btn);
    }
    public void convertPound(View view) {
        String amt = txt.getText().toString();
        Double amtpound = Double.parseDouble(amt);
        Double amtDollar = amtpound * 1.3;
        String amt1 = Double.toString(amtDollar);

        amt1 = String.format("%.2f",amtDollar);
        Toast.makeText(this, amt + " pounds is $" + amt1, Toast.LENGTH_LONG).show();

    }
}