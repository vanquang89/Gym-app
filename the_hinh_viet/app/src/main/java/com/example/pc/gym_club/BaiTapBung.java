package com.example.pc.gym_club;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pc.gym_club.huongdandongtac.DeclineABCrunch;
import com.example.pc.gym_club.huongdandongtac.EpNgucKeoCap;
import com.example.pc.gym_club.huongdandongtac.GheDocDayNguc;
import com.example.pc.gym_club.huongdandongtac.InclineKnee;
import com.example.pc.gym_club.huongdandongtac.NamGheDayNguc;
import com.example.pc.gym_club.huongdandongtac.NamGheNgangFly;
import com.example.pc.gym_club.huongdandongtac.TapBungToanDien;
import com.example.pc.gym_club.huongdandongtac.TapBungXaDon;
import com.example.pc.gym_club.huongdandongtac.VerticalKnee;
import com.example.pc.gym_club.huongdandongtac.XaKepChoNguc;

public class BaiTapBung extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap_bung);


        LinearLayout app_layer = (LinearLayout) findViewById (R.id.InclineKnee);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapBung.this, InclineKnee.class);
                startActivity(picture_intent );
            }
        });


        LinearLayout app_layer1 = (LinearLayout) findViewById (R.id.VerticalKnee);
        app_layer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapBung.this, VerticalKnee.class);
                startActivity(picture_intent );
            }
        });

        LinearLayout app_layer2 = (LinearLayout) findViewById (R.id.DeclineABCrunch);
        app_layer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapBung.this, DeclineABCrunch.class);
                startActivity(picture_intent );
            }
        });


        LinearLayout app_layer3 = (LinearLayout) findViewById (R.id.TapBungToanDien);
        app_layer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapBung.this, TapBungToanDien.class);
                startActivity(picture_intent );
            }
        });

        LinearLayout app_layer4 = (LinearLayout) findViewById (R.id.TapBungXaDon);
        app_layer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(BaiTapBung.this, TapBungXaDon.class);
                startActivity(picture_intent );
            }
        });

    }


}
