package com.example.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text1, text2;
    TextView lblMensaje;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String caja1 = text1.getText().toString();
                lblMensaje.setText(caja1);
            }
        });


        boton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String caja2 = text2.getText().toString();
                lblMensaje.setText(caja2);
                return true;
            }
        });
    }

    private void inicializar() {

        text1 = (EditText) findViewById(R.id.Username);
        text2 = (EditText) findViewById(R.id.Password);
        lblMensaje = (TextView) findViewById(R.id.Respuesta);
        boton = (Button) findViewById(R.id.Boton_);

    }

}
