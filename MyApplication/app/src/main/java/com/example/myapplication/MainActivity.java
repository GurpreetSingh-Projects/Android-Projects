package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView convertmilestokm,enterval,miles,km,dispval,name;
    EditText viewmiles;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewmiles=findViewById(R.id.viewmiles);
        convertmilestokm=findViewById(R.id.convertmilestokm);
        enterval=findViewById(R.id.enterval);
        miles=findViewById(R.id.miles);
        km=findViewById(R.id.km);
        dispval=findViewById(R.id.dispval);
    }

    public void calculate()
    {
        double val=0,val1=0;
        val=Double.parseDouble(viewmiles.getText().toString());
        val1=val*1.609;
        dispval.setText(String.valueOf(val1));
    }
    public void Evento(View v)
    {

        calculate();
    }

}