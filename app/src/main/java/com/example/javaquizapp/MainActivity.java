package com.example.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String []adresses={"1. Java is developed in 1989?", "2. Java is procedure oriented language?", "3. Java is developed by Sumit?", "4. Java has interfaces?",
    "5. Java has an abstract class?"};
    boolean []answers={false, false, false, true, true};
    TextView txtView;
    Button button1;
    Button button2;
    private int indx=0;
    public static int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        txtView.setText(adresses[indx]);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(indx<=adresses.length-1){
                    if(answers[indx]==true){
                        score++;
                    }
                    indx++;
                    if(indx<=adresses.length-1){
                        txtView.setText(adresses[indx]);
                    }else{
                        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(indx<=adresses.length-1){
                    if(answers[indx]==false){
                        score++;
                    }
                    indx++;
                    if(indx<=adresses.length-1){
                        txtView.setText(adresses[indx]);
                    }else{
                        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                    }
                }
            }
        });


    }
}