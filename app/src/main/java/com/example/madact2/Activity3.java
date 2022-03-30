package com.example.madact2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    AutoCompleteTextView currencyAuto;
    Double res1, temp3;
    String temp2;
    TextView resultView;
    EditText inputView;
    Button convertBtn;
    String[] curr = {"US Dollar to PH Peso", "PH Peso to US Dollar", "South Korean Won to PH Peso", "PH Peso to South Korean Won"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        currencyAuto = findViewById(R.id.autoTv);
        resultView = findViewById(R.id.resultView);
        inputView = findViewById(R.id.inputView);
        convertBtn = findViewById(R.id.convertBtn);

        ArrayAdapter<String> adapt = new ArrayAdapter<>(Activity3.this, android.R.layout.select_dialog_item, curr);
        currencyAuto.setAdapter(adapt);
        currencyAuto.setThreshold(2);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                temp2 = inputView.getText().toString();
                try {
                    temp3 = Double.parseDouble(temp2);
                }catch (NumberFormatException e) {}

                String temp1 = currencyAuto.getText().toString();
                if(temp1.equals("US Dollar to PH Peso")){
                    res1 = temp3 * 52.170130;
                    resultView.setText("Result: " + res1 + " PHP");
                }
                else if(temp1.equals("PH Peso to US Dollar")){
                    res1 = temp3 * 0.019168;
                    resultView.setText("Result: " + res1 + " USD");
                }
                else if(temp1.equals("South Korean Won to PH Peso")){
                    res1 = temp3 * 0.042572;
                    resultView.setText("Result: " + res1 + " PHP");
                }
                else if(temp1.equals("PH Peso to South Korean Won")){
                    res1 = temp3 * 23.489683;
                    resultView.setText("Result: " + res1 + " KRW");
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