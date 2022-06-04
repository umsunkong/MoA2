package com.example.moa_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class join_senior_f_name extends AppCompatActivity {

    Button btn_next;
    EditText ed_Pname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_senior_fname);

        ed_Pname = findViewById(R.id.ed_Pphone);
        btn_next = findViewById(R.id.btn_next);


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ed_Pname.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(), "가족분의 성함을 입력해주세요", Toast.LENGTH_SHORT).show();

                }else{

                    String P_NAME = ed_Pname.getText().toString();

                    Intent i = new Intent(join_senior_f_name.this, join_senior_f_phone.class);

                    i.putExtra("P_NAME",P_NAME);

                    startActivity(i);
                    finish();

                }

            }
        });

    }
}