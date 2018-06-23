package com.example.reali.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class vsPersona extends AppCompatActivity implements View.OnClickListener {


    private  Button boton1, boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,reset;
    private TextView ptosX, ptosO;
    int puntosO, puntosX;
    int chance = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_persona);


        boton1 = (Button)findViewById(R.id.btn1);
        boton2 =(Button)findViewById(R.id.btn2);
        boton3 = (Button)findViewById(R.id.btn3);
        boton4 = (Button)findViewById(R.id.btn4);
        boton5 = (Button)findViewById(R.id.btn5);
        boton6 = (Button)findViewById(R.id.btn6);
        boton7 = (Button)findViewById(R.id.btn7);
        boton8 = (Button)findViewById(R.id.btn8);
        boton9 = (Button)findViewById(R.id.btn9);



        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);

        ptosX = (TextView) findViewById(R.id.puntuacionX);
        ptosO = (TextView) findViewById(R.id.puntuacionO);

        ptosX.setText("Puntuacion de X: "+puntosX);
        ptosO.setText("Puntuacion de O: "+puntosO);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                if(boton1.getText().toString().equals("")){
                    if(chance == 0){
                        chance=1;
                        boton1.setText("O");
                        resultado();
                    }
                    else {
                        chance = 0;
                        boton1.setText("X");
                        resultado();

                    }

                }
                break;
            case R.id.btn2:
                if(boton2.getText().toString().equals("")){
                    if(chance == 0){
                        chance=1;
                        boton2.setText("O");
                        resultado();
                    }
                    else {
                        chance = 0;
                        boton2.setText("X");
                        resultado();

                    }

                }
                break;
            case R.id.btn3:
                if(boton3.getText().toString().equals("")){
                    if(chance == 0){
                        chance=1;
                        boton3.setText("O");
                        resultado();
                    }
                    else {
                        chance = 0;
                        boton3.setText("X");
                        resultado();

                    }

                }
                break;
            case R.id.btn4:
                if(boton4.getText().toString().equals("")){
                    if(chance == 0){
                        chance=1;
                        boton4.setText("O");
                        resultado();
                    }
                    else {
                        chance = 0;
                        boton4.setText("X");
                        resultado();

                    }

                }
                break;
            case R.id.btn5:
                if(boton5.getText().toString().equals("")){
                    if(chance == 0){
                        chance=1;
                        boton5.setText("O");
                        resultado();
                    }
                    else {
                        chance = 0;
                        boton5.setText("X");
                        resultado();

                    }

                }
                break;
            case R.id.btn6:
                if(boton6.getText().toString().equals("")){
                    if(chance == 0){
                        chance=1;
                        boton6.setText("O");
                        resultado();
                    }
                    else {
                        chance = 0;
                        boton6.setText("X");
                        resultado();

                    }

                }
                break;
            case R.id.btn7:
                if(boton7.getText().toString().equals("")){
                    if(chance == 0){
                        chance=1;
                        boton7.setText("O");
                        resultado();
                    }
                    else {
                        chance = 0;
                        boton7.setText("X");
                        resultado();

                    }

                }
                break;
            case R.id.btn8:
                if(boton8.getText().toString().equals("")){
                    if(chance == 0){
                        chance=1;
                        boton8.setText("O");
                        resultado();
                    }
                    else {
                        chance = 0;
                        boton8.setText("X");
                        resultado();

                    }

                }
                break;
            case R.id.btn9:
                if(boton9.getText().toString().equals("")){
                    if(chance == 0){
                        chance=1;
                        boton9.setText("O");
                        resultado();
                    }
                    else {
                        chance = 0;
                        boton9.setText("X");
                        resultado();

                    }

                }
                break;

        }

    }

    public void   resultado() {

        // GANADOR EN HORIZONTAL

        if (boton1.getText().toString().equals("X") && boton2.getText().toString().equals("X") && boton3.getText().toString().equals("X")) {
            puntosX ++;
            ptosX.setText("Puntuacion de X: "+puntosX);

            Toast.makeText(this, "Player X WIN", Toast.LENGTH_SHORT).show();
            boolean ganar = true;
            Reiniciar();
        } else if (boton4.getText().toString().equals("X") && boton5.getText().toString().equals("X") && boton6.getText().toString().equals("X")) {
            puntosX ++;
            ptosX.setText("Puntuacion de X: "+puntosX);
            Toast.makeText(this, "Player X WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();

        } else if (boton7.getText().toString().equals("X") && boton8.getText().toString().equals("X") && boton9.getText().toString().equals("X")) {
            puntosX ++;
            ptosX.setText("Puntuacion de X: "+puntosX);
            Toast.makeText(this, "Player X WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();
        } else if (boton1.getText().toString().equals("O") && boton2.getText().toString().equals("O") && boton3.getText().toString().equals("O")) {
            puntosO ++;
            ptosO.setText("Puntuacion de O: "+puntosO);
            Toast.makeText(this, "Player O WIN", Toast.LENGTH_SHORT).show();

            Reiniciar();
        } else if (boton4.getText().toString().equals("O") && boton5.getText().toString().equals("O") && boton6.getText().toString().equals("O")) {
            puntosO ++;
            ptosO.setText("Puntuacion de O: "+puntosO);
            Toast.makeText(this, "Player O WIN", Toast.LENGTH_SHORT).show();

            Reiniciar();
        } else if (boton7.getText().toString().equals("O") && boton8.getText().toString().equals("O") && boton9.getText().toString().equals("O")) {
            puntosO ++;
            ptosO.setText("Puntuacion de O: "+puntosO);
            Toast.makeText(this, "Player O WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();
        }


        //GANADOR EN VERTICAL
        else if (boton1.getText().toString().equals("X") && boton4.getText().toString().equals("X") && boton7.getText().toString().equals("X")) {
            puntosX ++;
            ptosX.setText("Puntuacion de X: "+puntosX);
            Toast.makeText(this, "Player X WIN", Toast.LENGTH_SHORT).show();

            Reiniciar();
        } else if (boton2.getText().toString().equals("X") && boton5.getText().toString().equals("X") && boton8.getText().toString().equals("X")) {
            puntosX ++;
            ptosX.setText("Puntuacion de X: "+puntosX);
            Toast.makeText(this, "Player X WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();
        } else if (boton3.getText().toString().equals("X") && boton6.getText().toString().equals("X") && boton9.getText().toString().equals("X")) {
            puntosX ++;
            ptosX.setText("Puntuacion de X: "+puntosX);
            Toast.makeText(this, "Player X WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();
        } else if (boton1.getText().toString().equals("O") && boton4.getText().toString().equals("O") && boton7.getText().toString().equals("O")) {
            puntosO ++;
            ptosO.setText("Puntuacion de O: "+puntosO);
            Toast.makeText(this, "Player O WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();
        } else if (boton2.getText().toString().equals("O") && boton5.getText().toString().equals("O") && boton8.getText().toString().equals("O")) {
            puntosO ++;
            ptosO.setText("Puntuacion de O: "+puntosO);
            Toast.makeText(this, "Player O WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();
        } else if (boton3.getText().toString().equals("O") && boton6.getText().toString().equals("O") && boton9.getText().toString().equals("O")) {
            puntosO ++;
            ptosO.setText("Puntuacion de O: "+puntosO);
            Toast.makeText(this, "Player O WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();
        }


        //GANADOR EN DIAGONAL
        else if (boton1.getText().toString().equals("X") && boton5.getText().toString().equals("X") && boton9.getText().toString().equals("X")) {
            puntosX ++;
            ptosX.setText("Puntuacion de X: "+puntosX);
            Toast.makeText(this, "Player X WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();
        } else if (boton3.getText().toString().equals("X") && boton5.getText().toString().equals("X") && boton7.getText().toString().equals("X")) {
            puntosX ++;
            ptosX.setText("Puntuacion de X: "+puntosX);
            Toast.makeText(this, "Player X WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();
        } else if (boton1.getText().toString().equals("O") && boton5.getText().toString().equals("O") && boton9.getText().toString().equals("O")) {
            puntosO ++;
            ptosO.setText("Puntuacion de O: "+puntosO);
            Toast.makeText(this, "Player O WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();
        } else if (boton3.getText().toString().equals("O") && boton5.getText().toString().equals("O") && boton7.getText().toString().equals("O")) {
            puntosO ++;
            ptosO.setText("Puntuacion de O: "+puntosO);
            Toast.makeText(this, "Player O WIN", Toast.LENGTH_SHORT).show();
            Reiniciar();
        } else if (!boton1.getText().toString().equals("")&!boton2.getText().toString().equals("")&!boton3.getText().toString().equals("")&
                !boton4.getText().toString().equals("")&!boton5.getText().toString().equals("")&!boton6.getText().toString().equals("")&
                !boton7.getText().toString().equals("")&!boton8.getText().toString().equals("")&!boton9.getText().toString().equals("")) {
            Toast.makeText(this, "Empate", Toast.LENGTH_SHORT).show();
            Reiniciar();
        }


    }
    public void Reiniciar(){
    boton1.setText("");
        boton2.setText("");
        boton3.setText("");
        boton4.setText("");
        boton5.setText("");
        boton6.setText("");
        boton7.setText("");
        boton8.setText("");
        boton9.setText("");

    }
}

