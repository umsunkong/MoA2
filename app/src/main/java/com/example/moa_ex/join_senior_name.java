package com.example.moa_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class join_senior_name extends AppCompatActivity {

    Button btn_next;
    EditText ed_Sname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_senior_name);

        ed_Sname = findViewById(R.id.ed_Pphone);
        btn_next = findViewById(R.id.btn_next);


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ed_Sname.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(), "성함을 입력해주세요", Toast.LENGTH_SHORT).show();

                }else{

                    String S_NAME = ed_Sname.getText().toString();

                    Intent i = new Intent(join_senior_name.this, join_senior_id.class);

                    i.putExtra("S_NAME",S_NAME);

                    startActivity(i);
                    finish();

                }

            }
        });

    }

}


