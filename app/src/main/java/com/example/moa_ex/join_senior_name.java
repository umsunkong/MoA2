package com.example.moa_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class join_senior_name extends AppCompatActivity {

    EditText ed_Sname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_senior_name);

        ed_Sname = findViewById(R.id.ed_Sname);

    }

    public void onClickjoin2(View v) {
        String NAME = ed_Sname.getText().toString();

        // 서버에 회원정보를 전송 후 결과를 반환받음.
        // FAIL : 아이디가 중복 됨.
        // OK : 회원정보를 저장하고 -> 로그인 화면으로 이동

        // 전역변수에 저장
        Myapplication.NAME = NAME;


//        finish();// 이전화면으로 이동?
        Intent i = new Intent(this, join_senior_id.class);
        startActivity(i);
        // 메인화면 -> 로그인화면 -> 약관동의(FLAG_ACTIVITY_NO_HISTORY)->회원가입 -생성 -> 로그인화면
        //FLAG_ACTIVITY_NO_HISTORY : 액티비티 매니저 스택에 쌓이지 않음.

    }
}


