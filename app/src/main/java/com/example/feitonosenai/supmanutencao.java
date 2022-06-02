package com.example.feitonosenai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class supmanutencao extends AppCompatActivity {
    private Button abrir_pedido_material, clasificar, sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supmanutencao);
        abrir_pedido_material =  findViewById(R.id.btnAbriPedidoMaterial);
        clasificar =  findViewById(R.id.btnCasifica);
        sair =  findViewById(R.id.btnSair1);
        abrir_pedido_material.setOnClickListener(this::novoPedidoMaterial);
        clasificar.setOnClickListener(this::clasifica);
        sair.setOnClickListener(this::sai);
    }
    private void novoPedidoMaterial (View view) {
        Intent intencao = new Intent(this, CadastroActivity.class); // subistituir CadastroActivity pela activity da pagina de abrir pedido material
        startActivity(intencao);
    }
    private void clasifica (View view) {
        Intent intencao = new Intent(this, CadastroActivity.class); // subistituir CadastroActivity pela activity da pagina de clasificaçao
        startActivity(intencao);
    }
    private void sai (View view) {
        Intent intencao = new Intent(this, LoginActivity.class);
        startActivity(intencao);
    }
}
