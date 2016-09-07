package com.kipet.kipet;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    private Toolbar toolbar;
    private Toolbar toolbarButton;
    private EditText nome;
    private EditText email;
    private EditText senha;
    private EditText confirmaSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Voltar");
        toolbar.setNavigationIcon(R.drawable.arrow_left);
        setSupportActionBar(toolbar);

        if(toolbar != null){
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        nome = (EditText) findViewById(R.id.editTextNome);
        email = (EditText) findViewById(R.id.editTextEmail);
        senha = (EditText) findViewById(R.id.editTextSenhaRegistro);
        confirmaSenha = (EditText) findViewById(R.id.editTextRepeteSenha);


    }

}
