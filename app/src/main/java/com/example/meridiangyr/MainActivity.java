package com.example.meridiangyr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Hyrocompass(View view) {
        Intent intent = new Intent(this, DisplayHyrocompass.class);
        startActivity(intent);
    }
    public void MeridianApproximation(View view) {
        Intent intent = new Intent(this, DisplayMeridianApprox.class);
        startActivity(intent);
    }
    public void ZoneToZoneReCalc(View view) {
        Intent intent = new Intent(this, DisplayZoneToZoneReCalc.class);
        startActivity(intent);
    }
    public void Tornado(View view) {
        Intent intent = new Intent(this, DisplayTornado.class);
        startActivity(intent);
    }
    /*@Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), OtherActivity.class);
        startActivity(intent);
    } */
}