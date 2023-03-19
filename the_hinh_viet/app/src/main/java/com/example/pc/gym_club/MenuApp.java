package com.example.pc.gym_club;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuApp extends AppCompatActivity {
        Button btnBaiTap, btnChuongTrinh, btnTools, btnHoSo, btnDinhDuong, btnQuayLai1;
        Button btnCamera, btnEmail, btnFacebook;
        TextView tvHoten, textViewGT, textViewCao, textViewCan;
        ImageView imageGetAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_app);
        imageGetAvatar =(ImageView)findViewById(R.id.imageGetAvatar);
        textViewGT=(TextView)findViewById(R.id.textViewGioiTinh);
        textViewCao =(TextView)findViewById(R.id.textViewCao);
        textViewCan =(TextView)findViewById(R.id.textViewCan);
        tvHoten =(TextView)findViewById(R.id.tvHoten);
        btnBaiTap=(Button)findViewById(R.id.btnBaiTap);
        btnBaiTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbaitap =new Intent(MenuApp.this, MangCoTruoc.class);
                startActivity(btnbaitap);
            }
        });
        btnChuongTrinh =(Button)findViewById(R.id.btnChuongTrinh);
        btnChuongTrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnchuongtrinh = new Intent(MenuApp.this, ChuongTrinh.class);
                startActivity(btnchuongtrinh);
            }
        });
        btnTools=(Button)findViewById(R.id.btnTools);
        btnTools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btntools = new Intent(MenuApp.this, CongCuHoTro.class);
                startActivity(btntools);
            }
        });
        btnHoSo=(Button)findViewById(R.id.btnHoSo);
        btnHoSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnhoso =new Intent(MenuApp.this, HoSo.class);
                startActivity(btnhoso);
            }
        });
        btnDinhDuong= (Button)findViewById(R.id.btnDinhDuong);
        btnDinhDuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndinhduong =new Intent(MenuApp.this, DinhDuong.class);
                startActivity(btndinhduong);
            }
        });

        Bundle bd = getIntent().getExtras();
        if(bd !=null){
            String ten  = bd.getString("hoten");
            tvHoten.setText(ten);
            String cc = bd.getString("chieucao");
            textViewCao.setText(cc + "cm");
            String cn =bd.getString("cannang");
            textViewCan.setText(cn + "kg");

            String fileAvatar = bd.getString("avatar");

            Bitmap yourSelectedImage = BitmapFactory.decodeFile(fileAvatar);
            Drawable d= new BitmapDrawable(yourSelectedImage);
            imageGetAvatar.setImageBitmap(yourSelectedImage);
            String gt = bd.getString("GioiTinh");
            textViewGT.setText(gt);

        }

    }
    public void btnClick1 (View view){
        Intent btnEmail = new Intent(Intent.ACTION_VIEW, Uri.parse("https://support.google.com/mail/answer/8494?hl=vi"));
        startActivity(btnEmail);
    }
    public void btnClick2(View view){
        Intent btnFacebook = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100008848260545"));
        startActivity(btnFacebook);
    }
    public  void  btnClick3 (View view){
        Intent btnCamera = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(btnCamera);
    }
}
