package com.example.moa_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class login_senior extends AppCompatActivity {

    EditText et_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_senior);

        et_id = findViewById(R.id.et_id);
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

    public void onButtonLogin(View v){
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

    public void onClickJoin(View v) {
        //다른 화면(액티비티)로 이동
        //자신 액티비티 객체, 이동할 액티비티 클래스
        Intent i = new Intent(this, join_senior_name.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY); // 액티비티 스택에 쌓이지 않음
        startActivity( i );
    }

}