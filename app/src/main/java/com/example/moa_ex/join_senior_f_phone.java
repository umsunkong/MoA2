package com.example.moa_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class join_senior_f_phone extends AppCompatActivity {

    Button btn_add, btn_end;
    EditText ed_Pphone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_senior_fphone);

        ed_Pphone = findViewById(R.id.ed_Pphone);
        btn_add = findViewById(R.id.btn_next);
        btn_end = findViewById(R.id.btn_end);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ed_Pphone.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(), "가족분 연락처를 입력해주세요", Toast.LENGTH_SHORT).show();

                }else{

                    String P_PHONE = ed_Pphone.getText().toString();

                    Intent i = new Intent(join_senior_f_phone.this, join_senior_family.class);

                    i.putExtra("P_PHONE",P_PHONE);

                    startActivity(i);
                    finish();

                }

            }
        });

        btn_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ed_Pphone.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(), "가족분 연락처를 입력해주세요", Toast.LENGTH_SHORT).show();

                }else{

                    String P_PHONE = ed_Pphone.getText().toString();

                    Intent i = new Intent(join_senior_f_phone.this, talk.class);

                    i.putExtra("P_PHONE",P_PHONE);

                    startActivity(i);
                    finish();

                }

            }
        });

    }
}