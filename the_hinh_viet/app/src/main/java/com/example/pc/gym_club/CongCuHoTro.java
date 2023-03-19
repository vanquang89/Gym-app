package com.example.pc.gym_club;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CongCuHoTro extends AppCompatActivity {
    Button btnTinhBMI, btnTinhTDEE, btnCountDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong_cu_ho_tro);
        btnTinhBMI = (Button)findViewById(R.id.btnTinhBMI);
        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btntinhbmi = new Intent(CongCuHoTro.this, BMI_Calculator.class);
                startActivity(btntinhbmi);
            }
        });
        btnTinhTDEE=(Button)findViewById(R.id.btnTinhTDEE);
        btnTinhTDEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btntinhtdee = new Intent(CongCuHoTro.this, TDEE.class);
                startActivity(btntinhtdee);
            }
        });
        btnCountDown =(Button)findViewById(R.id.btnCountDown);
        btnCountDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncountdown = new Intent(CongCuHoTro.this, DongHoDem.class);
                startActivity(btncountdown);
            }
        });
    }
}
