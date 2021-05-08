package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * 作者：caibin
 * 时间：2021/5/8 21:56
 * 类说明：
 */
public class MyUtils {
    public static void showToast(Context context,String aa){
        Toast.makeText(context,aa,Toast.LENGTH_SHORT).show();
    }
}
