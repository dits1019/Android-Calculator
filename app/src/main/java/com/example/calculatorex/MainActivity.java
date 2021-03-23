package com.example.calculatorex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn_plus,btn_minus,btn_multi,btn_divide,btn_init,btn_cal;
    TextView input_number, result_number;
    String tempText = "";
    int num1, num2, result, sortation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multi = findViewById(R.id.btn_multi);
        btn_divide = findViewById(R.id.btn_divide);
        input_number = findViewById(R.id.input_number);
        result_number = findViewById(R.id.result_number);
        btn_cal = findViewById(R.id.btn_cal);
        btn_init = findViewById(R.id.btn_init);


        btn0.setOnClickListener(onClickListener);
        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);
        btn5.setOnClickListener(onClickListener);
        btn6.setOnClickListener(onClickListener);
        btn7.setOnClickListener(onClickListener);
        btn8.setOnClickListener(onClickListener);
        btn9.setOnClickListener(onClickListener);
        btn_plus.setOnClickListener(onClickListener);
        btn_minus.setOnClickListener(onClickListener);
        btn_multi.setOnClickListener(onClickListener);
        btn_divide.setOnClickListener(onClickListener);
        btn_cal.setOnClickListener(onClickListener);
        btn_init.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn0:
                    tempText = tempText + "0";
                    input_number.setText(tempText);
                    break;
                case R.id.btn1:
                    tempText = tempText + "1";
                    input_number.setText(tempText);
                    break;
                case R.id.btn2:
                    tempText = tempText + "2";
                    input_number.setText(tempText);
                    break;
                case R.id.btn3:
                    tempText = tempText + "3";
                    input_number.setText(tempText);
                    break;
                case R.id.btn4:
                    tempText = tempText + "4";
                    input_number.setText(tempText);
                    break;
                case R.id.btn5:
                    tempText = tempText + "5";
                    input_number.setText(tempText);
                    break;
                case R.id.btn6:
                    tempText = tempText + "6";
                    input_number.setText(tempText);
                    break;
                case R.id.btn7:
                    tempText = tempText + "7";
                    input_number.setText(tempText);
                    break;
                case R.id.btn8:
                    tempText = tempText + "8";
                    input_number.setText(tempText);
                    break;
                case R.id.btn9:
                    tempText = tempText + "9";
                    input_number.setText(tempText);
                    break;
                case R.id.btn_plus:
                    tempText = tempText + "+";
                    input_number.setText(tempText);
                    sortation = 1;
                    break;
                case R.id.btn_minus:
                    tempText = tempText + "-";
                    input_number.setText(tempText);
                    sortation = 2;
                    break;
                case R.id.btn_multi:
                    tempText = tempText + "X";
                    input_number.setText(tempText);
                    sortation = 3;
                    break;
                case R.id.btn_divide:
                    tempText = tempText + "/";
                    input_number.setText(tempText);
                    sortation = 4;
                    break;
                case R.id.btn_init:
                    tempText = "";
                    input_number.setText(tempText);
                    break;
                case R.id.btn_cal:
                    Calculation();
                    String integer_result = Integer.toString(result);
                    result_number.setText(integer_result);
            }
        }
    };

    private void Calculation(){
        switch (sortation){
            case 1:
                String [] plusText = tempText.split("\\+");
                num1 = Integer.parseInt(plusText[0]);
                num2 = Integer.parseInt(plusText[1]);
                result = num1 + num2;
                break;
            case 2:
                String [] minusText = tempText.split("-");
                num1 = Integer.parseInt(minusText[0]);
                num2 = Integer.parseInt(minusText[1]);
                result = num1 - num2;
                break;
            case 3:
                String [] multiText = tempText.split("X");
                num1 = Integer.parseInt(multiText[0]);
                num2 = Integer.parseInt(multiText[1]);
                result = num1 * num2;
                break;
            case 4:
                String [] divideText = tempText.split("/");
                num1 = Integer.parseInt(divideText[0]);
                num2 = Integer.parseInt(divideText[1]);
                result = num1 / num2;
                break;
        }
    }

}