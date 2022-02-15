package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2;
    private RadioButton rb1, rb2, rb3, rb4;
    private TextView resultado;
    private String defaultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", String.valueOf(n1));
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.n1);
        n2 = (EditText)findViewById(R.id.n2);
        rb1 = (RadioButton)findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);
        rb3 = (RadioButton)findViewById(R.id.rb3);
        rb4 = (RadioButton)findViewById(R.id.rb4);
        resultado = (TextView) findViewById(R.id.resultado);
        defaultText = resultado.getText().toString();
    }

    public void click(View view){
        int n1_value = Integer.parseInt(String.valueOf(n1.getText()));
        int n2_value = Integer.parseInt(String.valueOf(n2.getText()));
        int resultado_value;
        String n1_str = String.valueOf(n1_value);
        String n2_str = String.valueOf(n2_value);
        String resultado_str;

        if(rb1.isChecked()){
            resultado_value = n1_value + n2_value;
            resultado_str = String.valueOf(resultado_value);
            resultado.setText(defaultText + ": " + n1_str + " + " + n2_str + " = " + resultado_str );
            return;
        }
        if(rb2.isChecked()){
            resultado_value = n1_value - n2_value;
            resultado_str = String.valueOf(resultado_value);
            resultado.setText(defaultText + ": " + n1_str + " - " + n2_str + " = " + resultado_str );
            return;
        }

        if(rb3.isChecked()){
            resultado_value = n1_value * n2_value;
            resultado_str = String.valueOf(resultado_value);
            resultado.setText(defaultText + ": " + n1_str + " x " + n2_str + " = " + resultado_str );
            return;
        }

        if(rb4.isChecked()){
            if(n2_value == 0){
                Toast.makeText(this, "No puedes dividir por 0", Toast.LENGTH_SHORT).show();
                return;
            }
            resultado_value = n1_value / n2_value;
            resultado_str = String.valueOf(resultado_value);
            resultado.setText(defaultText + ": " + n1_str + " / " + n2_str + " = " + resultado_str );
            return;
        }

    }




}