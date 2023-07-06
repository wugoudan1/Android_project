package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //声明控件

    private Button mBtnLogin;
    private EditText mEdUser;
    private EditText mEdPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到控件
        mBtnLogin= findViewById(R.id.btn_login);
        mEdUser=findViewById(R.id.text_username);
        mEdPassword=findViewById(R.id.text_password);

        //设置toast的内容
        String success="登陆成功";
        String failure="密码或账号错误，请重新登录";

       // 实现跳转--方法一
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //获取输入的值
                String username=mEdUser.getText().toString();
                String password=mEdPassword.getText().toString();

                Intent intent=null;
                //假设账号密码分别是 wzw 123456

                if(username.equals("wzw")&&password.equals("123456")){
                    intent=new Intent(MainActivity.this, Slide.class);
                    startActivity(intent);
                    //toast普通版
                   // Toast.makeText(getApplicationContext(),success,Toast.LENGTH_SHORT).show();

                    toast.showMsg(MainActivity.this,success);
                }
                else{
                    //wrong
//                    Toast toastCenter=Toast.makeText(getApplicationContext(),failure,Toast.LENGTH_SHORT);
//                    toastCenter.setGravity(Gravity.CENTER,0,0);
//                    toastCenter.show();
                    toast.showMsg(MainActivity.this,failure);

                }

            }
        });


    }

//    //连接数据库
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Connection.mymysql();

}

