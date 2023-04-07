package com.example.datos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Opcion;

    EditText resultadoOpcion;

    Button Test,Map;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Opcion = (EditText) findViewById(R.id.num1);
        resultadoOpcion = (EditText) findViewById(R.id.Operation);

        Map  = (Button)findViewById(R.id.map);
        Map.setOnClickListener(v -> {
            Intent mapActivity = new Intent(this,MapsActivity.class);
            startActivity(mapActivity);
        });

        Test = (Button) findViewById(R.id.test);
        Test.setOnClickListener(this);

    }

    //Metodo Boton El boton siguiente

   /* public void Siguiente(View view){
        Intent siguiente = new Intent(this,Resultado.class);
        startActivity(siguiente);

    }
*/

    ;




    @Override
    public void onClick(View view) {
        float n1;


        n1 = Float.parseFloat(Opcion.getText().toString());



        if (n1 == 1.0){
            Intent siguiente = new Intent(this,Resultado.class);
            startActivity(siguiente);
        }else if( n1 == 2.0){
            Intent resta = new Intent(this,Resta.class);
            startActivity(resta);
        }else if ( n1 == 3.0){
            Intent multiplicacion = new Intent(this, Multiplicacion.class);
            startActivity(multiplicacion);
        } else if (n1 == 4.0) {
            Intent dividir = new Intent(this, Division.class);
            startActivity(dividir);
        }

    }
}