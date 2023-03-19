package com.example.pc.gym_club;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChuongTrinh extends AppCompatActivity {
        Button btnQuayLai4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuong_trinh);
        btnQuayLai4 =(Button)findViewById(R.id.btnQuayLai4);
        btnQuayLai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }
}
