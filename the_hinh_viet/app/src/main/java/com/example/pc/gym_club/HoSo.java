package com.example.pc.gym_club;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class HoSo extends AppCompatActivity {
    Button btnGetData;
    TextView tvhoten1, tvChieuc, tvCann, tvgt1, tvbmii, tvkqbmii;
    ImageView imavatar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ProgressDialog pd = new ProgressDialog(HoSo.this);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_ho_so);
        tvbmii = (TextView) findViewById(R.id.tvBmii);
        imavatar = (ImageView) findViewById(R.id.imageAvatar);
        tvgt1 = (TextView) findViewById(R.id.tvGT1);
        tvhoten1 = (TextView) findViewById(R.id.tvHoten1);
        btnGetData = (Button) findViewById(R.id.btnGetData);
        tvChieuc = (TextView) findViewById(R.id.tvChieuc);
        tvCann = (TextView) findViewById(R.id.tvCann);
        final Firebase root1 = new Firebase("https://haikeo.firebaseio.com");

        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show dialog
                pd.setTitle("Cập nhật hồ sơ");
                pd.setMessage("Loading...");
                pd.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

               pd.show();

                root1.child("hovaten").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        tvhoten1.setText(dataSnapshot.getValue().toString());
                    pd.dismiss();
                        Toast.makeText(HoSo.this, "Thành công", Toast.LENGTH_SHORT);
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {
                        pd.dismiss();
                        Toast.makeText(HoSo.this, "Cập nhật thất bại", Toast.LENGTH_SHORT).show();
                    }
                });
                root1.child("chieucao").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        tvChieuc.setText("Chiều cao của bạn là: " + dataSnapshot.getValue().toString() + "cm");
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }
                });
                root1.child("cannang").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        tvCann.setText("Cân nặng của bạn là: " + dataSnapshot.getValue().toString() + "kg");
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }
                });
                root1.child("gioitinh").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        tvgt1.setText("Giới tính: " + dataSnapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }
                });
            }
        });
    }
    }
