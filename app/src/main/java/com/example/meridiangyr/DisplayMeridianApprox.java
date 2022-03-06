package com.example.meridiangyr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DisplayMeridianApprox extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_meridian_approx);

        Button btnFind = (Button)findViewById(R.id.buttonFind);

        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText Bgrad = (EditText) findViewById(R.id.editTextNumBgrad);
                EditText Bmins = (EditText) findViewById(R.id.editTextNumBminutes);
                EditText Bseconds = (EditText) findViewById(R.id.editTextNumBseconds);

                double BMinsWithSeconds = 0, BgradFull = 0;

                try {
                     BMinsWithSeconds = Double.parseDouble(Bmins.getText().toString()) + ((Double.parseDouble(Bseconds.getText().toString())) / 60);
                } catch (NumberFormatException exception) {
                }

                try {
                     BgradFull = Double.parseDouble(Bgrad.getText().toString()) + (BMinsWithSeconds / 60);
                } catch (NumberFormatException exception) {
                }

                double BgradInRadians = 0,sinusB = 0;

                try {
                    BgradInRadians = Math.toRadians(BgradFull);
                } catch (NumberFormatException exception) { ;
                }
                try {
                    sinusB = Math.sin(BgradInRadians);
                } catch (NumberFormatException exception) { ;
                }

                EditText Lgrad = (EditText) findViewById(R.id.editTextNumLgrad);
                EditText Lmins = (EditText) findViewById(R.id.editTextNumLminutes);
                EditText Lseconds = (EditText) findViewById(R.id.editTextNumLseconds);

                double N = 0;

                try {
                    N = Math.floor(( Integer.parseInt(Lgrad.getText().toString())) / 6 + 1);
                } catch (NumberFormatException exception) {
                }

                double Lzero = 0;
                try {
                    Lzero = N * 6 - 3;
                } catch (NumberFormatException exception) {
                }

//                EditText NullMerid = (EditText) findViewById(R.id.editTextNumNullMeridian);
//                String stringInt;
//                try {
//                    stringInt= Integer.toString((int)Lzero);
//                  NullMerid.setText(stringInt);
//                } catch (NumberFormatException exception) {
//                }

                EditText MerApproxGrad = (EditText) findViewById(R.id.editTextNumMerApproxGrad);
                EditText MerApproxMins = (EditText) findViewById(R.id.editTextNumMerApproxMins);
                EditText MerApproxSeconds = (EditText) findViewById(R.id.editTextNumMerApproxSeconds);

                double LgradResult = 0, LgradFull = 0, LMinsWithSeconds = 0, MerApproxGradResult = 0;

                try {
                } catch (NumberFormatException exception) {
                }
                try {
                LMinsWithSeconds = Double.parseDouble(Lmins.getText().toString()) + ((Double.parseDouble(Lseconds.getText().toString())) / 60);
                } catch (NumberFormatException exception) {
                }
                try {
                LgradFull = Double.parseDouble(Lgrad.getText().toString()) + LMinsWithSeconds / 60;
                } catch (NumberFormatException exception) {
                }

                LgradResult = LgradFull - (double) Lzero;

                try {
                    MerApproxGradResult = LgradResult * sinusB;
                } catch (NumberFormatException exception) {
                }
//
                int degree = (int) MerApproxGradResult;
                double rawMinute = Math.abs((MerApproxGradResult % 1) * 60);
                int minute = (int) rawMinute;
                int second = (int) ((rawMinute % 1) * 60);
//
                try {
                    MerApproxGrad.setText(Integer.toString(degree));
                } catch (NumberFormatException exception) {
                }
                try {
                    MerApproxMins.setText(Double.toString(minute));
                } catch (NumberFormatException exception) {
                }
                try {
                    MerApproxSeconds.setText(Double.toString(second));
                } catch (NumberFormatException exception) {
                }
            }
        });
    }
}