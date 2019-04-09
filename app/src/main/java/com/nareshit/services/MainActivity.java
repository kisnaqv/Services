package com.nareshit.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stop=findViewById(R.id.stop);
        start=findViewById(R.id.start);


        stop.setOnClickListener(this);
        start.setOnClickListener(this);

        /*start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Myservice.class);
                startService(intent);

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Myservice.class);
                stopService(intent);

            }
        });*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.stop:
                Intent intent=new Intent(MainActivity.this,Myservice.class);
                stopService(intent);
                break;
            case R.id.start:
                Intent intent1=new Intent(MainActivity.this,Myservice.class);
                startService(intent1);
                break;
        }

    }
}
