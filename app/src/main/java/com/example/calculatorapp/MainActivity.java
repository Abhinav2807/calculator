package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four, five, six, seven, eight, nine, zero, equals, clear, dot, plus, minus, multiply, division;
    EditText result;
    int mFlag =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.expression);
        one = findViewById(R.id.one) ; one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });
        two = findViewById(R.id.two) ;two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        three = findViewById(R.id.three); three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        four = findViewById(R.id.four); four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        five = findViewById(R.id.five) ; five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        six = findViewById(R.id.six); six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        seven = findViewById(R.id.seven) ; seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        eight = findViewById(R.id.eight); eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        nine =  findViewById(R.id.nine) ; nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        zero = findViewById(R.id.zero); zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });
        equals =findViewById(R.id.equals); equals.setOnClickListener(new View.OnClickListener() {
            float finalResult;
            @Override
            public void onClick(View v) {
                String expression = result.getText().toString();
                switch (mFlag){
                    case 1: finalResult=evaluate(expression,mFlag); result.setText("Result: "+finalResult);break ;
                    case 2: finalResult=evaluate(expression,mFlag); result.setText("Result: "+finalResult);break ;
                    case 3: finalResult=evaluate(expression,mFlag); result.setText("Result: "+finalResult);break;
                    case 4: finalResult=evaluate(expression,mFlag); result.setText("Result: "+finalResult);break;
                }

            }
        });
        clear = findViewById(R.id.clear) ; clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(" ");
            }
        });
        dot = findViewById(R.id.dot); dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });
        plus = findViewById(R.id.plus); plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mFlag = 1;
               result.setText(result.getText()+"+");
            }
        });
        minus = findViewById(R.id.minus);minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFlag = 2;
                result.setText(result.getText()+"-");
            }
        });
        multiply = findViewById(R.id.multiply); multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFlag = 3;
                result.setText(result.getText()+"*");
            }
        });
        division = findViewById(R.id.divide); division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFlag = 4;
                result.setText(result.getText()+"/");
            }
        });
    }
    public float evaluate(String str, int delimit) {
        String token[] = str.split(String.valueOf(delimit));
        float first = Float.parseFloat(token[0]);
        float second = Float.parseFloat(token[1]);
        float result;

        switch (delimit) {
            case 1:
                result = first + second;
                return result;
            case 2:
                result = first - second;
                return result;

            case 3:
                result = first * second;
                return result;
            case 4:
                result = first / second;
                return result;
        }
        return 1;
    }
}
