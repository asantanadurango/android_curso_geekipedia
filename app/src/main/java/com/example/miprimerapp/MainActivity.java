package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2, n3;
    private TextView resultado;
    private String defaultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", String.valueOf(n1));
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.n1);
        n2 = (EditText)findViewById(R.id.n2);
        n3 = (EditText) findViewById(R.id.n3);
        resultado = (TextView) findViewById(R.id.resultado);
        defaultText = resultado.getText().toString();
    }

    public void click(View view){
        int v1 = Integer.parseInt(n1.getText().toString());
        int v2 = Integer.parseInt(String.valueOf(n2.getText()));
        int v3 = Integer.parseInt(n3.getText().toString());

        ;
        int finalNote = (v1+v2+v3)/3;
        String resultado = String.valueOf(finalNote);
        if(finalNote >=6){
            this.resultado.setText(defaultText + ": Aprobado " + resultado);
        }else{
            this.resultado.setText(defaultText + ": Reprobado " + resultado);
        }

    }


}