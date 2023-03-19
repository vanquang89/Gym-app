package com.example.pc.gym_club;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BMI_Calculator extends AppCompatActivity {
    Button btnBMI;
    TextView textViewBMI, textViewMsg, textViewLoiKhuyen;
    EditText editTextNumber3, editTextNumber4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi__calculator);
        textViewLoiKhuyen =(TextView)findViewById(R.id.textViewLoiKhuyen);
        btnBMI =(Button)findViewById(R.id.btnBMI);
        textViewBMI =(TextView)findViewById(R.id.textViewBMI);
        editTextNumber3 =(EditText)findViewById(R.id.editTextNumber3);
        editTextNumber4 =(EditText)findViewById(R.id.editTextNumber4);
        textViewMsg =(TextView)findViewById(R.id.textViewMsg);

        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double weight;
                double height;
                double bmi;
                String msg ="";
                if (editTextNumber4.getText().toString().equals("") || editTextNumber3.getText().toString().equals("")) {
                    Toast.makeText(BMI_Calculator.this, "Hãy Nhập Giá Trị", Toast.LENGTH_LONG).show();
                } else {
                    weight = Double.parseDouble(editTextNumber4.getText().toString());
                    height = Double.parseDouble(editTextNumber3.getText().toString());

                    bmi = height * height;
                    bmi = weight / bmi;

                    textViewBMI.setText(String.valueOf(bmi));

                    if (bmi < 18.5) {
                       msg = "anh em gầy quá !";
                        textViewLoiKhuyen.setText("Anh em nên xem xét lại chế độ ăn uống, kết hợp với luyện tập và ngủ nghỉ hợp lý, tăng chất và lượng bữa ăn, ngủ đủ 8 tiếng 1 ngày" +
                                " nên chia các bài tập theo lịch tập cho người tăng cân với các mực tạ nhẹ, số lần tập nhiều hơn người bình thường");
                    } else if (bmi > 18.5 && bmi < 23) {
                        msg = "Bình thường rồi ! :)";
                        textViewLoiKhuyen.setText("Có thể body anh em đang ở mức bình thường, nhưng muốn tốt hơn thì nên cần chăm chỉ luyện tập kết hợp chế độ ăn uống" +
                                "tập luyện nghiêm ngặt!");
                    } else if(bmi == 23){
                        msg = "Ô thừa cân :(";
                }else if (bmi>23 && bmi < 25) {
                        msg= "Đây người ta gọi là tiền béo phì !";
                        textViewLoiKhuyen.setText("Mức tiền béo phì này là mức báo động, anh em cần xem xét lại các chế độ. Lúc sướng ai sướng cho, gian khổ luyện tập ắt thành body đẹp !" +
                                " chúc anh em giảm cân thành công!");
                    }else if(bmi>=25 && bmi<=29.9){
                       msg= "Anh em béo phì độ 1 rồi đấy !";
                        textViewLoiKhuyen.setText("Béo phì mất rồi! Anh em cần phải xem lại chế độ ăn uống và luyện tập, cần thiết hãy dùng thực phẩm chức năng");
                    }else if(bmi >=30 && bmi<40){
                        msg= "Thôi chết, béo phì độ 2 rồi !";
                    }else if(bmi >=40){
                      msg= "Thôi chết, béo phì độ 3 rồi !";
                    }
                    textViewMsg.setText(msg);
                }
            }
        });
        }
}
