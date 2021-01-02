package com.example.loginec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout layout;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.layout);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.register);
        AnimationDrawable animationDrawable= (AnimationDrawable) layout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

    }

    public void login(View view) {
        Intent in=new Intent(this,login.class);
        startActivity(in);
    }

    public void register(View view) {
        Intent in=new Intent(this,register.class);
        startActivity(in);
    }
}