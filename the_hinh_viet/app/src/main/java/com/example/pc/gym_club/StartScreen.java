package com.example.pc.gym_club;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.firebase.client.Firebase;

public class StartScreen extends AppCompatActivity {
    Button btnTiepTuc2;
    Button btnGetPicture;
    ImageView imageAvater;
    EditText editTextHoTen, editTextNumber1, editTextNumber2;
    private static final int SELECTED_PICTURE = 1;
    private String fileAvatar;
    Spinner spinner2;
    ArrayAdapter<CharSequence> adapter1;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_start_screen);
        btnsave = (Button) findViewById(R.id.btnSave);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        editTextNumber1 = (EditText) findViewById(R.id.editTextNumber1);
        editTextHoTen = (EditText) findViewById(R.id.editTextHoTen);
        btnTiepTuc2 = (Button) findViewById(R.id.btnTiepTuc2);

        btnTiepTuc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextHoTen.getText().toString().equals("") || editTextNumber1.getText().toString().equals("") || editTextNumber2.getText().toString().equals("")) {
                    Toast.makeText(StartScreen.this, "Chưa hoàn thành thông tin", Toast.LENGTH_LONG).show();
                } else {
                    Intent btntieptuc2 = new Intent(StartScreen.this, MenuApp.class);
                    btntieptuc2.putExtra("hoten", editTextHoTen.getText().toString());
                    btntieptuc2.putExtra("chieucao", editTextNumber1.getText().toString());
                    btntieptuc2.putExtra("cannang", editTextNumber2.getText().toString());
                    btntieptuc2.putExtra("avatar", fileAvatar);
                    btntieptuc2.putExtra("GioiTinh", spinner2.getSelectedItem().toString());
                    startActivity(btntieptuc2);
                }
            }
        });

        imageAvater = (ImageView) findViewById(R.id.imageAvatar);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        adapter1 = ArrayAdapter.createFromResource(this, R.array.Gioi_Tinh, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter1);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final Firebase root = new Firebase("https://haikeo.firebaseio.com");
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextHoTen.getText().toString().equals("") || editTextNumber1.getText().toString().equals("") || editTextNumber2.getText().toString().equals("")) {
                    Toast.makeText(StartScreen.this, "Hãy Nhập Giá Trị", Toast.LENGTH_SHORT).show();
                } else {
                    root.child("hovaten").setValue(editTextHoTen.getText().toString());
                    root.child("chieucao").setValue(editTextNumber1.getText().toString());
                    root.child("cannang").setValue(editTextNumber2.getText().toString());
                    root.child("gioitinh").setValue(spinner2.getSelectedItem().toString());
                    Toast.makeText(StartScreen.this, "Lưu thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void btnClick(View v) {
        Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(i, SELECTED_PICTURE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case SELECTED_PICTURE:
                if (requestCode == RESULT_FIRST_USER && resultCode==RESULT_OK) {
                    Uri uri = data.getData();
                    String[] projection = {MediaStore.Images.Media.DATA};
                    Cursor cursor = getContentResolver().query(uri, projection, null, null, null);
                    cursor.moveToFirst();
                    int columnIndex = cursor.getColumnIndex(projection[0]);
                    fileAvatar = cursor.getString(columnIndex);
                    cursor.close();
                    Bitmap yourSelectedImage = BitmapFactory.decodeFile(fileAvatar);
                    Drawable d = new BitmapDrawable(yourSelectedImage);
                    imageAvater.setImageBitmap(yourSelectedImage);
                }
        }
    }
}
