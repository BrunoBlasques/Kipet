package com.kipet.kipet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class Login extends AppCompatActivity {

    private TextView usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void cadastrar(View v){
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }

}
