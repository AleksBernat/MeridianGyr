package com.example.meridiangyr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DisplayHyrocompass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_hyrocompass);




        Button btnHyro = (Button)findViewById(R.id.buttonHyro);

        btnHyro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText N1grad = (EditText) findViewById(R.id.buttonN1grad);
                EditText N1mins = (EditText) findViewById(R.id.buttonN1mins);
                EditText N1seconds = (EditText) findViewById(R.id.buttonN1secs);

                EditText N2grad = (EditText) findViewById(R.id.buttonN2grad);
                EditText N2mins = (EditText) findViewById(R.id.buttonN2mins);
                EditText N2seconds = (EditText) findViewById(R.id.buttonN2secs);

                EditText N3grad = (EditText) findViewById(R.id.buttonN3grad);
                EditText N3mins = (EditText) findViewById(R.id.buttonN3mins);
                EditText N3seconds = (EditText) findViewById(R.id.buttonN3secs);

                EditText bettaGrad = (EditText) findViewById(R.id.buttonFormPopravkaGrad);
                EditText bettaMins = (EditText) findViewById(R.id.buttonFormPopravkaMins);
                EditText bettaSeconds = (EditText) findViewById(R.id.buttonFormPopravkaSecs);

                EditText deltaGrad = (EditText) findViewById(R.id.buttonPopravkaGrad);
                EditText deltaMins = (EditText) findViewById(R.id.buttonPopravkaMins);
                EditText deltaSeconds = (EditText) findViewById(R.id.buttonPopravkaSecs);

                EditText gammaMerApproxGrad = (EditText) findViewById(R.id.buttonMerApproxGrad);
                EditText gammaMerApproxMins = (EditText) findViewById(R.id.buttonMerApproxMins);
               // 3
                EditText gammaMerApproxSeconds = (EditText) findViewById(R.id.buttonMerApproxSecs);

                EditText resultGrad = (EditText) findViewById(R.id.buttonGradResult);
                EditText resultMins = (EditText) findViewById(R.id.buttonMinsResult);
                EditText resultSeconds = (EditText) findViewById(R.id.buttonSecsResult);


                double N1 = 0, BgradFull = 0;

                double N1gradInt = 0, N2gradInt = 0, N3gradInt = 0, N1minsInt = 0, N2minsInt = 0, N3minsInt = 0, N1secsInt = 0, N2secsInt = 0, N3secsInt = 0, bettaGradInt = 0, bettaMinsInt = 0, bettaSecsInt = 0, deltaGradInt = 0, deltaMinsInt = 0, deltaSecsInt = 0, gammaGradInt = 0, gammaMinsInt = 0, gammaSecsInt = 0, resultGradInt = 0, resultMinsInt = 0, resultSecsInt = 0;
                try {
                    N1gradInt = Double.parseDouble(N1grad.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    N2gradInt = Double.parseDouble(N2grad.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    N3gradInt = Double.parseDouble(N3grad.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    N1minsInt = Double.parseDouble(N1mins.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    N2minsInt = Double.parseDouble(N1grad.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    N2gradInt = Double.parseDouble(N2grad.getText().toString());
                } catch (NumberFormatException exception) {
                }

                if (((N1gradInt > 270 && N1gradInt < 360) && (N2gradInt >= 0 && N2gradInt < 90)) || ((N2gradInt > 270 && N2gradInt < 360) && (N1gradInt >= 0 && N1gradInt < 90)))
                    System.out.println("+ 360");
                else
                    System.out.println("Без 360");
//
//                try {
//                    BMinsWithSeconds = Double.parseDouble(Bmins.getText().toString()) + ((Double.parseDouble(Bseconds.getText().toString())) / 60);
//                } catch (NumberFormatException exception) {
//                }
//
//                try {
//                    BgradFull = Double.parseDouble(Bgrad.getText().toString()) + (BMinsWithSeconds / 60);
//                } catch (NumberFormatException exception) {
//                }
//
//                double BgradInRadians = 0,sinusB = 0;
//
//                try {
//                    BgradInRadians = Math.toRadians(BgradFull);
//                } catch (NumberFormatException exception) { ;
//                }
//                try {
//                    sinusB = Math.sin(BgradInRadians);
//                } catch (NumberFormatException exception) { ;
//                }
//
//                EditText Lgrad = (EditText) findViewById(R.id.editTextNumLgrad);
//                EditText Lmins = (EditText) findViewById(R.id.editTextNumLminutes);
//                EditText Lseconds = (EditText) findViewById(R.id.editTextNumLseconds);
//
//                double N = 0;
//
//                try {
//                    N = Math.floor(( Integer.parseInt(Lgrad.getText().toString())) / 6 + 1);
//                } catch (NumberFormatException exception) {
//                }
//
//                double Lzero = 0;
//                try {
//                    Lzero = N * 6 - 3;
//                } catch (NumberFormatException exception) {
//                }
//
////                EditText NullMerid = (EditText) findViewById(R.id.editTextNumNullMeridian);
////                String stringInt;
////                try {
////                    stringInt= Integer.toString((int)Lzero);
////                  NullMerid.setText(stringInt);
////                } catch (NumberFormatException exception) {
////                }
//
//                EditText MerApproxGrad = (EditText) findViewById(R.id.editTextNumMerApproxGrad);
//                EditText MerApproxMins = (EditText) findViewById(R.id.editTextNumMerApproxMins);
//                EditText MerApproxSeconds = (EditText) findViewById(R.id.editTextNumMerApproxSeconds);
//
//                double LgradResult = 0, LgradFull = 0, LMinsWithSeconds = 0, MerApproxGradResult = 0;
//
//                try {
//                } catch (NumberFormatException exception) {
//                }
//                try {
//                    LMinsWithSeconds = Double.parseDouble(Lmins.getText().toString()) + ((Double.parseDouble(Lseconds.getText().toString())) / 60);
//                } catch (NumberFormatException exception) {
//                }
//                try {
//                    LgradFull = Double.parseDouble(Lgrad.getText().toString()) + LMinsWithSeconds / 60;
//                } catch (NumberFormatException exception) {
//                }
//
//                LgradResult = LgradFull - (double) Lzero;
//
//                try {
//                    MerApproxGradResult = LgradResult * sinusB;
//                } catch (NumberFormatException exception) {
//                }
////
//                int degree = (int) MerApproxGradResult;
//                double rawMinute = Math.abs((MerApproxGradResult % 1) * 60);
//                int minute = (int) rawMinute;
//                int second = (int) ((rawMinute % 1) * 60);
////
//                try {
//                    MerApproxGrad.setText(Integer.toString(degree));
//                } catch (NumberFormatException exception) {
//                }
//                try {
//                    MerApproxMins.setText(Double.toString(minute));
//                } catch (NumberFormatException exception) {
//                }
//                try {
//                    MerApproxSeconds.setText(Double.toString(second));
//                } catch (NumberFormatException exception) {
//                }
//            }
            }});
    }

    }


//}