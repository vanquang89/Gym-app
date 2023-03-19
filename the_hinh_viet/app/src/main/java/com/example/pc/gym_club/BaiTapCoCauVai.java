package com.example.pc.gym_club;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


import androidx.appcompat.app.AppCompatActivity;

import com.example.pc.gym_club.huongdandongtac.BapTayThanhTa;
import com.example.pc.gym_club.huongdandongtac.CauVaiVoiCap;
import com.example.pc.gym_club.huongdandongtac.CauVaiVoiTaDon;
import com.example.pc.gym_club.huongdandongtac.CauVaiVoiTaTay;
import com.example.pc.gym_club.huongdandongtac.DumbbellCurl;
import com.example.pc.gym_club.huongdandongtac.DumbbellHammer;

public class BaiTapCoCauVai extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap_co_cau_vai);
        LinearLayout app_layer = (LinearLayout) findViewById (R.id.cauvaitadon);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapCoCauVai.this, CauVaiVoiTaTay.class);
                startActivity(picture_intent );
            }
        });


        LinearLayout app_layer1 = (LinearLayout) findViewById (R.id.cauvaithanhdon);
        app_layer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapCoCauVai.this, CauVaiVoiTaDon.class);
                startActivity(picture_intent );
            }
        });

        LinearLayout app_layer2 = (LinearLayout) findViewById (R.id.cauvaicap);
        app_layer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapCoCauVai.this, CauVaiVoiCap.class);
                startActivity(picture_intent );
            }
        });
    }
}
