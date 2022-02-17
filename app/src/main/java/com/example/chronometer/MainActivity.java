package com.example.chronometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    // Initialize data
    Chronometer simpleChrometer;
    Button start, stop, restart, setFormat, clearFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleChrometer = findViewById(R.id.simpleChronometer);
        start = findViewById(R.id.startButton);
        stop = findViewById(R.id.stopButton);
        restart = findViewById(R.id.restartButton);
        setFormat = findViewById(R.id.setFormat);
        clearFormat = findViewById(R.id.clearFormat);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChrometer.start();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChrometer.stop();
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChrometer.setBase(SystemClock.elapsedRealtime());
            }
        });

        setFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChrometer.setFormat("Time (%s)");
            }
        });

        clearFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChrometer.setFormat(null);
            }
        });

    }
}