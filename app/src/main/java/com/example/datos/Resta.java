package com.example.datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Resta extends AppCompatActivity implements View.OnClickListener {

    EditText num1,num2,Resultado2;

    Button Operar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);

        Resultado2 = (EditText) findViewById(R.id.resultado);

        Operar = (Button) findViewById(R.id.Action);
        Operar.setOnClickListener(this);




    }
    //metodo para regresar
    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);



    }

    @Override
    public void onClick(View view) {
        float n1,res;
        float n2;

        n1 = Float.parseFloat(num1.getText().toString());
        n2 = Float.parseFloat(num2.getText().toString());

        switch (view.getId()){
            case  R.id.Action:
                res = n1-n2;
                Resultado2.setText("El Resultado es: "+ res);
        }
    }
}