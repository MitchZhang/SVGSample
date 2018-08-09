package com.example.mitch.svgsamples;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

public class SVGAnimatorActivity extends Activity implements View.OnClickListener{
    private boolean isChecked = false;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animator_layout);

        findViewById(R.id.svg_triangle).setOnClickListener(this);
        findViewById(R.id.svg_duigou).setOnClickListener(this);
        findViewById(R.id.svg_star).setOnClickListener(this);
        findViewById(R.id.svg_multi).setOnClickListener(this);
        findViewById(R.id.svg_line).setOnClickListener(this);
        findViewById(R.id.svg_selector).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        ImageView img = (ImageView) view;
        if(img.getDrawable() instanceof Animatable){
            ((Animatable) img.getDrawable()).start();
        }

        if(view.getId() == R.id.svg_selector){
            isChecked = !isChecked;
            final int[] stateSet = {android.R.attr.state_checked * (isChecked ? 1 : -1)};
            img.setImageState(stateSet, true);
        }
    }
}
