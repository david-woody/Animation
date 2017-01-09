package com.adoregeek.animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/1/9 0009.
 */

public class DrawableActivity extends AppCompatActivity {
    protected ImageView ivDrawable;
    private void initView() {
        ivDrawable = (ImageView) findViewById(R.id.ivDrawable);
        ivDrawable.setBackgroundResource(R.drawable.horese);
        animationDrawable= (AnimationDrawable) ivDrawable.getBackground();
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_drawable);
        initView();
    }

    private AnimationDrawable animationDrawable;


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if(animationDrawable.isRunning()){
                animationDrawable.stop();
            }
            animationDrawable.start();
            return true;
        }
        return super.onTouchEvent(event);
    }
}
