package com.example.botonesdinamicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void crear(View vista){
        //selecciono el linearlayout donde vayamos a crear los botones de forma dinamica
        LinearLayout botones1 =  findViewById(R.id.botones1);
        //creo un objeto de la clase button ya que vamos a añadir botones( se crea el onjeto del elemento que queramos añadir)
        Button boton1=new Button(this);
        //añado el boton creado "boton1" al layout seleccionado anteriormente
        botones1.addView(boton1);

    }





}
