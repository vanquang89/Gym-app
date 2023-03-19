package com.example.pc.gym_club;

import static android.widget.Toast.makeText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pc.gym_club.huongdandongtac.BapTayThanhTa;
import com.example.pc.gym_club.huongdandongtac.DumbbellCurl;
import com.example.pc.gym_club.huongdandongtac.DumbbellHammer;

public class BaiTapBapTayTruoc extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap_bap_tay_truoc);
        LinearLayout app_layer = (LinearLayout) findViewById (R.id.dumbell);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapBapTayTruoc.this, DumbbellCurl.class);
                startActivity(picture_intent );
            }
        });


        LinearLayout app_layer1 = (LinearLayout) findViewById (R.id.dumbell1);
        app_layer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapBapTayTruoc.this, DumbbellHammer.class);
                startActivity(picture_intent );
            }
        });

        LinearLayout app_layer2 = (LinearLayout) findViewById (R.id.baptaythanhta);
        app_layer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapBapTayTruoc.this, BapTayThanhTa.class);
                startActivity(picture_intent );
            }
        });
    }




}
