package com.bitc.myapp3;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tView1,tView2,tView3;
        tView1 = findViewById(R.id.text01);
        tView2 = findViewById(R.id.text02);
        tView3 = findViewById(R.id.text03);

        tView1.setText("하이");
        tView1.setTextColor(Color.MAGENTA);
        tView2.setTextSize(30);
        tView2.setTypeface(Typeface.SERIF, Typeface.BOLD);
        tView3.setText("가나다라마바사아자차카타파ㅏㅏㅏㅏ하하하하하하하하하하하하하하하하하ㅏ하흐하핳할리라ㅏ라라하하하하하");
        tView3.setSingleLine();
    }

}
