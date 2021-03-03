package com.example.calculator_original;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.TelephonyScanManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showInfo(View v){
        showInfo_form(R.id.editTextTextPersonName,R.id.textView5);
        showInfo_form(R.id.editTextTextPersonName2,R.id.textView6);
        showInfo_form(R.id.editTextPhone,R.id.textView7);
    }
    public void showInfo_form(int source,int dest){
        EditText input = (EditText)findViewById(source);
        TextView output = (TextView)findViewById(dest);
        output.setText(input.getText().toString());
    }
}