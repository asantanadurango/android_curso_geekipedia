package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2;
    private Spinner spinner;
    private TextView resultado;
    private String defaultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.n1);
        n2 = (EditText)findViewById(R.id.n2);
        spinner = (Spinner)findViewById(R.id.spinner);
        resultado = (TextView) findViewById(R.id.resultado);
        defaultText = resultado.getText().toString();

        // Dos maneras de rellenar un Spinner.
        Resources res = getResources();
        String[] items =  res.getStringArray(R.array.items);
        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinner.setAdapter(arrayAdapter);
    }

    public void click(View view){
        int n1_value = Integer.parseInt(String.valueOf(n1.getText()));
        int n2_value = Integer.parseInt(String.valueOf(n2.getText()));
        int resultado_value;
        String n1_str = "Mi nombre es: " + n1.getText() + ".";
        String n2_str = "Tengo: " + n2.getText() + " años.";
        String resultado_str;
        String opcionSeleccionada = spinner.getSelectedItem().toString();
        String id = String.valueOf(spinner.getSelectedItemId());
        String posicion = String.valueOf(spinner.getSelectedItemPosition());
        Toast.makeText(this, "Id: " +id+" posición: " +posicion, Toast.LENGTH_SHORT).show();

        switch (opcionSeleccionada){
            case "Sumar":
                resultado_value = n1_value + n2_value;
                resultado_str = String.valueOf(resultado_value);
                resultado.setText(resultado_str);
            break;
            case "Restar":
                resultado_value = n1_value - n2_value;
                resultado_str = String.valueOf(resultado_value);
                resultado.setText(resultado_str);
                break;

            case "Multiplicar":
                resultado_value = n1_value * n2_value;
                resultado_str = String.valueOf(resultado_value);
                resultado.setText(resultado_str);
                break;
            case "Dividir":
                if(n2_value == 0){
                    Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_SHORT).show();
                    return;
                }
                resultado_value = n1_value / n2_value;
                resultado_str = String.valueOf(resultado_value);
                resultado.setText(resultado_str);
                break;
            default: resultado.setText("0");
        }
    }
}