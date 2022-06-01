package com.example.feitonosenai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class CadastroActivity extends AppCompatActivity {
    private TextInputEditText matricula , cargo , email , senha , nome_completo;
    private Button voltar , enviar;
    private SharedPreferences preferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        matricula = (TextInputEditText) findViewById(R.id.txtMatricula);
        cargo = (TextInputEditText) findViewById(R.id.txtCargo);
        email = (TextInputEditText) findViewById(R.id.txtEmail);
        senha = (TextInputEditText) findViewById(R.id.txtSenha);
        nome_completo = (TextInputEditText) findViewById(R.id.txtNomeCompleto);
        voltar = (Button) findViewById(R.id.btnVoltar);
        enviar = (Button) findViewById(R.id.btnEnviar);
        preferencias = getSharedPreferences( getString(R.string.cadastro) , Context.MODE_PRIVATE);
        enviar.setOnClickListener(this::Cadastro);
        voltar.setOnClickListener(this::Voltar);
    }
    public void Cadastro (View view) {
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("username", matricula.getText().toString());
        editor.putString("username", cargo.getText().toString());
        editor.putString("username", email.getText().toString());
        editor.putString("username", senha.getText().toString());
        editor.putString("username", nome_completo.getText().toString());
        editor.apply();

    }
    private void Voltar (View view) {
        Intent intencao = new Intent(this, LoginActivity.class);
        startActivity(intencao);
    }
}