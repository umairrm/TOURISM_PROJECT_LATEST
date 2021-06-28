package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class splash_screen extends AppCompatActivity {
    private static final int SPLASH_SCREEN =2000;
    ImageView OpenScreen;
    Button GoButton;
    Animation rotate_anim;
    Animation anim_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        rotate_anim = (Animation) AnimationUtils.loadAnimation(this,R.anim.rotate_anim);
        anim_2 = (Animation) AnimationUtils.loadAnimation(this,R.anim.anim_2);
        OpenScreen=(ImageView)findViewById(R.id.OpenScreen);
        GoButton=(Button) findViewById(R.id.GoButton);
        OpenScreen.setAnimation(rotate_anim);
        GoButton.setAnimation(anim_2);
        GoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(splash_screen.this,Sign_up.class);
                startActivity(intent);
                finish();}
        });
    }
}