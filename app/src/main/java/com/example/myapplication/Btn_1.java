package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Btn_1 extends AppCompatActivity {
    //定义
    private RadioGroup mRG1;
    private CheckBox mCB1;
    private CheckBox mCB2;
    private CheckBox mCB3;
    private CheckBox mCB4;
    private CheckBox mCB5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1);
        //寻找单选
        mRG1=findViewById(R.id.Rg1);
        //寻找多选
        mCB1=findViewById(R.id.cb1);
        mCB2=findViewById(R.id.cb2);
        mCB3=findViewById(R.id.cb3);
        mCB4=findViewById(R.id.cb4);
        mCB5=findViewById(R.id.cb5);


        //监听单选框的结果
        mRG1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton= radioGroup.findViewById(i);
                Toast.makeText(Btn_1.this,radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        //监听多选的结果
        mCB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                CheckBox checkBox=findViewById(R.id.cb1);
                Toast.makeText(Btn_1.this,checkBox.getText()+(b?"选中":"未选中"),Toast.LENGTH_SHORT).show();
            }
        });
        mCB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                CheckBox checkBox=findViewById(R.id.cb2);
                Toast.makeText(Btn_1.this,checkBox.getText()+(b?"选中":"未选中"),Toast.LENGTH_SHORT).show();
            }
        });
        mCB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                CheckBox checkBox=findViewById(R.id.cb3);
                Toast.makeText(Btn_1.this,checkBox.getText()+(b?"选中":"未选中"),Toast.LENGTH_SHORT).show();
            }
        });
        mCB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                CheckBox checkBox=findViewById(R.id.cb4);
                Toast.makeText(Btn_1.this,checkBox.getText()+(b?"选中":"未选中"),Toast.LENGTH_SHORT).show();
            }
        });
        mCB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                CheckBox checkBox=findViewById(R.id.cb5);
                Toast.makeText(Btn_1.this,checkBox.getText()+(b?"选中":"未选中"),Toast.LENGTH_SHORT).show();
            }
        });
    }
}