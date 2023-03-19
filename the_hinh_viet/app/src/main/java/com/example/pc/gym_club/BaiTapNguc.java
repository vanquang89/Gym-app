package com.example.pc.gym_club;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pc.gym_club.exercise.Nguc1;
import com.example.pc.gym_club.huongdandongtac.CauVaiVoiCap;
import com.example.pc.gym_club.huongdandongtac.CauVaiVoiTaDon;
import com.example.pc.gym_club.huongdandongtac.CauVaiVoiTaTay;
import com.example.pc.gym_club.huongdandongtac.EpNgucKeoCap;
import com.example.pc.gym_club.huongdandongtac.GheDocDayNguc;
import com.example.pc.gym_club.huongdandongtac.NamGheDayNguc;
import com.example.pc.gym_club.huongdandongtac.NamGheNgangFly;
import com.example.pc.gym_club.huongdandongtac.XaKepChoNguc;

public class BaiTapNguc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap_nguc);
        LinearLayout app_layer = (LinearLayout) findViewById (R.id.NamGheDayNguc);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapNguc.this, NamGheDayNguc.class);
                startActivity(picture_intent );
            }
        });


        LinearLayout app_layer1 = (LinearLayout) findViewById (R.id.GheDocDayNguc);
        app_layer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapNguc.this, GheDocDayNguc.class);
                startActivity(picture_intent );
            }
        });

        LinearLayout app_layer2 = (LinearLayout) findViewById (R.id.NamGheNgangFly);
        app_layer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapNguc.this, NamGheNgangFly.class);
                startActivity(picture_intent );
            }
        });


        LinearLayout app_layer3 = (LinearLayout) findViewById (R.id.XaKepChoNguc);
        app_layer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapNguc.this, XaKepChoNguc.class);
                startActivity(picture_intent );
            }
        });

        LinearLayout app_layer4 = (LinearLayout) findViewById (R.id.EpNgucKeoCap);
        app_layer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapNguc.this, EpNgucKeoCap.class);
                startActivity(picture_intent );
            }
        });

    }

}
