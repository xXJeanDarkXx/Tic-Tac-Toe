package com.example.reali.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button vsMaquina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vsMaquina =(Button) findViewById(R.id.maquinaBtn);
        vsMaquina.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.maquinaBtn:
                Intent activityMachine = new Intent(MainActivity.this, vsMachine.class);
                startActivity(activityMachine);
                break;
            case R.id.personaBtn:
                Intent activityPersona = new Intent(MainActivity.this, vsPersona.class);
                startActivity(activityPersona);
                break;
        }
    }
}
