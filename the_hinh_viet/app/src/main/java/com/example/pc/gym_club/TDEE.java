package com.example.pc.gym_club;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TDEE extends AppCompatActivity {
    Button  btnTDEE;
    TextView  tvTDEE;
    Spinner spinner, spinner1;
    EditText editTextNumber5, editTextNumber6, editTextNumber7;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdee);
        editTextNumber7 =(EditText)findViewById(R.id.editTextNumber7);
        editTextNumber5 =(EditText)findViewById(R.id.editTextNumber5);
        editTextNumber6 =(EditText)findViewById(R.id.editTextNumber6);
        btnTDEE=(Button)findViewById(R.id.btnTDEE);
        tvTDEE =(TextView)findViewById(R.id.tvTDEE);

        spinner =(Spinner)findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.Group_Name, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner1=(Spinner)findViewById(R.id.spinner1);
        adapter =ArrayAdapter.createFromResource(this, R.array.Gioi_Tinh, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnTDEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double weitght1;
                double heitght1;
                double Tuoi;
                double tdee;
                if (editTextNumber5.getText().toString().equals("") || editTextNumber6.getText().toString().equals("")) {
                    Toast.makeText(TDEE.this, "Hãy Nhập Giá Trị", Toast.LENGTH_LONG).show();
                } else {
                    weitght1 = Double.parseDouble(editTextNumber6.getText().toString());
                    heitght1 = Double.parseDouble(editTextNumber5.getText().toString());
                    Tuoi = Double.parseDouble(editTextNumber7.getText().toString());


                    if (spinner.getSelectedItemPosition() == 0 && spinner1.getSelectedItemPosition() == 0) {
                        tdee = ((13.387 * weitght1) + (4.799 * heitght1) - (5.677 * Tuoi) + 88.362) * 1.2;
                        tvTDEE.setText(String.valueOf(tdee) + " calors");
                    } else if (spinner.getSelectedItemPosition() == 0 && spinner1.getSelectedItemPosition() == 1) {
                       tdee =((9.247 * weitght1) + (3.098 * heitght1) - (4.330 * Tuoi) + 447.593) * 1.2;
                        tvTDEE.setText(String.valueOf(tdee) + " calors");
                    }
                    if (spinner.getSelectedItemPosition() == 1 && spinner1.getSelectedItemPosition() == 0) {
                        tdee = ((13.387 * weitght1) + (4.799 * heitght1) - (5.677 * Tuoi) + 88.362) * 1.375;
                        tvTDEE.setText(String.valueOf(tdee) + " calors");
                    } else if (spinner.getSelectedItemPosition() == 1 && spinner1.getSelectedItemPosition() == 1) {
                        tdee =((9.247 * weitght1) + (3.098 * heitght1) - (4.330 * Tuoi) + 447.593) * 1.375;
                        tvTDEE.setText(String.valueOf(tdee) + " calors");
                    }
                    if (spinner.getSelectedItemPosition() == 2 && spinner1.getSelectedItemPosition() == 0) {
                        tdee = ((13.387 * weitght1) + (4.799 * heitght1) - (5.677 * Tuoi) + 88.362) * 1.55;
                        tvTDEE.setText(String.valueOf(tdee) + " calors");
                    }else if (spinner.getSelectedItemPosition() == 2 && spinner1.getSelectedItemPosition() == 1){
                        tdee =((9.247 * weitght1) + (3.098 * heitght1) - (4.330 * Tuoi) + 447.593) * 1.55;
                        tvTDEE.setText(String.valueOf(tdee) + " calors");
                    }
                    if (spinner.getSelectedItemPosition() == 3 && spinner1.getSelectedItemPosition() == 0){
                        tdee = ((13.387 * weitght1) + (4.799 * heitght1) - (5.677 * Tuoi) + 88.362) * 1.725;
                        tvTDEE.setText(String.valueOf(tdee) + " calors");
                    }else if (spinner.getSelectedItemPosition() == 3 && spinner1.getSelectedItemPosition() == 1){
                        tdee =((9.247 * weitght1) + (3.098 * heitght1) - (4.330 * Tuoi) + 447.593) * 1.725;
                        tvTDEE.setText(String.valueOf(tdee) + " calors");
                    }
                    if (spinner.getSelectedItemPosition() == 4 && spinner1.getSelectedItemPosition() == 0) {
                        tdee = ((13.387 * weitght1) + (4.799 * heitght1) - (5.677 * Tuoi) + 88.362) * 1.9;
                        tvTDEE.setText(String.valueOf(tdee) + " calors");
                    }else if (spinner.getSelectedItemPosition() == 4 && spinner1.getSelectedItemPosition() == 1){
                        tdee =((9.247 * weitght1) + (3.098 * heitght1) - (4.330 * Tuoi) + 447.593) * 1.9;
                        tvTDEE.setText(String.valueOf(tdee) + " calors");
                    }
                }
            }
        });

    }
}
