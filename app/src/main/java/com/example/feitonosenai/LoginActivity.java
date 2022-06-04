package com.example.feitonosenai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    private TextInputEditText email , senha;
    private Button login, cadastre_se;
    private TextView cadastro;
    private SharedPreferences preferencias;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (TextInputEditText) findViewById(R.id.txtEmail);
        senha = (TextInputEditText) findViewById(R.id.txtSenha);
        login = (Button) findViewById(R.id.btnLogin);
        cadastre_se = (Button) findViewById(R.id.btnCadastre_se);
        login.setOnClickListener(this::Login);
        cadastre_se.setOnClickListener(this::Cadastro);
        preferencias = getSharedPreferences( getString(R.string.login) , Context.MODE_PRIVATE);

    }
    public void Login (View view) {
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("username", email.getText().toString());
        editor.putString("username", senha.getText().toString());
        editor.apply();

        Intent intencao = new Intent(this, LoginActivity.class);
        startActivity(intencao);
    }

    private void Cadastro(View view) {
        Intent intencao = new Intent(this, CadastroActivity.class);
        startActivity(intencao);
    }
}