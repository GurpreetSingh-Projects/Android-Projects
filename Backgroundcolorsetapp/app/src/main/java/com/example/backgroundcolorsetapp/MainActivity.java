package com.example.backgroundcolorsetapp;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  RelativeLayout layout=(RelativeLayout)findViewById(R.id.layout_colour);
        RadioGroup group1;
        group1 = (RadioGroup)findViewById(R.id.group1);
        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.Pink_colour)
                {
                    group1.setBackgroundColor(Color.MAGENTA);
                }
                else if(checkedId==R.id.Blue_colour)
                {
                    group1.setBackgroundColor(Color.BLUE);
                }
                else if(checkedId==R.id.Green_colour)
                {
                    group1.setBackgroundColor(Color.GREEN);
                }
                else if(checkedId==R.id.Yellow_colour)
                {
                    group1.setBackgroundColor(Color.YELLOW);
                }
                else if(checkedId==R.id.Red_colour)
                {
                    group1.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}