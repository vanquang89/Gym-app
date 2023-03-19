package com.example.pc.gym_club;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MangCoSau extends AppCompatActivity {
    Button  btnQuayLai3;
    Button btnCoCauVai, btnCoTaySau, btnCoXo, btnCoThang, btnCoLungDuoi, btnCoMong, btnCoDuiSau, btnCoBapChuoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mang_co_sau);
        btnQuayLai3=(Button)findViewById(R.id.btnQuayLai3);
        btnQuayLai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnquaylai3 =new Intent(MangCoSau.this, MangCoTruoc.class);
                startActivity(btnquaylai3);
            }
        });
        btnCoCauVai=(Button)findViewById(R.id.btnCoCauVai);
        btnCoCauVai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncocauvai = new Intent(MangCoSau.this, BaiTapCoCauVai.class);
                startActivity(btncocauvai);
            }
        });
        btnCoTaySau =(Button)findViewById(R.id.btnCoTaySau);
        btnCoTaySau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncotaysau = new Intent(MangCoSau.this, BaiTapCoTaySau.class);
                startActivity(btncotaysau);
            }
        });
        btnCoXo=(Button)findViewById(R.id.btnCoXo);
        btnCoXo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncoxo =new Intent(MangCoSau.this, BaiTapCoXo.class);
                startActivity(btncoxo);
            }
        });
        btnCoThang =(Button)findViewById(R.id.btnCoThang);
        btnCoThang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncothang =new Intent(MangCoSau.this, BaiTapCoThang.class);
                startActivity(btncothang);
            }
        });
        btnCoLungDuoi =(Button)findViewById(R.id.btnCoLungDuoi);
        btnCoLungDuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncolungduoi =new Intent(MangCoSau.this, BaiTapCoLungDuoi.class);
                startActivity(btncolungduoi);
            }
        });
        btnCoMong =(Button)findViewById(R.id.btnCoMong);
        btnCoMong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncomong =new Intent(MangCoSau.this, BaiTapCoMong.class);
                startActivity(btncomong);
            }
        });
        btnCoDuiSau =(Button)findViewById(R.id.btnCoDuiSau);
        btnCoDuiSau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncoduisau = new Intent(MangCoSau.this, BaiTapCoDuiSau.class);
                startActivity(btncoduisau);
            }
        });
        btnCoBapChuoi =(Button)findViewById(R.id.btnCoBapChuoi);
        btnCoBapChuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncobapchuoi =new Intent(MangCoSau.this, BaiTapCoBapChuoi.class);
                startActivity(btncobapchuoi);
            }
        });
    }

}
