package br.ucsal.avi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SegundaActivity extends AppCompatActivity {


    private Button voltar;
    private Button salvar;

    private EditText nome;
    private EditText telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Log.i("AVI","6" );
        voltar = findViewById(R.id.activity2_voltar);
        salvar = findViewById(R.id.activity2_salvar);
        nome = findViewById(R.id.activity2_campo_nome);
        telefone = findViewById(R.id.activity2_campo_telefone);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContatoModel model = new ContatoModel();
                model.setNome(nome.getText()+"");
                model.setTelefone(telefone.getText()+"");
                MainActivity.contatos.add(model);
                finish();
            }

        });
    }



    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}