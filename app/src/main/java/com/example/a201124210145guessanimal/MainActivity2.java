package com.example.a201124210145guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txt_getname,txt_getbirth,txt_shengxiao;
    ImageView img_shengxiao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //绑定组件
        txt_getname = findViewById(R.id.textView_getname);
        txt_getbirth = findViewById(R.id.textView_getbirth);
        txt_shengxiao = findViewById(R.id.textView_shengxiao);
        img_shengxiao = findViewById(R.id.imageView_shengxiao);

        String str1 = getIntent().getStringExtra("name");
        int myyear = getIntent().getIntExtra("year",0);
        int mymonth = getIntent().getIntExtra("month",0);
        int myday = getIntent().getIntExtra("day",0);
        txt_getname.setText("你好:" + str1);
        txt_getbirth.setText("您的出生日期为：" + myyear + "年" + mymonth + "月" + myday + "日" );

        int[] img_arr = {R.drawable.hou,R.drawable.ji,R.drawable.gou,R.drawable.zhu,R.drawable.shu,
                R.drawable.niu,R.drawable.hu,R.drawable.tu,R.drawable.dragon,
                R.drawable.she,R.drawable.ma,R.drawable.yang};
        int[] content_arr = {R.string.猴,R.string.鸡,R.string.狗,R.string.猪,R.string.鼠,
                R.string.牛,R.string.虎,R.string.兔,R.string.龙,
                R.string.蛇,R.string.马,R.string.羊};

        int i = search(myyear);
        img_shengxiao.setImageResource(img_arr[i]);
        txt_shengxiao.setText(content_arr[i]);


    }
    public static int search(int year)
    {
        int a = 0;
        int remainder=year%12;

        switch(remainder){//运用switch...case
            case 0:
                a = 0;
                break;
            case 1:
                a = 1;
                break;
            case 2:
                a = 2;
                break;
            case 3:
                a = 3;
                break;
            case 4:
                a = 4;
                break;
            case 5:
                a = 5;
                break;
            case 6:
                a = 6;//tiger
                break;
            case 7:
                a = 7;//rabbit
                break;
            case 8:
                a = 8;//dragon
                break;
            case 9:
                a = 9;//snake
                break;
            case 10:
                a = 10;
                break;
            case 11:
                a = 11;
                break;
        }
        return a;
    }

}