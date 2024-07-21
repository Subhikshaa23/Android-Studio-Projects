package com.example.multiplesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar sb = (SeekBar) findViewById(R.id.seekBar);
        lv = (ListView) findViewById(R.id.listView);

        int max = 20, startingPosition = 10;

        sb.setMax(max);
        sb.setProgress(startingPosition);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int min = 1, timesTableNumber;
                if(i<min){
                    timesTableNumber = min;
                    sb.setProgress(min);
                }
                else{
                    timesTableNumber = i;
                }
                generateTimesTable(timesTableNumber);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void generateTimesTable(int timesTableNumber) {
        ArrayList<String> timesTableContent = new ArrayList<String>();
        for(int j=1; j<=20; j++) {
            timesTableContent.add(Integer.toString(timesTableNumber*j));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, timesTableContent);
        lv.setAdapter(arrayAdapter);
    }
}