package com.example.chuyendoinhietdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    //Khai Báo biến
    EditText edtC,edtF;
    Button btnC2F,btnF2C,btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ánh xạ id sang các biến
        edtC = findViewById(R.id.edtC);
        edtF = findViewById(R.id.edtF);
        btnC2F = findViewById(R.id.btnF);
        btnF2C = findViewById(R.id.btnC);
        btnClear = findViewById(R.id.btnclear);

        btnC2F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                int c = Integer.parseInt(edtC.getText().toString());
                double f = c*9/5 + 32;
                edtF.setText(dcf.format(f)+"");
            }
        });
        btnF2C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                double f = Double.parseDouble(edtF.getText().toString());
                double c = (f - 32)*5/9;
                edtC.setText(dcf.format(c)+"");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtC.setText("");
                edtF.setText("");
            }
        });
    }
}