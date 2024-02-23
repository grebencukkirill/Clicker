package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    TextView textArray1;
    TextView textArray2;
    TextView textArray3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textArray1 = (TextView) findViewById(R.id.textView1);
        textArray2 = (TextView) findViewById(R.id.textView2);
        textArray3 = (TextView) findViewById(R.id.textView3);

        int x;
        int a = (int) ( Math.random() * 10 );
        ArrayList<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < a; i++)
        {
            x = (int) ( Math.random() * 10 );
            array1.add(x);
        }
        textArray1.setText(array1.toString());

        a = (int) ( Math.random() * 10 );
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = 0; i < a; i++)
        {
            x = (int) ( Math.random() * 10 );
            array2.add(x);
        }
        textArray2.setText(array2.toString());

        a = (int) ( Math.random() * 10 );
        ArrayList<Integer> array3 = new ArrayList<>();
        for (int i = 0; i < a; i++)
        {
            x = (int) ( Math.random() * 10 );
            array3.add(x);
        }
        textArray3.setText(array3.toString());

        TextView textView = new TextView(this);
        textView.setPadding(16, 16, 16, 16);
        textView.setText("SecondActivity");
    }
}