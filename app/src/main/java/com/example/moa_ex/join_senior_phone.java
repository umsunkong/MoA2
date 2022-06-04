package com.example.moa_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class join_senior_phone extends AppCompatActivity {

    Button btn_next;
    EditText ed_Sphone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_senior_phone);

        ed_Sphone = findViewById(R.id.ed_Pphone);
        btn_next = findViewById(R.id.btn_next);


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ed_Sphone.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(), "전화번호를 입력해주세요", Toast.LENGTH_SHORT).show();

                }else{

                    String S_PHONE = ed_Sphone.getText().toString();

                    Intent i = new Intent(join_senior_phone.this, join_senior_family.class);

                    i.putExtra("S_PHONE",S_PHONE);

                    startActivity(i);
                    finish();

                }

            }
        });

    }
}