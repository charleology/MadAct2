package com.example.madact2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String names [] = {"Temperature Conversion","Currency Consversion", "Length Conversion"};
    ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv1=(ListView)findViewById(R.id.lv1);
        ArrayAdapter<String> lvAdapter=new ArrayAdapter<String>(this, R.layout.mainact_list,R.id.tv3,names);
        lv1.setAdapter(lvAdapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    //Act2
                    startActivity(new Intent(MainActivity.this, Activity2.class));
                }
            }
        });

    }
}