package com.example.loginec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class login extends AppCompatActivity {

    Button b;
    RelativeLayout lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        lay=findViewById(R.id.lay);
        b=findViewById(R.id.login);
        AnimationDrawable animationDrawable= (AnimationDrawable) lay.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }

    public void home(View view) {
        Intent in=new Intent(this,MainActivity.class);
        startActivity(in);
    }
}