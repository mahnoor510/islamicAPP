package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    String[] emissionP= {"Halqiyah_b","Shafaweeyah","Niteeyah", "Lisaveyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Niteeyah", "Lisaveyah", "Thalqeeyah", "Asleeyah", "Asleeyah", "Shajariyah_Haafiyah", "Asleeyah", "Shajariyah_Haafiyah", "Niteeyah", "Lisaveyah", "Halqiyah_b","Halqiyah_b", "Shafaweeyah", "Lahatiyah_b", "Lahatiyah_b", "Tarfiyah", "Ghunna", "Halqiyah_b", "Shafaweeyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Halqiyah_b"};
    String[] alphabets = {"\u0627","\u0628", "\u062A","\u062B","\u062C","\u062D","\u062E","\u062F","\u0630","\u0631","\u0632","\u0633","\u0634","\u0635","\u0636","\u0637", "\u0638","\u0639","\u063A", "\u0641", "\u0642","\u0643","\u0644", "\u0645", "\u0646","\u0647", "\u0648", "\u064A","\u0622","\u0629","\u0649"};
    Random random=new Random();
    int rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btngenerate=findViewById(R.id.generate);
        btngenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               rand=random.nextInt(30);
               TextView option=findViewById(R.id.option);
               option.setText(alphabets[rand]);
            }
        });

        Button btn11=findViewById(R.id.btn1);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11.setBackgroundColor(Color.RED);

            }
        });



    }

}