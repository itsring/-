package com.bitc.myapptest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    //    App의 시작점
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        activity_main.xml 파일과 연동
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "dddd", Toast.LENGTH_SHORT).show();
            }
        });
        button2 = (Button) findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "버튼2를 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}