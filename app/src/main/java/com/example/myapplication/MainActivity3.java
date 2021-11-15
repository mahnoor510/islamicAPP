package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity3 extends AppCompatActivity {
    String[] answer= {"Halqiyah_b","Shafaweeyah","Niteeyah", "Lisaveyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Niteeyah", "Lisaveyah", "Thalqeeyah", "Asleeyah", "Asleeyah", "Shajariyah_Haafiyah", "Asleeyah", "Shajariyah_Haafiyah", "Niteeyah", "Lisaveyah", "Halqiyah_b","Halqiyah_b", "Shafaweeyah", "Lahatiyah_b", "Lahatiyah_b", "Tarfiyah", "Ghunna", "Halqiyah_b", "Shafaweeyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Halqiyah_b"};
    String[] alphabets = {"\u0627","\u0628", "\u062A","\u062B","\u062C","\u062D","\u062E","\u062F","\u0630","\u0631","\u0632","\u0633","\u0634","\u0635","\u0636","\u0637", "\u0638","\u0639","\u063A", "\u0641", "\u0642","\u0643","\u0644", "\u0645", "\u0646","\u0647", "\u0648", "\u064A","\u0622","\u0629","\u0649"};
    Random random=new Random();
    int rand;
    int score=0;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btngenerate=findViewById(R.id.generate);
        Button btn11=findViewById(R.id.btn1); //Niteeyah
        Button btn22=findViewById(R.id.btn2); //Shafaweeyah
        Button btn33=findViewById(R.id.btn3); //Lisaveyah
        Button btn44=findViewById(R.id.btn4); //Halqiyah
        Button btn55=findViewById(R.id.btn5); //Thalqeeyah
        Button btn66=findViewById(R.id.btn6); //lahatiyah
        Button btn77=findViewById(R.id.btn7); //ghunna
        Button btn88=findViewById(R.id.btn8); //Shajariyah_Haafiyah
        Button btn99=findViewById(R.id.btn9); //asleeyah
        Button btn1010=findViewById(R.id.btn10); //tarfiyah
        Button btnfinish=findViewById(R.id.finish);

        btngenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11.setBackgroundColor(Color.BLUE);
                btn22.setBackgroundColor(Color.BLUE);
                btn33.setBackgroundColor(Color.BLUE);
                btn44.setBackgroundColor(Color.BLUE);
                btn55.setBackgroundColor(Color.BLUE);
                btn66.setBackgroundColor(Color.BLUE);
                btn77.setBackgroundColor(Color.BLUE);
                btn88.setBackgroundColor(Color.BLUE);
                btn99.setBackgroundColor(Color.BLUE);
                btn1010.setBackgroundColor(Color.BLUE);
                rand=random.nextInt(30);
                TextView option=findViewById(R.id.option);
                option.setText(alphabets[rand]);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabets[rand]=="Niteeyah") {
                    btn11.setBackgroundColor(Color.GREEN);
                    score=score+1;
                }
                else{
                    btn11.setBackgroundColor(Color.RED);
                }
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Shafaweeyah") {
                    btn22.setBackgroundColor(Color.GREEN);
                    score=score+1;
                }
                else{
                    btn22.setBackgroundColor(Color.RED);
                }
            }
        });

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Lisaveyah") {
                    btn33.setBackgroundColor(Color.GREEN);
                    score=score+1;
                }
                else{
                    btn33.setBackgroundColor(Color.RED);
                }
            }
        });

        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Halqiyah_b") {
                    btn44.setBackgroundColor(Color.GREEN);
                    score=score+1;
                }
                else{
                    btn44.setBackgroundColor(Color.RED);
                }
            }
        });

        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Thalqeeyah") {
                    btn55.setBackgroundColor(Color.GREEN);
                    score=score+1;
                }
                else{
                    btn55.setBackgroundColor(Color.RED);
                }
            }
        });

        btn66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Lahatiyah_b") {
                    btn66.setBackgroundColor(Color.GREEN);
                    score=score+1;
                }
                else{
                    btn66.setBackgroundColor(Color.RED);
                }
            }
        });

        btn77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Ghunna") {
                    btn77.setBackgroundColor(Color.GREEN);
                    score=score+1;
                }
                else{
                    btn77.setBackgroundColor(Color.RED);
                }
            }
        });

        btn88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Shajariyah_Haafiyah") {
                    btn88.setBackgroundColor(Color.GREEN);
                    score=score+1;
                }
                else{
                    btn88.setBackgroundColor(Color.RED);
                }
            }
        });

        btn99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Asleeyah") {
                    btn99.setBackgroundColor(Color.GREEN);
                    score=score+1;
                }
                else{
                    btn99.setBackgroundColor(Color.RED);
                }
            }
        });

        btn1010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Tarfiyah") {
                    btn1010.setBackgroundColor(Color.GREEN);
                    score=score+1;
                }
                else{
                    btn1010.setBackgroundColor(Color.RED);
                }
            }
        });
        //System.out.println(score);
        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(in);
            }
        });

    }
}