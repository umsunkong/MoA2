package com.example.moa_ex;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class join_senior_family extends AppCompatActivity {

    RadioGroup R_group;
    RadioButton r_btn1,r_btn2,r_btn3,r_btn4,r_btn5,r_btn6;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_senior_family);


        R_group = (RadioGroup)findViewById(R.id.R_group);

        r_btn1 = (RadioButton)findViewById(R.id.r_btn1);
        r_btn2 = (RadioButton)findViewById(R.id.r_btn2);
        r_btn3 = (RadioButton)findViewById(R.id.r_btn3);
        r_btn4 = (RadioButton)findViewById(R.id.r_btn4);
        r_btn5 = (RadioButton)findViewById(R.id.r_btn5);
        r_btn6 = (RadioButton)findViewById(R.id.r_btn6);

        btn_next = findViewById(R.id.btn_next);


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RadioGroup.OnCheckedChangeListener radioGroupButtonChangeListener = new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                        if (i == R.id.r_btn1) {

                        } else if (i == R.id.r_btn2) {

                        } else if (i == R.id.r_btn3) {

                        } else if (i == R.id.r_btn4) {

                        } else if (i == R.id.r_btn5) {

                        } else {

                        }
                    }
                };
            }
         });

    }
}