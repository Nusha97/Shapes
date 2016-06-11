package com.example.android.shapes;


import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        final ImageView image = (ImageView) findViewById(R.id.image1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((ViewGroup.MarginLayoutParams) image.getLayoutParams()).topMargin != 0)
                    ((ViewGroup.MarginLayoutParams) image.getLayoutParams()).topMargin -= 10;
                    image.requestLayout();


            }
        });
                button2.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   ((ViewGroup.MarginLayoutParams) image.getLayoutParams()).topMargin += 10;
                                                   image.requestLayout();

                                               }
                                           });
                        button3.setOnClickListener(new View.OnClickListener() {
                                                       @Override
                                                       public void onClick(View v) {
                                                           ((ViewGroup.MarginLayoutParams) image.getLayoutParams()).leftMargin -= 10;
                                                           image.requestLayout();
                                                       }
                                                   });
                                button4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        ((ViewGroup.MarginLayoutParams) image.getLayoutParams()).leftMargin += 10;
                                        image.requestLayout();
                                    }
                                });

    }
}