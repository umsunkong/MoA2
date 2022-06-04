package com.example.moa_ex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

    public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;
    search search;
    calender calender;
    contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnv = findViewById(R.id.bnv);
        search = new search();
        calender = new calender();
        contact = new contact();

        // replace(프래그먼트를 보여줄 FrameLayout id, 화면에 출력한 프래그먼트 객체)
        getSupportFragmentManager().beginTransaction().replace(R.id.container, search).commit();

        bnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();

                if(itemId == R.id.tab1){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,search).commit();
                }else if(itemId == R.id.tab2){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,calender).commit();
                }else{
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,contact).commit();
                }
                return false;
            }
        });
    }

    }

