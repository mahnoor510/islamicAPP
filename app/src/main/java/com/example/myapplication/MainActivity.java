package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    Intent intent1;
    Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btngit=findViewById(R.id.git);
        Button btntest=findViewById(R.id.test);
        Button btnpractice=findViewById(R.id.practice);

        btngit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri web= Uri.parse("https://github.com/mahnoor510/islamicAPP.git");
                intent=new Intent(Intent.ACTION_VIEW,web);
                startActivity(intent);
            }
        });
        btntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent1=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent1);
            }
        });
        btnpractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent2=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent2);
            }
        });



    }
}