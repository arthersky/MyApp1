package com.a000webhostapp.langostudio.android.myapp1;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MyApp","running");       //使用Log來顯示在下方log區 .e表示error會出現紅色字體

        String ACTIVITY_NAME = "MainActivity";

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        float wp = metrics.widthPixels;
        float hp = metrics.heightPixels;
        float xdpi = metrics.xdpi;
        float ydpi = metrics.ydpi;
        String screen = getResources().getString(R.string.screen);

        String msg1 = "手機"+screen+"大小為 寬"+wp+"高"+hp;
        String msg2 = "手機"+screen+" DPI 為"+metrics.densityDpi;
        String msg3 = "手機"+screen+"解析度為 寬"+xdpi + "高" + ydpi;
        String msg4 = "手機"+screen+"尺寸(英吋)為 寬" + wp/xdpi + "高" + hp/ydpi;
        String msg5 = "手機"+screen+"尺寸(公分)為 寬" + 2.54*wp/xdpi + "高" + 2.54*hp/ydpi;
        String msg6 = "手機"+screen+"尺寸(英吋)為" + Math.sqrt((wp/xdpi)*(wp/xdpi)+(hp/ydpi)*(hp/ydpi));

        Log.e(ACTIVITY_NAME,msg1);
        Log.e(ACTIVITY_NAME,msg2);
        Log.e(ACTIVITY_NAME,msg3);
        Log.e(ACTIVITY_NAME,msg4);
        Log.e(ACTIVITY_NAME,msg5);
        Log.e(ACTIVITY_NAME,msg6);

        Toast.makeText(this,msg1+msg2+msg3+msg4+msg5+msg6,Toast.LENGTH_LONG).show();

        //硬體資訊
        Log.e("硬體資訊",
                "主機板名："+ Build.BOARD+"\n"+
                "載入器版號："+Build.BOOTLOADER+"\n"+
                "出廠日期："+(new Date(Build.TIME))+"\n"+
                "硬體名稱："+Build.HARDWARE+"\n"+
                "品牌名稱："+Build.BRAND+"\n"+
                "CPU+ABI："+Build.CPU_ABI+"\n"+
                "設備名稱："+Build.DEVICE+"\n"+
                "版本號碼："+Build.DISPLAY+"\n"+
                "設備識別碼："+Build.FINGERPRINT+"\n"+
                "HOST："+Build.HOST+"\n"+
                "ID："+Build.ID+"\n"+
                "序號："+Build.SERIAL+"\n"+
                "製造商："+Build.MANUFACTURER+"\n"+
                "型號："+Build.MODEL+"\n"+
                "產品名稱："+Build.PRODUCT+"\n"+
                "設備描述："+Build.TAGS+"\n"+
                "設備類別："+Build.TYPE+"\n"+
                "USER："+Build.USER+"\n"+
                "目前開發代號："+Build.VERSION.CODENAME+"\n"+
                "內部識別碼："+Build.VERSION.INCREMENTAL+"\n"+
                "軟體版本："+Build.VERSION.RELEASE+"\n"+
                "SDK："+Build.VERSION.SDK+"\n"+
                "API："+Build.VERSION.SDK_INT+"\n"
        );
        Toast.makeText(this,
                "主機板名："+ Build.BOARD+"\n"+
                "載入器版號："+Build.BOOTLOADER+"\n"+
                "出廠日期："+(new Date(Build.TIME))+"\n"+
                "硬體名稱："+Build.HARDWARE+"\n"+
                "品牌名稱："+Build.BRAND+"\n"+
                "CPU+ABI："+Build.CPU_ABI+"\n"+
                "設備名稱："+Build.DEVICE+"\n"+
                "版本號碼："+Build.DISPLAY+"\n"+
                "設備識別碼："+Build.FINGERPRINT+"\n"+
                "HOST："+Build.HOST+"\n"+
                "ID："+Build.ID+"\n"+
                "序號："+Build.SERIAL+"\n"+
                "製造商："+Build.MANUFACTURER+"\n"+
                "型號："+Build.MODEL+"\n"+
                "產品名稱："+Build.PRODUCT+"\n"+
                "設備描述："+Build.TAGS+"\n"+
                "設備類別："+Build.TYPE+"\n"+
                "USER："+Build.USER+"\n"+
                "目前開發代號："+Build.VERSION.CODENAME+"\n"+
                "內部識別碼："+Build.VERSION.INCREMENTAL+"\n"+
                "軟體版本："+Build.VERSION.RELEASE+"\n"+
                "SDK："+Build.VERSION.SDK+"\n"+
                "API："+Build.VERSION.SDK_INT+"\n"
                ,Toast.LENGTH_LONG).show();

    }
    int[] pictures = {R.drawable.p01,R.drawable.p02,R.drawable.p03,R.drawable.p04,R.drawable.p05};
    int pictureIndex = 0;
    public void changePicture(View view){

        pictureIndex++;
                if(pictureIndex>=pictures.length){
                    pictureIndex = 0;
                }
        ((ImageView)view).setImageResource(pictures[pictureIndex]);
    }
}
