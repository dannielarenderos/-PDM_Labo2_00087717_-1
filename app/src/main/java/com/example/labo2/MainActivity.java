package com.example.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText CajaReceptor;

    private EditText CajaReceptor2;
    private TextView CajaMuestra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CajaReceptor = findViewById(R.id.Username);
        CajaReceptor2=findViewById(R.id.Password);
        Button BotonReceptor = findViewById(R.id.Button);

        BotonReceptor.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                CajaMuestra.setText(CajaReceptor.getText().toString());
            }
        });




    }

}