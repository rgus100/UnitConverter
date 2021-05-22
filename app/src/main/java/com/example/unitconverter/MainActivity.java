package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        edittext = findViewById(R.id.edittext);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();

        if (s.isEmpty()){
            Toast.makeText(MainActivity.this, "Daal bhai text", Toast.LENGTH_SHORT).show();
        } else{
            double kg = Double.parseDouble(s);
            double pound = 2.205 * kg;
            textView2.setText("The corresponding pound value is "+ pound);
            Toast.makeText(MainActivity.this, "Use karke maza aaya na?", Toast.LENGTH_SHORT).show();


        }

            }
        });

    }
//    public void calculate(View view){
//        String s = edittext.getText().toString();
//
//        double kg = Double.parseDouble(s);
//        if (s.isEmpty()){
//            Toast.makeText(this, "Please enter some kg value", Toast.LENGTH_SHORT).show();
//        } else{
//            double pound = 2.205 * kg;
//            textView2.setText("The corresponding pound value is "+ pound);
//            Toast.makeText(this, "Thanks for using app :) ", Toast.LENGTH_SHORT).show();
//
//        }
//
//    }




}