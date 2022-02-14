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
    private RadioButton rb1, rb2;
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
        resultado = (TextView) findViewById(R.id.resultado);
        defaultText = resultado.getText().toString();        
        
    }

    public void click(View view){
        int value1 = Integer.parseInt(n1.getText().toString());
        int value2 = Integer.parseInt(n2.getText().toString());
        int resultado;
        if(rb1.isChecked()){
            resultado = value1 + value2;
            this.resultado.setText(defaultText + ": " + String.valueOf(resultado));
        }
        if (rb2.isChecked()){
            resultado = value1 - value2;
            this.resultado.setText(defaultText + ": " + String.valueOf(resultado));
        }

        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

    }


}