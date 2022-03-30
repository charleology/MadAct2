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

    String names [] = {"Temperature Conversion","Currency Conversion", "Length Conversion"};
    ListView lv1;
    Button button;
    int goTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        lv1=(ListView)findViewById(R.id.lv1);
        ArrayAdapter<String> lvAdapter=new ArrayAdapter<String>(this, R.layout.mainact_list,R.id.tv3,names);
        lv1.setAdapter(lvAdapter);

        button.setEnabled(false);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    //Act2
                    goTo = i;
                    button.setEnabled(true);
                }
                else if (i==1){
                    goTo = i;
                    button.setEnabled(true);
                }
                else if (i==2) {
                    goTo = i;
                    button.setEnabled(true);
                }

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (goTo) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, Activity2.class));
                        finish();
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, Activity3.class));
                        finish();
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, Activity4.class));
                        finish();
                        break;
                }
            }
        });
    }
}