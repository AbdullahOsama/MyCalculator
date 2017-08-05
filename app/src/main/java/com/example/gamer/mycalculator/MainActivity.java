package com.example.gamer.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private float num1,num2,result;
    private TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (TextView)findViewById(R.id.text_view);
    }
    public void onClick(View view)
    {
        screen.append(((Button)view).getText());
    }
    public void onClickdot (View view)
    {
        String value = screen.getText().toString();
        if (value.contains("."))
        {

        }
        screen.append(((Button) view).getText());

    }
    public void ClearClick(View view)
    {
        screen.setText("");
    }
    public void calculate(View view){
        String value = screen.getText().toString();
        String[] st;
        if (value.contains("+")) {
            st = value.split("\\+");
            num1 = Float.parseFloat(st[0]);
            num2 = Float.parseFloat(st[1]);
            result = num1 + num2;
            screen.setText(String.valueOf(result));
        } else if (value.contains("-")) {
            st = value.split("\\-");
            num1 = Float.parseFloat(st[0]);
            num2 = Float.parseFloat(st[1]);
            result = num1 - num2;
            screen.setText(String.valueOf(result));
        } else if (value.contains("*")) {
            st = value.split("\\*");
            num1 = Float.parseFloat(st[0]);
            num2 = Float.parseFloat(st[1]);
            result = num1 * num2;
            screen.setText(String.valueOf(result));}
        else if (value.contains("/")) {
            st = value.split("\\/");
            num1 = Float.parseFloat(st[0]);
            num2 = Float.parseFloat(st[1]);
            result = num1 / num2;
            screen.setText(String.valueOf(result));
        }
    }

}
