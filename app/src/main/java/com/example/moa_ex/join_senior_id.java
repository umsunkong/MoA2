package com.example.moa_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class join_senior_id extends AppCompatActivity {

    Button btn_next;
    EditText ed_Sid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_senior_id);

        ed_Sid = findViewById(R.id.ed_Pphone);
        btn_next = findViewById(R.id.btn_next);


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ed_Sid.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(), "아이디를 입력해주세요", Toast.LENGTH_SHORT).show();

                }else{

                    String S_ID = ed_Sid.getText().toString();

                    Intent i = new Intent(join_senior_id.this, join_senior_birth.class);

                    i.putExtra("S_ID",S_ID);

                    startActivity(i);
                    finish();

                }

            }
        });

    }
}