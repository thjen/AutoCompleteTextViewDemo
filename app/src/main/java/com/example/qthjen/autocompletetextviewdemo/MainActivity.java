package com.example.qthjen.autocompletetextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTv;
    Button btClick;
    String array[] = {"Twich", "Caitlyn", "Vayne", "Tristana", "Ezeal", "Jinx", "Kalista", "Sivir"
            , "Jhin", "Xarah", "Ashe", "Miss fortun", "Varus", "Ekko", "Fizz", "Javan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTv);
        btClick = (Button) findViewById(R.id.btClick);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, array);
        autoCompleteTv.setAdapter(arrayAdapter);
        autoCompleteTv.setThreshold(1); // gõ 1 kí tự là tìm
        autoCompleteTv.setDropDownHeight(400);

        btClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, autoCompleteTv.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
