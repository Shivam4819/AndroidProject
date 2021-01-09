package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button addButton;
    Button subButton;
    Button mulButton;
    Button divButton;
    EditText value1;
    EditText value2;
    TextView displayBox;
    int val1=0;
    int val2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton= findViewById(R.id.addButton);
        subButton=findViewById(R.id.subButton);
        mulButton=findViewById(R.id.mulButton);
        divButton=findViewById(R.id.divButton);
        value1=findViewById(R.id.editbox1);
        value2=findViewById(R.id.editbox2);
        displayBox=findViewById(R.id.textView1);

       /* addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }); this is other way to represrt below code write add logic in this code area and delete
             implent part from top is from class*/
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        mulButton.setOnClickListener(this);
        divButton.setOnClickListener(this);


    }

    // @Override
    public void onClick(View v) {
        int result=0;
        val1=Integer.parseInt(value1.getText().toString());
        val2=Integer.parseInt(value2.getText().toString());

        if(v.getId()==R.id.addButton){
            result=val1+val2;
            displayBox.setText(String.valueOf(result));
        }
        if(v.getId()==R.id.subButton){
            result=val1-val2;
            displayBox.setText(String.valueOf(result));
        }
        if(v.getId()==R.id.mulButton){
            result=val1*val2;
            displayBox.setText(String.valueOf(result));
        }
        if(v.getId()==R.id.divButton){
            result=val1/val2;
            displayBox.setText(String.valueOf(result));
        }
    }

}