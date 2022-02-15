package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2;
    private CheckBox chb1, chb2;
    private TextView resultado;
    private String defaultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.n1);
        n2 = (EditText)findViewById(R.id.n2);
        chb1 = (CheckBox)findViewById(R.id.chb1);
        chb2 = (CheckBox)findViewById(R.id.chb2);
        resultado = (TextView) findViewById(R.id.resultado);
        defaultText = resultado.getText().toString();

    }

    public void click(View view){
        String n1_str = "Mi nombre es: " + n1.getText() + ".";
        String n2_str = "Tengo: " + n2.getText() + " años.";
        String resultado_str;
        if(chb1.isChecked()){
            resultado.setText(n1_str);
        }
        if(chb2.isChecked()){
            resultado.setText(n2_str);
        }

        if(chb1.isChecked() && chb2.isChecked()){
            resultado.setText(n1_str +"\n" + n2_str);
        }

    }





}