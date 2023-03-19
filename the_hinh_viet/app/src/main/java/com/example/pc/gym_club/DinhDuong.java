package com.example.pc.gym_club;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DinhDuong extends AppCompatActivity {
        Button btnQuayLai5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinh_duong);
        btnQuayLai5 =(Button)findViewById(R.id.btnQuayLai5);
        btnQuayLai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnquaylai5 =new Intent(DinhDuong.this, MenuApp.class);
                startActivity(btnquaylai5);
            }
        });
    }
}
