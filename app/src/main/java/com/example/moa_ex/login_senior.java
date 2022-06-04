package com.example.moa_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class login_senior extends AppCompatActivity {

    Button btn_start, btn_join;
    EditText et_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_senior);

        et_id = findViewById(R.id.et_id);
        btn_start = findViewById(R.id.btn_start);
        btn_join = findViewById(R.id.btn_join);


        btn_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login_senior.this, join_senior_name.class);
                startActivity(i);

            }
        });

    }

    public void onResponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            boolean success = jsonObject.getBoolean("success");

            if (success) {//로그인 성공시

                String user_id = jsonObject.getString("user_id");

                Toast.makeText(getApplicationContext(), String.format("%s님 환영합니다.", user_id), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(login_senior.this, talk.class);
                startActivity(intent);

                intent.putExtra("UserId", user_id);

                startActivity(intent);

            } else {//로그인 실패시
                Toast.makeText(getApplicationContext(), "로그인에 실패하셨습니다.", Toast.LENGTH_SHORT).show();
                return;
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void onButtonLogin1(View v){
        String user_id = et_id.getText().toString();
        // 로그인 인증 절차
        // 1. 입력받은 id, pw를 서버에 전송
        // 2. 서버에서 ok, fail 정보를 반환받음
        // 3. OK 이면, isLogin = true, id와 pw를 저장
        // 4. FAIL 이면, 다시 로그인하도록 알려줌
        // 로그인 성공이면,
        Myapplication.isLogin = true;
        Myapplication.user_id = user_id;

        setContentView(R.layout.activity_talk);
    }

}