package com.example.login_signup_screen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout_1, relativeLayout_2;
    private Button signUp_btn;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {

            relativeLayout_1.setVisibility(View.VISIBLE);
            relativeLayout_2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout_1 = findViewById(R.id.relay_1);
        relativeLayout_2 = findViewById(R.id.relay_2);
        signUp_btn = findViewById(R.id.signUp_btn);
        handler.postDelayed(runnable,2000);

        signUp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,signUpActivity.class);
                startActivity(intent);
            }
        });



    }
}
