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

    String[] answer= {"Halqiyah_b","Shafaweeyah","Niteeyah", "Lisaveyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Niteeyah", "Lisaveyah", "Thalqeeyah", "Asleeyah", "Asleeyah", "Shajariyah_Haafiyah", "Asleeyah", "Shajariyah_Haafiyah", "Niteeyah", "Lisaveyah", "Halqiyah_b","Halqiyah_b", "Shafaweeyah", "Lahatiyah_b", "Lahatiyah_b", "Tarfiyah", "Ghunna", "Halqiyah_b", "Shafaweeyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Halqiyah_b"};
    String[] alphabets = {"\u0627","\u0628", "\u062A","\u062B","\u062C","\u062D","\u062E","\u062F","\u0630","\u0631","\u0632","\u0633","\u0634","\u0635","\u0636","\u0637", "\u0638","\u0639","\u063A", "\u0641", "\u0642","\u0643","\u0644", "\u0645", "\u0646","\u0647", "\u0648", "\u064A","\u0622","\u0629","\u0649"};
    Random random=new Random();
    int rand;
    Intent intent1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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
                }
                else{
                    btn11.setBackgroundColor(Color.RED);
                }
                if(answer[rand].equals(btn22.getText())){
                    btn22.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand].equals(btn33.getText())){
                    btn33.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand].equals(btn44.getText())){
                    btn44.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand].equals(btn55.getText())){
                    btn55.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand].equals(btn66.getText())){
                    btn66.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand].equals(btn77.getText())){
                    btn77.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand].equals(btn88.getText())){
                    btn88.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand].equals(btn99.getText())){
                    btn99.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand].equals(btn1010.getText())){
                    btn1010.setBackgroundColor(Color.GREEN);
                }
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Shafaweeyah") {
                    btn22.setBackgroundColor(Color.GREEN);
                }
                else{
                    btn22.setBackgroundColor(Color.RED);
                }
                if(answer[rand]==btn11.getText()){
                    btn11.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn33.getText()){
                    btn33.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn44.getText()){
                    btn44.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn55.getText()){
                    btn55.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn66.getText()){
                    btn66.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn77.getText()){
                    btn77.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn88.getText()){
                    btn88.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn99.getText()){
                    btn99.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn1010.getText()){
                    btn1010.setBackgroundColor(Color.GREEN);
                }
            }
        });

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Lisaveyah") {
                    btn33.setBackgroundColor(Color.GREEN);
                }
                else{
                    btn33.setBackgroundColor(Color.RED);
                }
                if(answer[rand]==btn22.getText()){
                    btn22.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn11.getText()){
                    btn11.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn44.getText()){
                    btn44.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn55.getText()){
                    btn55.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn66.getText()){
                    btn66.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn77.getText()){
                    btn77.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn88.getText()){
                    btn88.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn99.getText()){
                    btn99.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn1010.getText()){
                    btn1010.setBackgroundColor(Color.GREEN);
                }
            }
        });

        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Halqiyah_b") {
                    btn44.setBackgroundColor(Color.GREEN);
                }
                else{
                    btn44.setBackgroundColor(Color.RED);
                }
                if(answer[rand]==btn22.getText()){
                    btn22.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn33.getText()){
                    btn33.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn11.getText()){
                    btn11.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn55.getText()){
                    btn55.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn66.getText()){
                    btn66.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn77.getText()){
                    btn77.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn88.getText()){
                    btn88.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn99.getText()){
                    btn99.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn1010.getText()){
                    btn1010.setBackgroundColor(Color.GREEN);
                }
            }
        });

        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Thalqeeyah") {
                    btn55.setBackgroundColor(Color.GREEN);
                }
                else{
                    btn55.setBackgroundColor(Color.RED);
                }
                if(answer[rand]==btn22.getText()){
                    btn22.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn33.getText()){
                    btn33.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn44.getText()){
                    btn44.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn11.getText()){
                    btn11.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn66.getText()){
                    btn66.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn77.getText()){
                    btn77.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn88.getText()){
                    btn88.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn99.getText()){
                    btn99.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn1010.getText()){
                    btn1010.setBackgroundColor(Color.GREEN);
                }
            }
        });

        btn66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Lahatiyah_b") {
                    btn66.setBackgroundColor(Color.GREEN);
                }
                else{
                    btn66.setBackgroundColor(Color.RED);
                }
                if(answer[rand]==btn22.getText()){
                    btn22.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn33.getText()){
                    btn33.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn44.getText()){
                    btn44.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn55.getText()){
                    btn55.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn11.getText()){
                    btn11.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn77.getText()){
                    btn77.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn88.getText()){
                    btn88.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn99.getText()){
                    btn99.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn1010.getText()){
                    btn1010.setBackgroundColor(Color.GREEN);
                }
            }
        });

        btn77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Ghunna") {
                    btn77.setBackgroundColor(Color.GREEN);
                }
                else{
                    btn77.setBackgroundColor(Color.RED);
                }
                if(answer[rand]==btn22.getText()){
                    btn22.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn33.getText()){
                    btn33.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn44.getText()){
                    btn44.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn55.getText()){
                    btn55.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn66.getText()){
                    btn66.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn11.getText()){
                    btn11.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn88.getText()){
                    btn88.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn99.getText()){
                    btn99.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn1010.getText()){
                    btn1010.setBackgroundColor(Color.GREEN);
                }
            }
        });

        btn88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Shajariyah_Haafiyah") {
                    btn88.setBackgroundColor(Color.GREEN);
                }
                else{
                    btn88.setBackgroundColor(Color.RED);
                }
                if(answer[rand]==btn22.getText()){
                    btn22.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn33.getText()){
                    btn33.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn44.getText()){
                    btn44.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn55.getText()){
                    btn55.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn66.getText()){
                    btn66.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn77.getText()){
                    btn77.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn11.getText()){
                    btn11.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn99.getText()){
                    btn99.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn1010.getText()){
                    btn1010.setBackgroundColor(Color.GREEN);
                }
            }
        });

        btn99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Asleeyah") {
                    btn99.setBackgroundColor(Color.GREEN);
                }
                else{
                    btn99.setBackgroundColor(Color.RED);
                }
                if(answer[rand].equals(btn22.getText())){
                    btn22.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn33.getText()){
                    btn33.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn44.getText()){
                    btn44.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn55.getText()){
                    btn55.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn66.getText()){
                    btn66.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn77.getText()){
                    btn77.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn88.getText()){
                    btn88.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn11.getText()){
                    btn11.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn1010.getText()){
                    btn1010.setBackgroundColor(Color.GREEN);
                }
            }
        });

        btn1010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer[rand]=="Tarfiyah") {
                    btn1010.setBackgroundColor(Color.GREEN);
                }
                else{
                    btn1010.setBackgroundColor(Color.RED);
                }
                if(answer[rand]==btn22.getText()){
                    btn22.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn33.getText()){
                    btn33.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn44.getText()){
                    btn44.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn55.getText()){
                    btn55.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn66.getText()){
                    btn66.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn77.getText()){
                    btn77.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn88.getText()){
                    btn88.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn99.getText()){
                    btn99.setBackgroundColor(Color.GREEN);
                }
                else if(answer[rand]==btn11.getText()){
                    btn11.setBackgroundColor(Color.GREEN);
                }
            }
        });

        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent1=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }

}