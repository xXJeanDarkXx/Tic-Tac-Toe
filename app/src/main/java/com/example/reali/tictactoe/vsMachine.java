package com.example.reali.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class vsMachine extends AppCompatActivity implements View.OnClickListener {
private Button p1,p2,p3,p4,p5,p6,p7,p8,p9;
     private    int v1, v2, v3, v4, v5, v6, v7, v8, v9;
    private TextView ptosO, ptosX;
    int puntosO, puntosX;
    private   boolean done = false;
    private  boolean fin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_maquina);

        p1= (Button) findViewById(R.id.btn1);
        p2= (Button) findViewById(R.id.btn2);
        p3= (Button) findViewById(R.id.btn3);
        p4= (Button) findViewById(R.id.btn4);
        p5= (Button) findViewById(R.id.btn5);
        p6= (Button) findViewById(R.id.btn6);
        p7= (Button) findViewById(R.id.btn7);
        p8= (Button) findViewById(R.id.btn8);
        p9= (Button) findViewById(R.id.btn9);
        p1.setOnClickListener(this);

        ptosO = (TextView) findViewById(R.id.puntuacionO);
        ptosX = (TextView) findViewById(R.id.puntuacionX);

        ptosX.setText("Puntuacion de X: "+puntosX);
        ptosO.setText("Puntuacion de O: "+puntosO);
    }



    void reset() {
        v1 = 0;
        v2 = 0;
        v3 = 0;
        v4 = 0;
        v5 = 0;
        v6 = 0;
        v7 = 0;
        v8 = 0;
        v9 = 0;
        p1.setText("");
        p1.setEnabled(true);
        p2.setText("");
        p2.setEnabled(true);
        p3.setText("");
        p3.setEnabled(true);
        p4.setText("");
        p4.setEnabled(true);
        p5.setText("");
        p5.setEnabled(true);
        p6.setText("");
        p6.setEnabled(true);
        p7.setText("");
        p7.setEnabled(true);
        p8.setText("");
        p8.setEnabled(true);
        p9.setText("");
        p9.setEnabled(true);
        done=false;
        fin=false;
    }

    void felinoMarc(int player, int poss) {

        switch (player) {
            case 1:
                switch (poss) {

                    case 1:
                        v1 = 1;
                        p1.setText("X");
                        p1.setEnabled(false);
                        break;
                    case 2:
                        v2 = 1;
                        p2.setText("X");
                        p2.setEnabled(false);
                        break;
                    case 3:
                        v3 = 1;
                        p3.setText("X");
                        p3.setEnabled(false);
                        break;
                    case 4:
                        v4 = 1;
                        p4.setText("X");
                        p4.setEnabled(false);
                        break;
                    case 5:
                        v5 = 1;
                        p5.setText("X");
                        p5.setEnabled(false);
                        break;
                    case 6:
                        v6 = 1;
                        p6.setText("X");
                        p6.setEnabled(false);
                        break;
                    case 7:
                        v7 = 1;
                        p7.setText("X");
                        p7.setEnabled(false);
                        break;
                    case 8:
                        v8 = 1;
                        p8.setText("X");
                        p8.setEnabled(false);
                        break;
                    case 9:
                        v9 = 1;
                        p9.setText("X");
                        p9.setEnabled(false);
                        break;
                }
                break;


            case 2:
                switch (poss) {
                    case 1:
                        v1 = 2;
                        p1.setText("O");
                        p1.setEnabled(false);
                        break;
                    case 2:
                        v2 = 2;
                        p2.setText("O");
                        p2.setEnabled(false);
                        break;
                    case 3:
                        v3 = 2;
                        p3.setText("O");
                        p3.setEnabled(false);
                        break;
                    case 4:
                        v4 = 2;
                        p4.setText("O");
                        p4.setEnabled(false);
                        break;
                    case 5:
                        v5 = 2;
                        p5.setText("O");
                        p5.setEnabled(false);
                        break;
                    case 6:
                        v6 = 2;
                        p6.setText("O");
                        p6.setEnabled(false);
                        break;
                    case 7:
                        v7 = 2;
                        p7.setText("O");
                        p7.setEnabled(false);
                        break;
                    case 8:
                        v8 = 2;
                        p8.setText("O");
                        p8.setEnabled(false);
                        break;
                    case 9:
                        v9 = 2;
                        p9.setText("O");
                        p9.setEnabled(false);
                        break;

                }
                break;

        }
    }

    boolean winner(int player) {

        boolean gano = false;

        switch (player) {

            case 1:
                if (v1 == 1 && v2 == 1 && v3 == 1) {
                    puntosX ++;
                    ptosX.setText("Puntuacion de X: "+puntosX);
                    gano = true;
                }
                if (v4 == 1 && v5 == 1 && v6 == 1) {
                    puntosX ++;
                    ptosX.setText("Puntuacion de X: "+puntosX);
                    gano = true;
                }
                if (v7 == 1 && v8 == 1 && v9 == 1) {
                    puntosX ++;
                    ptosX.setText("Puntuacion de X: "+puntosX);
                    gano = true;

                }
                if (v1 == 1 && v4 == 1 && v7 == 1) {
                    puntosX ++;
                    ptosX.setText("Puntuacion de X: "+puntosX);
                    gano = true;

                }
                if (v2 == 1 && v5 == 1 && v8 == 1) {
                    puntosX ++;
                    ptosX.setText("Puntuacion de X: "+puntosX);
                    gano = true;
                }
                if (v3 == 1 && v6 == 1 && v9 == 1) {
                    puntosX ++;
                    ptosX.setText("Puntuacion de X: "+puntosX);
                    gano = true;
                }
                if (v1 == 1 && v5 == 1 && v9 == 1) {
                    puntosX ++;
                    ptosX.setText("Puntuacion de X: "+puntosX);
                    gano = true;
                }
                if (v3 == 1 && v5 == 1 && v7 == 1) {
                    puntosX ++;
                    ptosX.setText("Puntuacion de X: "+puntosX);
                    gano = true;
                }
                break;

            case 2:
                if (v1 == 2 && v2 == 2 && v3 == 2) {

                    puntosO ++;
                    ptosO.setText("Puntuacion de O: "+puntosO);
                    gano = true;
                }
                if (v4 == 2 && v5 == 2 && v6 == 2) {
                    puntosO ++;
                    ptosO.setText("Puntuacion de O: "+puntosO);

                    gano = true;
                }
                if (v7 == 2 && v8 == 2 && v9 == 2) {
                    puntosO ++;
                    ptosO.setText("Puntuacion de O: "+puntosO);

                    gano = true;
                }
                if (v1 == 2 && v4 == 2 && v7 == 2) {
                    puntosO ++;
                    ptosO.setText("Puntuacion de O: "+puntosO);

                    gano = true;
                }
                if (v2 == 2 && v5 == 2 && v8 == 2) {
                    puntosO ++;
                    ptosO.setText("Puntuacion de O: "+puntosO);

                    gano = true;
                }
                if (v3 == 2 && v6 == 2 && v9 == 2) {
                    puntosO ++;
                    ptosO.setText("Puntuacion de O: "+puntosO);

                    gano = true;
                }
                if (v1 == 2 && v5 == 2 && v9 == 2) {
                    puntosO ++;
                    ptosO.setText("Puntuacion de O: "+puntosO);

                    gano = true;
                }
                if (v3 == 2 && v5 == 2 && v7 == 2) {
                    puntosO ++;
                    ptosO.setText("Puntuacion de O: "+puntosO);

                    gano = true;
                }
                break;


        }
        return gano;
    }

    void bloqueo() {
        //primera fila horizontal
        if (v1 == 2 && v2 == 2 && v3 == 0 && !done) {
            felinoMarc(1, 3);
            done = true;

        }
        if (v1 == 2 && v2 == 0 && v3 == 2 && !done) {
            felinoMarc(1, 2);
            done = true;

        }
        if (v1 == 0 && v2 == 2 && v3 == 2 && !done) {
            felinoMarc(1, 1);
            done = true;
        }

        //segunda fila horizontal
        if (v4 == 2 && v5 == 2 && v6 == 0 && !done) {
            felinoMarc(1, 6);
            done = true;
        }
        if (v4 == 2 && v5 == 0 && v6 == 2 && !done) {
            felinoMarc(1, 5);
            done = true;
        }
        if (v4 == 0 && v5 == 2 && v6 == 2 && !done) {
            felinoMarc(1, 4);
            done = true;
        }
        //tercera fila horizontal
        if (v7 == 2 && v8 == 2 && v9 == 0 && !done) {
            felinoMarc(1, 9);
            done = true;
        }
        if (v7 == 2 && v8 == 0 && v9 == 2 && !done) {
            felinoMarc(1, 8);
            done = true;
        }
        if (v7 == 0 && v8 == 2 && v9 == 2 && !done) {
            felinoMarc(1, 7);
            done = true;
        }
        //primera vertical
        if (v1 == 2 && v4 == 2 && v7 == 0 && !done) {
            felinoMarc(1, 7);
            done = true;
        }
        if (v1 == 2 && v4 == 0 && v7 == 2 && !done) {
            felinoMarc(1, 4);
            done = true;
        }
        if (v1 == 0 && v4 == 2 && v7 == 2 && !done) {
            felinoMarc(1, 1);
            done = true;
        }
        //segunda vertical
        if (v2 == 2 && v5 == 2 && v8 == 0 && !done) {
            felinoMarc(1, 8);
            done = true;
        }
        if (v2 == 2 && v5 == 0 && v8 == 2 && !done) {
            felinoMarc(1, 5);
            done = true;
        }
        if (v2 == 0 && v5 == 2 && v8 == 2 && !done) {
            felinoMarc(1, 2);
            done = true;
        }
        //tercera vertical
        if (v3 == 2 && v6 == 2 && v9 == 0 && !done) {
            felinoMarc(1, 9);
            done = true;
        }
        if (v3 == 2 && v6 == 0 && v9 == 2 && !done) {
            felinoMarc(1, 6);
            done = true;
        }
        if (v3 == 0 && v6 == 2 && v9 == 2 && !done) {
            felinoMarc(1, 3);
            done = true;
        }
        //primera diagonal
        if (v1 == 2 && v5 == 2 && v9 == 0 && !done) {
            felinoMarc(1, 9);
            done = true;
        }
        if (v1 == 2 && v5 == 0 && v9 == 2 && !done) {
            felinoMarc(1, 5);
            done = true;
        }
        if (v1 == 0 && v5 == 2 && v9 == 2 && !done) {
            felinoMarc(1, 1);
            done = true;
        }
        //segunda diagonal
        if (v3 == 2 && v5 == 2 && v7 == 0 && !done) {
            felinoMarc(1, 7);
            done = true;
        }
        if (v3 == 2 && v5 == 0 && v7 == 2 && !done) {
            felinoMarc(1, 5);
            done = true;
        }
        if (v3 == 0 && v5 == 2 && v7 == 2 && !done) {
            felinoMarc(1, 3);
            done = true;

        }


    }

    //pegar la funcion de bloqueo y cambiarle los "2" por "1" en las condiciones
    void ganar() {
        //

        if (v1 == 1 && v2 == 1 && v3 == 0 && !done) {
            felinoMarc(1, 3);

            done = true;
        }
        if (v1 == 1 && v2 == 0 && v3 == 1 && !done) {
            felinoMarc(1, 2);
            done = true;

        }
        if (v1 == 0 && v2 == 1 && v3 == 1 && !done) {
            felinoMarc(1, 1);
            done = true;
        }

        //segunda fila horizontal
        if (v4 == 1 && v5 == 1 && v6 == 0 && !done) {
            felinoMarc(1, 6);
            done = true;
        }
        if (v4 == 1 && v5 == 0 && v6 == 1 && !done) {
            felinoMarc(1, 5);
            done = true;
        }
        if (v4 == 0 && v5 == 1 && v6 == 1 && !done) {
            felinoMarc(1, 4);
            done = true;
        }
        //tercera fila horizontal
        if (v7 == 1 && v8 == 1 && v9 == 0 && !done) {
            felinoMarc(1, 9);
            done = true;
        }
        if (v7 == 1 && v8 == 0 && v9 == 1 && !done) {
            felinoMarc(1, 8);
            done = true;
        }
        if (v7 == 0 && v8 == 1 && v9 == 1 && !done) {
            felinoMarc(1, 7);
            done = true;
        }
        //primera vertical
        if (v1 == 1 && v4 == 1 && v7 == 0 && !done) {
            felinoMarc(1, 7);
            done = true;
        }
        if (v1 == 1 && v4 == 0 && v7 == 1 && !done) {
            felinoMarc(1, 4);
            done = true;
        }
        if (v1 == 0 && v4 == 1 && v7 == 1 && !done) {
            felinoMarc(1, 1);
            done = true;
        }
        //segunda vertical
        if (v2 == 1 && v5 == 1 && v8 == 0 && !done) {
            felinoMarc(1, 8);
            done = true;
        }
        if (v2 == 1 && v5 == 0 && v8 == 1 && !done) {
            felinoMarc(1, 5);
            done = true;
        }
        if (v2 == 0 && v5 == 1 && v8 == 1 && !done) {
            felinoMarc(1, 2);
            done = true;
        }
        //tercera vertical
        if (v3 == 1 && v6 == 1 && v9 == 0 && !done) {
            felinoMarc(1, 9);
            done = true;
        }
        if (v3 == 1 && v6 == 0 && v9 == 1 && !done) {
            felinoMarc(1, 6);
            done = true;
        }
        if (v3 == 0 && v6 == 1 && v9 == 1 && !done) {
            felinoMarc(1, 3);

            done = true;
        }
        //primera diagonal
        if (v1 == 1 && v5 == 1 && v9 == 0 && !done) {
            felinoMarc(1, 9);
            done = true;
        }
        if (v1 == 1 && v5 == 0 && v9 == 1 && !done) {
            felinoMarc(1, 5);
            done = true;
        }
        if (v1 == 0 && v5 == 1 && v9 == 1 && !done) {
            felinoMarc(1, 1);
            done = true;
        }
        //segunda diagonal
        if (v3 == 1 && v5 == 1 && v7 == 0 && !done) {
            felinoMarc(1, 7);
            done = true;
        }
        if (v3 == 1 && v5 == 0 && v7 == 1 && !done) {
            felinoMarc(1, 5);
            done = true;
        }
        if (v3 == 0 && v5 == 1 && v7 == 1 && !done) {
            felinoMarc(1, 3);

            done = true;
        }


    }

    void centro() {

        if (v5 == 0 && !done) {
            felinoMarc(1, 5);
            done = true;
        }

    }

    void recorrer() {
        if (v1 == 0 && !done) {
            felinoMarc(1, 1);
            done = true;
        }
        if (v2 == 0 && !done) {
            felinoMarc(1, 2);
            done = true;
            System.out.println("2");
        }
        if (v3 == 0 && !done) {
            felinoMarc(1, 3);
            done = true;
            System.out.println("3");
        }
        if (v4 == 0 && !done) {
            felinoMarc(1, 4);
            done = true;
        }
        if (v5 == 0 && !done) {
            felinoMarc(1, 5);
            done = true;
        }
        if (v6 == 0 && !done) {
            felinoMarc(1, 6);
            done = true;
        }
        if (v7 == 0 && !done) {
            felinoMarc(1, 7);
            done = true;
        }
        if (v8 == 0 && !done) {
            felinoMarc(1, 8);
            done = true;
        }
        if (v9 == 0 && !done) {
            felinoMarc(1, 9);
            done = true;
        }

    }

    void allBloqueo(){
        if(v4==2&&v5==1&&v9==2&&v7==0&&!done){
            felinoMarc(1,7);
            done=true;
        }
        if(v1==2&&v5==1&&v9==2&&v8==0&& !done){
            felinoMarc(1,8);
            done=true;
        }
        if(v3==2&&v5==1&&v7==2&&v4==0&& !done){
            felinoMarc(1,4);
            done=true;
        }
        if(v3==2&&v5==1&&v8==2&&v6==0&&!done){
            felinoMarc(1,6);
            done=true;
        }
        if(v1==2&&v5==1&&v8==2&&v7==0&&!done){
            felinoMarc(1,7);
            done=true;
        }

    }

    void machine() {
        //se marca que no hay ningun tiro realizado por parte de la makina
        //done cambia a true cuando la makina tire
        done = false;
        fin = false;
        //se almacena en gano el valor que recibe winner
        boolean gano = winner(2);

        //comprueba si el jugador gano
        if (gano) {
            Toast.makeText(this, "Gano el Usuario", Toast.LENGTH_SHORT).show();
            reset();
            fin = true;
        }


        //esta funcion comprueba si puede ganar
        if (!done && !fin) {
            System.out.println("gaanar");
            ganar();
        }

        //intenta bloquear los tiros del ususario en caso de uqe se pueda

        if (!done && !fin) {
            bloqueo();
            System.out.println("bloqueo");
        }

        //tira en el centro en caso de que este vacio
        if (!done && !fin) {
            centro();
        }

        if(!done && !fin){
            allBloqueo();
        }

        //si no puedo hacer nada de lo anterior

        if (!done && !fin && v3 == 0) {
            felinoMarc(1, 3);
            done=true;
        }
        //funcion  de comprobacion de casillas vacias

        if (!done && !fin) {
            recorrer();
        }


//comprueba si yo(makina) gane
        if (done && !fin) {
            gano = winner(1);
            if (gano) {
                Toast.makeText(this, "Gano La Maquina", Toast.LENGTH_SHORT).show();

                reset();
                fin = true;
            }

        }

        if(v1!=0&&v2!=0&&v3!=0&&v4!=0&&v5!=0&&v6!=0&&v7!=0&&v8!=0&&v9!=0){
            Toast.makeText(this, "Empate", Toast.LENGTH_SHORT).show();

            reset();
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                felinoMarc(2, 1);
                machine();
                break;
            case R.id.btn2:
                felinoMarc(2, 2);
                machine();
                break;
            case R.id.btn3:
                felinoMarc(2, 3);
                machine();
                break;
            case R.id.btn4:
                felinoMarc(2, 4);
                machine();
                break;
            case R.id.btn5:
                felinoMarc(2, 5);
                machine();
                break;
            case R.id.btn6:
                felinoMarc(2, 6);
                machine();
                break;
            case R.id.btn7:
                felinoMarc(2, 7);
                machine();
                break;
            case R.id.btn8:
                felinoMarc(2, 8);
                machine();
                break;
            case R.id.btn9:
                felinoMarc(2, 9);
                machine();
                break;
        }
    }
}
