package com.example.imageviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Image view demo app
 * - Change Image button toggles between two images
 * - Clicking on image toggles between a scaled image and the original
 * - Has custom launcher icon
 */
public class MainActivity extends AppCompatActivity {
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.imageView);
        iv.setClickable(true);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float scale = iv.getScaleX();
                if (scale == 1.0f) {
                    iv.setScaleX(0.5f);
                    iv.setScaleY(0.5f);
                } else {
                    iv.setScaleX(1.0f);
                    iv.setScaleY(1.0f);
                }
            }
        });
    }

    public void changeImage(View view) {
       String tag = (String) iv.getTag();
        if (tag.equals("nyc")) {
            iv.setImageResource(R.drawable.sanfrancisco);
            iv.setTag("sf");
        } else {
            iv.setImageResource(R.drawable.newyorkcity2);
            iv.setTag("nyc");
        }
    }
}
