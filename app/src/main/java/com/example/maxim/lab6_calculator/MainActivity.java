package com.example.maxim.lab6_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;/*** Указатель кнопок*/
    TextView Resultate;/*** поле вывода*/
    EditText e1, e2;/*** Указатель текста E1=X, E2=Y*/

    int x, y, res;
    String sx;
    String sy, S;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);/**Указатель кнопки*/
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9); /**восьмерка равно вывод*/

        e1 = (EditText) findViewById(R.id.e1);/**Указатель текстового поля*/
        e2 = (EditText) findViewById(R.id.e2);

        Resultate = (TextView) findViewById(R.id.Resultate);

        b1.setOnClickListener(this); /**Приписал кнопкам нажатие*/
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        sx = e1.getText().toString();
        x = Integer.parseInt(sx);
        sy = e2.getText().toString();
        y = Integer.parseInt(sy);


        switch (v.getId()) {
            case R.id.b1:
                res = x + y;
                S = Integer.toString(res);
                break;
            case R.id.b2:
                res = x - y;
                S = Integer.toString(res);
                break;
            case R.id.b3:
                res = x * y;
                S = Integer.toString(res);
                break;
            case R.id.b4:
                res = x / y;
                S = Integer.toString(res);
                break;
            case R.id.b5:
                res = x % y;
                S = Integer.toString(res);
                break;
            case R.id.b6:
                res = x ^ y;
                S = Integer.toString(res);
                break;
            case R.id.b7:
                S = Integer.toBinaryString(x);
                break;
            case R.id.b8:
                S = Integer.toBinaryString(y);
                break;
            case R.id.b9:
                Resultate.setText(S);
                break;
            default:
                Resultate.setText("Shit");
                break;


        }
    }

}