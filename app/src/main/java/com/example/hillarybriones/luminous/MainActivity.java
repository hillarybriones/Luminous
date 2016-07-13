package com.example.hillarybriones.luminous;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
     private ImageView imageView;
     private ToggleButton toggleButtonChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.imageView);
        toggleButtonChange=(ToggleButton)findViewById(R.id.toggleButtonChange);

        toggleButtonChange.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView.setImageResource(R.drawable.on);
                } else {
                    // The toggle is disabled
                    imageView.setImageResource(R.drawable.off);
                }
            }
        });
    }
}
