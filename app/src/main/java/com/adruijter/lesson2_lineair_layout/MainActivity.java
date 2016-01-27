package com.adruijter.lesson2_lineair_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    // Fields
    private int number1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void decrementNumber1(View view)
    {
        number1 = number1 - 1;
        TextView txtNumber = (TextView) findViewById(R.id.txtNumber1);
        txtNumber.setText(Integer.toString(number1));
    }
}
