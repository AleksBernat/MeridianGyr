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
                EditText gammaMerApproxSeconds = (EditText) findViewById(R.id.buttonMerApproxSecs);

                EditText resultGrad = (EditText) findViewById(R.id.buttonGradResult);
                EditText resultMins = (EditText) findViewById(R.id.buttonMinsResult);
                EditText resultSeconds = (EditText) findViewById(R.id.buttonSecsResult);


                double NgradFull = 0, Nminsfull = 0, Nsecsfull = 0;

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
                    N2minsInt = Double.parseDouble(N2mins.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    N3minsInt = Double.parseDouble(N3mins.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    N1secsInt = Double.parseDouble(N1seconds.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    N2secsInt = Double.parseDouble(N2seconds.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    N3secsInt = Double.parseDouble(N3seconds.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    bettaGradInt = Double.parseDouble(bettaGrad.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    bettaMinsInt = Double.parseDouble(bettaMins.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    bettaSecsInt = Double.parseDouble(bettaSeconds.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    deltaGradInt = Double.parseDouble(deltaGrad.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    deltaMinsInt = Double.parseDouble(deltaMins.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    deltaSecsInt = Double.parseDouble(deltaSeconds.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    gammaGradInt = Double.parseDouble(gammaMerApproxGrad.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    gammaMinsInt = Double.parseDouble(gammaMerApproxMins.getText().toString());
                } catch (NumberFormatException exception) {
                }
                try {
                    gammaSecsInt = Double.parseDouble(gammaMerApproxSeconds.getText().toString());
                } catch (NumberFormatException exception) {
                }

                if (N3gradInt == 0 && N3minsInt == 0 && N3secsInt == 0)
                {
                    deltaGradInt = 0;
                    deltaMinsInt = 0;
                    deltaSecsInt = 0;
                }
                else
                {
                    deltaGradInt = (N3gradInt - N1gradInt)/4;
                    deltaMinsInt = (N3minsInt - N1minsInt)/4;
                    deltaSecsInt = (N3secsInt - N1secsInt)/4;
                }

                if (((N1gradInt > 270 && N1gradInt < 360) && (N2gradInt >= 0 && N2gradInt < 90)) || ((N2gradInt > 270 && N2gradInt < 360) && (N1gradInt >= 0 && N1gradInt < 90)))
                    NgradFull = (N1gradInt + N2gradInt)/2 + 180;
                else
                    NgradFull = (N1gradInt + N2gradInt)/2;

                Nminsfull = (N1minsInt + N2minsInt)/2;
                Nsecsfull = (N1secsInt + N2secsInt)/2;

                resultGradInt = NgradFull + bettaGradInt + deltaGradInt - gammaGradInt;
                resultMinsInt = Nminsfull + bettaMinsInt + deltaMinsInt - gammaMinsInt;
                resultSecsInt = Nsecsfull + bettaSecsInt + deltaSecsInt - gammaSecsInt;

                try {
                    //resultGrad.setText(Double.toString(NgradFull));
                    resultGrad.setText(Double.toString(resultGradInt));
                } catch (NumberFormatException exception) {
                }
                try {
                    //resultMins.setText(Double.toString(Nminsfull));
                    resultMins.setText(Double.toString(resultMinsInt));
                } catch (NumberFormatException exception) {
                }
                try {
                    //resultSeconds.setText(Double.toString(Nsecsfull));
                    resultSeconds.setText(Double.toString(resultSecsInt));
                } catch (NumberFormatException exception) {
                }

            }});
    }

    }


//}