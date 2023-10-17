package com.example.spinnerfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Spinner spn;
TextView txt,txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn=(Spinner)findViewById(R.id.spincity);
        txt=(TextView)findViewById(R.id.fooddisp);
        txt1=(TextView)findViewById(R.id.foodfinaldisp);
        txt.setVisibility(View.INVISIBLE);
        txt1.setVisibility(View.INVISIBLE);

    }
    public void disp(View view)
    {
        txt.setVisibility(View.VISIBLE);
        txt1.setVisibility(View.VISIBLE);
        String cityname= spn.getSelectedItem().toString();
        Toast.makeText(getApplicationContext(),
                "Hello there you are in "+cityname,
                Toast.LENGTH_LONG).show();
        if(cityname.equals("Lucknow"))
        {
            txt1.setText("Biryani");
        }
        else if(cityname.equals("Mumbai"))
        {
            txt1.setText("Pao Bhaji");
        }
        else if(cityname.equals("Delhi"))
        {
            txt1.setText("Kabab");
        }
        else if(cityname.equals("Kolkata"))
        {
            txt1.setText("RasGulla");
        }
        else if(cityname.equals("Jaipur"))
        {
            txt1.setText("Bati Chokha");
        }
        else if(cityname.equals("Agra"))
        {
            txt1.setText("Petha");
        }
        else
        {
            txt.setVisibility(View.INVISIBLE);
            txt1.setVisibility(View.INVISIBLE);
        }
    }
}