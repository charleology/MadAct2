package com.example.madact2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    Button  btnConvert;
    EditText    text;
    TextView    result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnConvert = (Button)findViewById(R.id.convertButton);
        text = (EditText) findViewById(R.id.value);
        result = (TextView)findViewById(R.id.result);



        spinner = findViewById(R.id.tempSpinner);
        ArrayAdapter<CharSequence>temperatureAdapter= ArrayAdapter.createFromResource(this, R.array.temperature, android.R.layout.simple_spinner_item);
        temperatureAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(temperatureAdapter);
        spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}