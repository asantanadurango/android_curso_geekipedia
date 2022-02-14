package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2;
    private TextView resultado;
    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", String.valueOf(n1));
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.n1);
        n2 = (EditText)findViewById(R.id.n2);
        resultado = (TextView) findViewById(R.id.resultado);
    }

    public void click(View view){
        num++;

        Toast.makeText(this, "Diste un click " + num, Toast.LENGTH_SHORT).show();
        int v1 = Integer.parseInt(n1.getText().toString());
        int v2 = Integer.parseInt(String.valueOf(n2.getText()));

        String resultado = String.valueOf(v1+v2);
        this.resultado.setText(resultado);
    }


}