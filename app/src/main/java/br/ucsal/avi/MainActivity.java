package br.ucsal.avi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private FloatingActionButton botao;
    private RecyclerView lista;

    private ContatoAdapter adapter;
    public static List<ContatoModel> contatos = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         botao = findViewById(R.id.main_adicionar);
         lista =findViewById(R.id.recyclerView);
         inicializarContatos();
         adapter = new ContatoAdapter(contatos);
         lista.setAdapter(adapter);
         lista.setLayoutManager(new LinearLayoutManager(this));

         adapter.notifyDataSetChanged();

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
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


    private void inicializarContatos() {
        Random random =new Random();


        String[] nomes = {"Ana", "Bruno", "Carla", "David", "Eva", "Felipe"};
        String[] sobrenomes = {"Silva", "Costa", "Machado", "Pereira", "Santos", "Oliveira"};

        for (int i = 1; i <= 20; i++) {
            ContatoModel contato = new ContatoModel();
            String nome = nomes[random.nextInt(nomes.length)];
            String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
            String telefone = "9" + (random.nextInt(900000000) + 100000000);
            contato.setNome(nome+" "+sobrenome);
            contato.setTelefone(telefone);
            contatos.add(contato);
        }
    }

}