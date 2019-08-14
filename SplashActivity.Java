package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Run SplashActivity in a separate Thread, wait for 2 second, and terminate

        Thread timer = new thread() {
            public void run () {
                try{
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent myintent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity (myintent);
                }
            }
        };
        timer.start();
    }
}
