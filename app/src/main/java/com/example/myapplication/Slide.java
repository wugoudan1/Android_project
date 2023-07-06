package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;



public class Slide extends AppCompatActivity {


    //声明控件
    private ImageView head;
    private SlideMenu slideMenu;
    private Button mBrt_1;
    private Button mBrt_2;
    private Button mBrt_3;
    private Button mBrt_4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        //找到控件
        head=findViewById(R.id.headpicture);
        slideMenu=findViewById(R.id.slideMenu);
        mBrt_1=findViewById(R.id.btn1);
        mBrt_2=findViewById(R.id.btn2);
        mBrt_3=findViewById(R.id.btn3);
        mBrt_4=findViewById(R.id.btn4);

        //实现侧滑的过程
       head.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               slideMenu.switchMenu();
           }
       });

        //对每个按钮进行setOnclickListener

        mBrt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=null;
                intent=new Intent(Slide.this, Btn_1.class);
                startActivity(intent);
            }
        });
        mBrt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=null;
                intent=new Intent(Slide.this, Btn_2.class);
                startActivity(intent);
            }
        });
        mBrt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=null;
                intent=new Intent(Slide.this, Btn_3.class);
                startActivity(intent);
            }
        });
        mBrt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=null;
                intent=new Intent(Slide.this, Btn_4.class);
                startActivity(intent);
            }
        });


    }





}



