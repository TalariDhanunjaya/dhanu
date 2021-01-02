package com.example.loginec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class register extends AppCompatActivity {

    Button br1;
    RelativeLayout la;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        la=findViewById(R.id.register_lay);
        br1=findViewById(R.id.br1);
        AnimationDrawable animationDrawable= (AnimationDrawable) la.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }

    public void back(View view) {
        Intent in=new Intent(this,MainActivity.class);
        startActivity(in);
    }
}