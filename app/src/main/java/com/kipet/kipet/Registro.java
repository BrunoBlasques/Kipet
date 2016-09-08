package com.kipet.kipet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    private UsuarioDAO usuario;
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

        UsuarioDAO usuario = new UsuarioDAO();
        nome = (EditText) findViewById(R.id.editTextNome);
        email = (EditText) findViewById(R.id.editTextEmail);
        senha = (EditText) findViewById(R.id.editTextSenhaRegistro);
        confirmaSenha = (EditText) findViewById(R.id.editTextRepeteSenha);
    }

    public void inserir(View view){
        this.usuario.setNome(this.nome.getText().toString());
        this.usuario.setEmail(this.email.getText().toString());
        this.usuario.setSenha(this.senha.getText().toString());
        this.usuario.inserir();
        finish();
    }

}
