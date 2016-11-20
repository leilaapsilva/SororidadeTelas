package leilaapsilva.sororidadetelas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    Button btnEntrar, btnSalas, btnPerfil, btnVoltarPerfil, btnVoltarSalas, btnSair, btnCadastrar, btnConcluirCadastro; //btnConfiguracoes, btnSobre, btnMensagens, btnAtualizarInfo, todos os btns salas

    //EmailPasswordActivity emailPassword = new EmailPasswordActivity();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarTelaLogin();
    }


    public void CarregarTelaLogin() {
        setContentView(R.layout.activity_login);
        Button btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaInicio();
            }
        });

        Button btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaCadastro();
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
        //a

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


    public void CarregarTelaCadastro(){
        setContentView(R.layout.activity_cadastro);
        Button btnVoltarCadastro = (Button) findViewById(R.id.btnVoltarCadastro);
        btnVoltarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaLogin();
            }
        });

        Button btnConcluirCadastro = (Button) findViewById(R.id.btnConcluirCadastro);
        btnConcluirCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent());










            }
        });
    }


}
