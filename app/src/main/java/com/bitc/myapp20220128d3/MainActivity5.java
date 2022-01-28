package com.bitc.myapp20220128d3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    String num1; // 유저가 입력한 번호저장할 변수 1
    String num2; // 유저가 입력한 번호를 저장할 변수 2
    int result; // 결과값 저장할 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //버튼 객체를 생성(숫자버튼) 0 ~ 9
        Button[] btnNums = new Button[10];
        // 숫자 버튼의 ID를 배열에 저장
        int[] btnNumsIds={R.id.num00, R.id.num01,R.id.num02,R.id.num03,R.id.num04,R.id.num05,R.id.num07,R.id.num08,R.id.num09};
        //각 계산 버튼 , 리셋버튼(c)
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button multiple = findViewById(R.id.multiple);
        Button divide = findViewById(R.id.divide);

        Button resetBtn = findViewById(R.id.reset);
        //유저 입력란, 계산 결과
        EditText userNum1 = findViewById(R.id.userNumber1);
        EditText userNum2 = findViewById(R.id.userNumber2);
        TextView textResult = findViewById(R.id.result);

        userNum1.setInputType(0);
        userNum2.setInputType(0);
        textResult.setInputType(0);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userNum1.setText("");
                userNum2.setText("");
                textResult.setText("계산 결과 : ");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=userNum1.getText().toString();
                num2=userNum2.getText().toString();
                result=Integer.parseInt(num1)+Integer.parseInt(num2);
                textResult.setText("계산결과 : "+result);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=userNum1.getText().toString();
                num2=userNum2.getText().toString();
                result=Integer.parseInt(num1)-Integer.parseInt(num2);
                textResult.setText("계산결과 : " +result);
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=userNum1.getText().toString();
                num2=userNum2.getText().toString();
                result=Integer.parseInt(num1)*Integer.parseInt(num2);
                textResult.setText("계산결과 : " +result);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=userNum1.getText().toString();
                num2=userNum2.getText().toString();
                result=Integer.parseInt(num1)/Integer.parseInt(num2);
                textResult.setText("계산결과 : " +result);
            }
        });
//        각 숫자버튼의 이벤트 등록
        for (int i=0;i<btnNumsIds.length;i++){
            btnNums[i] = findViewById(btnNumsIds[i]);
        }

        for (int i=0; i<btnNumsIds.length; i++) {
        final int index;
        index=i;

            btnNums[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (userNum1.isFocused() == true) {
                        num1 = userNum1.getText().toString()+btnNums[index].getText().toString();
                        userNum1.setText(num1);
                    } else if (userNum2.isFocused() == true) {
                        num2 = userNum2.getText().toString()+btnNums[index].getText().toString();
                        userNum2.setText(num2);
                    }else{
                        Toast.makeText(MainActivity5.this, " 먼저 에디트 텍스트를 선택하세요.",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}