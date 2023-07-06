package com.example.myapplication;

import android.widget.Toast;
import android.content.Context;

public class toast {
    public static Toast mToast;
    public static void showMsg(Context context,String msg){
        if(mToast==null){
            mToast=Toast.makeText(context,msg,Toast.LENGTH_SHORT);
        }
        else {
            mToast.setText(msg);
        }
    mToast.show();
    }

}
