package com.adoregeek.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    protected Button btDrawable;
    protected Button btView;
    protected Button btProperty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btDrawable = (Button) findViewById(R.id.btDrawable);
        btView = (Button) findViewById(R.id.btView);
        btProperty = (Button) findViewById(R.id.btProperty);
    }

    public void drawableClick(View view) {
        Intent intent = new Intent(MainActivity.this, DrawableActivity.class);
        startActivity(intent);
    }

    public void viewClick(View view) {

    }

    public void propertyClick(View view) {

    }


}
