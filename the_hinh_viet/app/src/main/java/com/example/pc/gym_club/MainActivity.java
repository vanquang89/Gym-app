package com.example.pc.gym_club;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button btnTiepTuc1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTiepTuc1 =(Button)findViewById(R.id.btnTiepTuc1);
        btnTiepTuc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btntieptuc1 = new Intent(MainActivity.this, StartScreen.class);
                startActivity(btntieptuc1);
            }
        });
    }
}
