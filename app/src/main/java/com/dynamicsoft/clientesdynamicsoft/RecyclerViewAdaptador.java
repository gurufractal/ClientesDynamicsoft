package com.dynamicsoft.clientesdynamicsoft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public  static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView cliente, codigo, estatus;
        ImageView fachadaCliente, geoCliente;

        public ViewHolder( View itemView) {
            super(itemView);
            cliente = (TextView)itemView.findViewById(R.id.tvCliente);
            codigo = (TextView)itemView.findViewById(R.id.tvCodigo);
            estatus = (TextView)itemView.findViewById(R.id.tvEstatus);
            fachadaCliente = (ImageView) itemView.findViewById(R.id.imgCliente);

        }
    }
    public List<ClienteModelo> clienteLista;

    public RecyclerViewAdaptador(List<ClienteModelo> clienteLista) {
        this.clienteLista = clienteLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cliente, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cliente.setText(clienteLista.get(position).getCliente());
        holder.codigo.setText(clienteLista.get(position).getCodigo());
        holder.estatus.setText(clienteLista.get(position).getEstatus());
        holder.fachadaCliente.setImageResource(clienteLista.get(position).getFachadaCliente());

    }

    @Override
    public int getItemCount() {
        return clienteLista.size();
    }
}
