package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    TextView textArray;
    Button mainButton;
    Button deleteButton;
    Button substrButton;
    Button countButton;
    int score = 0;
    ArrayList<Integer> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.main_text);
        textArray = (TextView) findViewById(R.id.text_array);
        mainButton = (Button) findViewById(R.id.main_btn);
        deleteButton = (Button) findViewById(R.id.btnDel);
        substrButton = (Button) findViewById(R.id.btnSubstr);
        countButton = (Button) findViewById(R.id.btnCount);

        View.OnClickListener clickListenerMain = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                String s = "Нажатий: " + score;
                mainText.setText(s);
            }
        };

        View.OnClickListener clickListenerSubstr = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score -= 1;
                String s = "Нажатий: " + score;
                mainText.setText(s);
            }
        };

        View.OnClickListener clickListenerDelete = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(score);
                textArray.setText(arrayList.toString());
            }
        };

        View.OnClickListener clickListenerCount = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.clear();
                textArray.setText("");
            }
        };

        mainButton.setOnClickListener(clickListenerMain);
        deleteButton.setOnClickListener(clickListenerDelete);
        substrButton.setOnClickListener(clickListenerSubstr);
        countButton.setOnClickListener(clickListenerCount);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}