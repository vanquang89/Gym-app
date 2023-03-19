package com.example.pc.gym_club;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pc.gym_club.huongdandongtac.CauVaiVoiCap;
import com.example.pc.gym_club.huongdandongtac.CauVaiVoiTaDon;
import com.example.pc.gym_club.huongdandongtac.CauVaiVoiTaTay;
import com.example.pc.gym_club.huongdandongtac.CoTaySauVoiCap;
import com.example.pc.gym_club.huongdandongtac.CuonCoTayTruoc;
import com.example.pc.gym_club.huongdandongtac.NamVotThanhTa;
import com.example.pc.gym_club.huongdandongtac.NgoiGheDocThanhTa;
import com.example.pc.gym_club.huongdandongtac.NgoiVotThanhTa;

public class BaiTapCoTaySau extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap_co_tay_sau);
        LinearLayout app_layer = (LinearLayout) findViewById (R.id.NamVotThanhTa);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapCoTaySau.this, NamVotThanhTa.class);
                startActivity(picture_intent );
            }
        });


        LinearLayout app_layer1 = (LinearLayout) findViewById (R.id.NgoiVotTaDon);
        app_layer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapCoTaySau.this, NgoiVotThanhTa.class);
                startActivity(picture_intent );
            }
        });

        LinearLayout app_layer2 = (LinearLayout) findViewById (R.id.CuonCoTay);
        app_layer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapCoTaySau.this, CuonCoTayTruoc.class);
                startActivity(picture_intent );
            }
        });
        LinearLayout app_layer3 = (LinearLayout) findViewById (R.id.GheDocThanhTa);
        app_layer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapCoTaySau.this, NgoiGheDocThanhTa.class);
                startActivity(picture_intent );
            }
        });
        LinearLayout app_layer4 = (LinearLayout) findViewById (R.id.CoTaySauVoiCap);
        app_layer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapCoTaySau.this, CoTaySauVoiCap.class);
                startActivity(picture_intent );
            }
        });



    }
}
