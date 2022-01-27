package com.bitc.myapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String num1;
    String num2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editNum1;
        EditText editNum2;
        TextView TextResult;
        Button btnPlus;
        Button btnMinus;
        Button btnMulti;
        Button btnDivide;



        editNum1 =findViewById(R.id.edit01);
        editNum2 =findViewById(R.id.edit02);
        TextResult = findViewById(R.id.textResult);
        btnPlus=findViewById(R.id.btn01);
        btnMinus=findViewById(R.id.btn02);
        btnDivide=findViewById(R.id.btn03);
        btnMulti=findViewById(R.id.btn04);

        btnPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1=editNum1.getText().toString();
                num2=editNum2.getText().toString();
                result=Integer.parseInt(num1)+Integer.parseInt(num2);
                TextResult.setText("계산결과 : " + result);
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1=editNum1.getText().toString();
                num2=editNum2.getText().toString();
                result=Integer.parseInt(num1)-Integer.parseInt(num2);
                TextResult.setText("계산결과 : " + result);
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1=editNum1.getText().toString();
                num2=editNum2.getText().toString();
                result=Integer.parseInt(num1)*Integer.parseInt(num2);
                TextResult.setText("계산결과 : " + result);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1=editNum1.getText().toString();
                num2=editNum2.getText().toString();
                result=Integer.parseInt(num1)/Integer.parseInt(num2);
                TextResult.setText("계산결과 : " + result);
            }
        });


    }
}

