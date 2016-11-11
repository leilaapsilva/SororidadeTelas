package leilaapsilva.sororidadetelas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    Button btnEntrar, btnSalas, btnPerfil, btnVoltarPerfil, btnVoltarSalas, btnSair; //btnConfiguracoes, btnSobre, btnMensagens, btnCadastrar, btnAtualizarInfo, todos os btns salas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarTelaLogin();
    }


    public void CarregarTelaLogin() {
        setContentView(R.layout.activity_login);
        ImageButton btnEntrar = (ImageButton) findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaInicio();
            }
        });
    }

    public void CarregarTelaInicio() {
        setContentView(R.layout.activity_inicio);
        /*btnMensagens = (Button) findViewById(R.id.btnMensagens);
        btnMensagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaMensagens();
            }
        });*/

        btnSalas = (Button) findViewById(R.id.btnSalas);
        btnSalas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaSalas();
            }
        });

        Button btnPerfil = (Button) findViewById(R.id.btnPerfil);
        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaPerfil();
            }
        });

        Button btnSair = (Button) findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaLogin();
            }
        });
    }



    /*public void CarregarTelaMensagens(){
        setContentView(R.layout.activity_conversas); //É necessário uma tela antes da activity_conversas, onde apareça todas as conversas
    }*/

    public void CarregarTelaSalas(){
        setContentView(R.layout.activity_main);
        Button btnVoltarSalas = (Button) findViewById(R.id.btnVoltarSalas);
        btnVoltarSalas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaInicio();
            }
        });
    }

    public void CarregarTelaPerfil(){
        setContentView(R.layout.activity_perfil);
        Button btnVoltarPerfil = (Button) findViewById(R.id.btnVoltarPerfil);
        btnVoltarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaInicio();
            }
        });
    }






}
