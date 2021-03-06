package com.techespo.intentdemo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler = new Handler();
        handler.postDelayed(runnable,3000);
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent =  new Intent(SplashActivity.this,MainActivity.class);
            intent.putExtra("name","Dummy Name");
            startActivity(intent);
        }
    };
}
