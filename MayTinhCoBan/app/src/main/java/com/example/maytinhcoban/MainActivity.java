package com.example.maytinhcoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Khai báo biến giao diện ở dây
    EditText edtA,edtB,output;
    Button btn_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ánh xạ id cho các biến giao diện
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        output = findViewById(R.id.output);
        btn_result = findViewById(R.id.btn_result);
        //Xử lý click
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int a = Integer.parseInt(edtA.getText().toString()); //lấy dữ liệu từ edtA  chuyển sang kiểu int
                    int b = Integer.parseInt(edtB.getText().toString());
                    int c = a + b;
                    output.setText(c+"");
                }
                catch (Exception e){
                    e.printStackTrace();
                }


            }
        });
    }
}