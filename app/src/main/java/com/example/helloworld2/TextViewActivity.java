package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
    private TextView mTv3;
    private TextView mTv4;
    private TextView mTv5;
    private TextView mTv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv3=findViewById(R.id.tv_3);
        mTv3.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mTv3.getPaint().setAntiAlias(true);//去除锯齿
        mTv4=findViewById(R.id.tv_4);
        mTv4.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
        mTv5=findViewById(R.id.tv_5);
        mTv5.setText(Html.fromHtml("<u>麦迪干拔</u>"));
        mTv6=findViewById(R.id.tv_6);
        mTv6.setSelected(true);
    }
}
