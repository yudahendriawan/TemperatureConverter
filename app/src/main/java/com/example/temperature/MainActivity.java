package com.example.temperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button cToF, fToC;
    private TextView result;
    private EditText enterTemp;
    double result0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cToF = (Button) findViewById(R.id.cToF);
        fToC = (Button) findViewById(R.id.fToC);
        result = (TextView) findViewById(R.id.result);
        enterTemp = (EditText) findViewById(R.id.enterTemp);

        cToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = (temp*1.8)+32;
                result.setText(String.valueOf(result0));
            }
        });

        fToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = (temp-32)/1.8;
                result.setText(String.valueOf(result0));
            }
        });
    }

}
