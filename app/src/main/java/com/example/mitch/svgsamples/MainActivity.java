package com.example.mitch.svgsamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initOnclickListener();
    }

    private void initOnclickListener() {
        findViewById(R.id.test_size).setOnClickListener(this);
        findViewById(R.id.test_ani).setOnClickListener(this);
        findViewById(R.id.test_trim).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.test_size:
                intent.setClass(MainActivity.this,TestSizeActivity.class);
                startActivity(intent);
                break;

            case R.id.test_ani:
                intent.setClass(MainActivity.this,SVGAnimatorActivity.class);
                startActivity(intent);
                break;
            case R.id.test_trim:
                intent.setClass(MainActivity.this,TrimActivity.class);
                startActivity(intent);
                break;
        }
    }
}
