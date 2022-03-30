package com.example.madact2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Spinner spinner;
        Button convert;
        EditText amount;
        TextView result;

            convert =(Button)findViewById(R.id.btn1);
            amount = (EditText)findViewById(R.id.editText1);
            spinner = (Spinner)findViewById(R.id.spinner1);
            result = (TextView )findViewById(R.id.result1);

            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.units, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);


            convert.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {

                    double value = Double.parseDouble(amount.getText().toString());
                    if (spinner.getSelectedItem().toString().equals("Meter to Inches"))
                    {
                        value/= 0.0254;
                        result.setText(String.format("%.2f",value));
                    }
                    else if(spinner.getSelectedItem().toString().equals("Inches to Meter"))
                    {
                        value*= 0.0254;
                        result.setText(String.format("%.2f",value));
                    }
                    else if(spinner.getSelectedItem().toString().equals("Meter to Centimeter"))
                    {
                        value*= 100;
                        result.setText(String.format("%.2f",value));
                    }
                    else if(spinner.getSelectedItem().toString().equals("Centimeter to Meter"))
                    {
                        value/= 100;
                        result.setText(String.format("%.2f",value));
                    }


                }
            });



    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
    }
