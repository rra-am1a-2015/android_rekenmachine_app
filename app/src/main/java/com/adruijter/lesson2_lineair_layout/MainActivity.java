package com.adruijter.lesson2_lineair_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    // Fields
    private int number1;
    private int number2;

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
        TextView txttest = (TextView) findViewById(R.id.number3);
        txtNumber.setText(Integer.toString(number1));
        txttest.setText(Integer.toString(number1));
    }

    public void decrementNumber2(View view)
    {
        number2 = number2 - 1;
        TextView txtNumber = (TextView) findViewById(R.id.txtNumber2);
        txtNumber.setText(Integer.toString(number2));
    }

    public void incrementNumber1(View view)
    {
        number1 = number1 + 1;
        TextView txtNumber = (TextView) findViewById(R.id.txtNumber1);
        txtNumber.setText(Integer.toString(number1));
    }

    public void incrementNumber2(View view)
    {
        number2 = number2 + 1;
        TextView txtNumber = (TextView) findViewById(R.id.txtNumber2);
        txtNumber.setText(Integer.toString(number2));
    }
}
