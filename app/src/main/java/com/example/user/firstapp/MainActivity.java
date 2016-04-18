package com.example.user.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick1(View v)
    {
        EditText v1 = (EditText)findViewById(R.id.editText);
        EditText v2 = (EditText)findViewById(R.id.editText2);
        TextView v3 = (TextView)findViewById(R.id.textView);
        int num1 = Integer.parseInt(v1.getText().toString());
        int num2 = Integer.parseInt(v2.getText().toString());
        int ans = num1+num2;
        v3.setText(Integer.toString(ans));
    }
    public void onButtonClick2(View v)
    {
        EditText v1 = (EditText)findViewById(R.id.editText);
        EditText v2 = (EditText)findViewById(R.id.editText2);
        TextView v3 = (TextView)findViewById(R.id.textView);
        int num1 = Integer.parseInt(v1.getText().toString());
        int num2 = Integer.parseInt(v2.getText().toString());
        int ans = num1-num2;
        v3.setText(Integer.toString(ans));
    }


}
