package com.bitc.petphotoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진보기");
        TextView TV2 = findViewById(R.id.TV2);
        CheckBox chk1 = findViewById(R.id.chk1); // 시작 동의
        RadioGroup rGroup= findViewById(R.id.rGroup);
        RadioButton puppy= findViewById(R.id.puppy);
        RadioButton cat = findViewById(R.id.cat);
        RadioButton rabbit = findViewById(R.id.rabbit);
        Button btnOk =findViewById(R.id.btnOk);  //선택 확인 버튼
        ImageView imgPet=findViewById(R.id.imgPet);

        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chk1.isChecked()==true){
                    TV2.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }else{
                    TV2.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }

            }
        });
        btnOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switch (rGroup.getCheckedRadioButtonId()){
                    case R.id.puppy:
                        imgPet.setImageResource(R.drawable.img_1);
                        break;
                    case R.id.cat:
                        imgPet.setImageResource(R.drawable.img);
                        break;
                    case R.id.rabbit:
                        imgPet.setImageResource(R.drawable.img_2);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}