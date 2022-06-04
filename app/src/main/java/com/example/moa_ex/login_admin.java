package com.example.moa_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class login_admin extends AppCompatActivity {

    EditText et_id, et_pw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);

        et_id = findViewById(R.id.et_id);
        et_pw = findViewById(R.id.et_pw);




    }

    public void onResponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            boolean success = jsonObject.getBoolean("success");

            if (success) {//로그인 성공시

                String admin_id = jsonObject.getString("admin_id");
                String pw = jsonObject.getString("pw");

                Toast.makeText(getApplicationContext(), String.format("%s님 환영합니다.", admin_id), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(login_admin.this, search.class);
                startActivity(intent);

                intent.putExtra("UserId", admin_id);
                intent.putExtra("UserPw", pw);

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
        String admin_id = et_id.getText().toString();
        String pw = et_pw.getText().toString();

        Myapplication.isLogin = true;
        Myapplication.admin_id = admin_id;
        Myapplication.pw = pw;

        setContentView(R.layout.activity_user_search);

    }

    public void onClickJoin(View v) {
        //다른 화면(액티비티)로 이동
        //자신 액티비티 객체, 이동할 액티비티 클래스
        Intent i = new Intent(this, join_admin.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY); // 액티비티 스택에 쌓이지 않음
        startActivity( i );
    }

}