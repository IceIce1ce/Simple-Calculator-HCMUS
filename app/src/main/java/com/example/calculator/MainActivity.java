package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnAC, btnAddMinus, btnPercentage, btnDivide, btn7, btn8, btn9, btnMulti, btn4, btn5, btn6, btnMinus, btn1, btn2, btn3, btnAdd, btn0, btnDot, btnEqual;
    private EditText txtResult;
    private float val1, val2;
    boolean isAdd, isMinus, isMulti, isDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btnAC = findViewById(R.id.btnAC);
        btnAddMinus = findViewById(R.id.btnAddMinus);
        btnPercentage = findViewById(R.id.btnPercentage);
        btnDivide = findViewById(R.id.btnDivide);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnMulti = findViewById(R.id.btnMulti);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btnMinus = findViewById(R.id.btnMinus);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnAdd = findViewById(R.id.btnAdd);
        btn0 = findViewById(R.id.btn0);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);
        txtResult = findViewById(R.id.txt_result);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText().toString() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText().toString() + "0");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(txtResult.getText().toString())){
                    txtResult.setText("");
                    Toast.makeText(MainActivity.this, "Input number first", Toast.LENGTH_SHORT).show();
                }
                else {
                    val1 = Float.parseFloat(txtResult.getText().toString());
                    isAdd = true;
                    txtResult.setText("");
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(txtResult.getText().toString())){
                    txtResult.setText("");
                    Toast.makeText(MainActivity.this, "Input number first", Toast.LENGTH_SHORT).show();
                }
                else {
                    val1 = Float.parseFloat(txtResult.getText().toString());
                    isMinus = true;
                    txtResult.setText("");
                }
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(txtResult.getText().toString())){
                    txtResult.setText("");
                    Toast.makeText(MainActivity.this, "Input number first", Toast.LENGTH_SHORT).show();
                }
                else {
                    val1 = Float.parseFloat(txtResult.getText().toString());
                    isMulti = true;
                    txtResult.setText("");
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(txtResult.getText().toString())){
                    txtResult.setText("");
                    Toast.makeText(MainActivity.this, "Input number first", Toast.LENGTH_SHORT).show();
                }
                else {
                    val1 = Float.parseFloat(txtResult.getText().toString());
                    isDivide = true;
                    txtResult.setText("");
                }
            }
        });
        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(txtResult.getText().toString())){
                    txtResult.setText("");
                    Toast.makeText(MainActivity.this, "Input number first", Toast.LENGTH_SHORT).show();
                }
                else {
                    txtResult.setText(String.valueOf(Float.parseFloat(txtResult.getText().toString()) / 100.0));
                }
            }
        });
        btnAddMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(txtResult.getText().toString())){
                    Toast.makeText(MainActivity.this, "Input number first", Toast.LENGTH_SHORT).show();
                }
                else {
                    //val1 = Float.parseFloat(txtResult.getText().toString());
                    //val1 *= -1;
                    //txtResult.setText(String.valueOf(val1));
                    txtResult.setText(String.valueOf(Float.parseFloat(txtResult.getText().toString()) * -1));
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(txtResult.getText().toString())){
                    txtResult.setText("");
                    Toast.makeText(MainActivity.this, "Input calculation first", Toast.LENGTH_SHORT).show();
                }
                else{
                    val2 = Float.parseFloat(txtResult.getText().toString());
                    if(isAdd){
                        txtResult.setText(String.valueOf(val1 + val2));
                        isAdd = false;
                    }
                    if(isMinus){
                        txtResult.setText(String.valueOf(val1 - val2));
                        isAdd = false;
                    }
                    if(isMulti){
                        txtResult.setText(String.valueOf(val1 * val2));
                        isAdd = false;
                    }
                    if(isDivide){
                        txtResult.setText(String.valueOf(val1 / val2));
                        isAdd = false;
                    }
                }
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");
                val1 = Float.NaN;
                val2 = Float.NaN;
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText().toString() + ".");
            }
        });
    }
}