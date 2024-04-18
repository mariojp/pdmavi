package br.ucsal.avi;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContatoAdapter extends RecyclerView.Adapter<ContatoAdapter.ContatoView> {


    public List<ContatoModel> contatos;

    public ContatoAdapter(List<ContatoModel> contatos) {
        this.contatos = contatos;
    }

    @NonNull
    @Override
    public ContatoView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contato,parent,false);
        return new ContatoView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContatoView holder, int position) {
            ContatoModel cm = contatos.get(position);
            holder.setNome(cm.getNome());
            holder.setTelefone(cm.getTelefone());
    }

    @Override
    public int getItemCount() {
        return contatos.size();
    }

    class ContatoView extends RecyclerView.ViewHolder {

        private TextView nome;
        private TextView telefone;

        public ContatoView(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.item_nome);
            telefone = itemView.findViewById(R.id.item_telefone);
        }


        public void setNome(String nome) {
            this.nome.setText(nome);
        }

        public void setTelefone(String telefone) {
            this.telefone.setText(telefone);
        }
    }
}
