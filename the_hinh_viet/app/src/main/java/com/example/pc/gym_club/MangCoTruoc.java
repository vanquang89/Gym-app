package com.example.pc.gym_club;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MangCoTruoc extends AppCompatActivity {
        Button btnCoTruoc, btnQuayLai2;
        Button btnCo, btnCoVai, btnBapTayTruoc, btnCangTay, btnNguc, btnBung, btnDuiTruoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mang_co_truoc);
        btnCoTruoc =(Button)findViewById(R.id.btnCoTruoc);
        btnCoTruoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncotruoc =new Intent(MangCoTruoc.this, MangCoSau.class);
                startActivity(btncotruoc);
            }
        });
        btnQuayLai2=(Button)findViewById(R.id.btnQuayLai2);
        btnQuayLai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                /*Intent btnquaylai2 =new Intent(MangCoTruoc.this, MenuApp.class);
                startActivity(btnquaylai2);*/
            }
        });

        btnCoVai =(Button)findViewById(R.id.btnCoVai);
        btnCoVai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncovai =new Intent(MangCoTruoc.this, BaiTapVai.class);
                startActivity(btncovai);
            }
        });
        btnBapTayTruoc =(Button)findViewById(R.id.btnBapTayTruoc);
        btnBapTayTruoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbaptraytruoc = new Intent(MangCoTruoc.this, BaiTapBapTayTruoc.class);
                startActivity(btnbaptraytruoc);
            }
        });
        btnCangTay= (Button)findViewById(R.id.btnCangTay);
        btnCangTay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncangtay = new Intent(MangCoTruoc.this, BaiTapCangTay.class);
                startActivity(btncangtay);
            }
        });
        btnNguc = (Button)findViewById(R.id.btnNguc);
        btnNguc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnnguc = new Intent(MangCoTruoc.this, BaiTapNguc.class);
                startActivity(btnnguc);
            }
        });
        btnBung=(Button)findViewById(R.id.btnBung);
        btnBung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbung = new Intent(MangCoTruoc.this, BaiTapBung.class);
                startActivity(btnbung);
            }
        });
        btnDuiTruoc =(Button)findViewById(R.id.btnCoDuiTruoc);
        btnDuiTruoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnduitruoc = new Intent(MangCoTruoc.this, BaiTapDuiTruoc.class);
                startActivity(btnduitruoc);
            }
        });
    }

}
