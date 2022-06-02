package com.example.feitonosenai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Solicitante extends AppCompatActivity {
    private Button abrir_pedido, acompanhar, sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitante);
        abrir_pedido =  findViewById(R.id.btnAbriPedido);
        acompanhar =  findViewById(R.id.btnAcompanhar);
        sair = findViewById(R.id.btnSair);
        abrir_pedido.setOnClickListener(this::novoPedido);
        acompanhar.setOnClickListener(this::acompanha);
        sair.setOnClickListener(this::sai);
    }
    private void novoPedido (View view) {
        Intent intencao = new Intent(this, AbrirPedidos.class); // subistituir CadastroActivity pela activity da pagina de novos pedidos
        startActivity(intencao);
    }
    private void acompanha (View view) {
        Intent intencao = new Intent(this, CadastroActivity.class); // subistituir CadastroActivity pela activity da pagina de acompanhamento
        startActivity(intencao);
    }
    private void sai (View view) {
        Intent intencao = new Intent(this, LoginActivity.class);
        startActivity(intencao);
    }
}