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

public class Activity2 extends AppCompatActivity {
    Spinner spinner;
    Button  btnConvert;
    EditText val;
    TextView    result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnConvert = (Button)findViewById(R.id.convertButton);
        val = (EditText) findViewById(R.id.value);
        result1 = (TextView)findViewById(R.id.result);



        spinner = findViewById(R.id.tempSpinner);
        ArrayAdapter<CharSequence>temperatureAdapter= ArrayAdapter.createFromResource(this, R.array.temperature, android.R.layout.simple_spinner_item);
        temperatureAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(temperatureAdapter);

          btnConvert.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {


                  double value = Double.parseDouble(val.getText().toString());

                  if(spinner.getSelectedItem().toString().equals("Celsius to Fahrenheit")){
                      value = value * 1.8 + 32;
                    result1.setText(String.format("%.2f °C", value));

                  }
                  else{
                  value = (value - 32) * 5 / 9;
                  result1.setText(String.format("%.2f °F", value));


              }
          }});


    }


}