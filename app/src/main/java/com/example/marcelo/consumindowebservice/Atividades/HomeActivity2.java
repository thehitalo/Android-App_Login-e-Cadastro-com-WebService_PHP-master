package com.example.marcelo.consumindowebservice.Atividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.marcelo.consumindowebservice.R;

public class HomeActivity2 extends AppCompatActivity {

    /* Declara as variaveis de referencias dos componentes */
    private TextView txtHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        /* Busca as referencias dos componentes que estão na view e as atribui nas variaveis declaradas */
        txtHome = (TextView) findViewById(R.id.txtHome);

        /* Recupera a intent */
        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");

        txtHome.setText("Seja bem vindo, " +nome);

        getSupportActionBar().setTitle("Home");
    }

    @Override
    public void onBackPressed() {
        this.finish();
    }
}
