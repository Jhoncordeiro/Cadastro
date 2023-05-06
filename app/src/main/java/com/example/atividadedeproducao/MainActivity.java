package com.example.atividadedeproducao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton mas = (RadioButton) findViewById(R.id.mas);
        final RadioButton fem = (RadioButton) findViewById(R.id.fem);
        final RadioButton out = (RadioButton) findViewById(R.id.out);
        final RadioButton ensmi = (RadioButton) findViewById(R.id.ensmi);
        final RadioButton ensmc = (RadioButton) findViewById(R.id.ensmc);
        final RadioButton enssc = (RadioButton) findViewById(R.id.enssc);
        Button CONFIRMA = (Button) findViewById(R.id.button);



        CONFIRMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
      String confirma = "";
                if (mas.isChecked()) {
                    confirma = " CONCLUIDO";
                } else {
                    if (fem.isChecked()) {
                        confirma = " CONCLUIDO";
                    } else {
                        if (out.isChecked()) {
                            confirma = " CONCLUIDO";
                        } else {
                            if (ensmi.isChecked()) {
                                confirma = " CONCLUIDO";
                            } else {
                                if (ensmc.isChecked()) {
                                    confirma = " CONCLUIDO";
                                } else {
                                    if (enssc.isChecked()) {
                                        confirma = " CONCLUIDO";
                                    }
                                }
                            }
                        }
                    }
                }
                Toast.makeText(getApplicationContext(), "CADASTRO" + confirma, Toast.LENGTH_SHORT).show();
            }
        });
    }
}