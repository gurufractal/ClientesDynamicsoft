package com.dynamicsoft.clientesdynamicsoft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCliente;
    private RecyclerViewAdaptador adaptadorCliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCliente=(RecyclerView)findViewById(R.id.recyclerCliente);
        recyclerViewCliente.setLayoutManager(new LinearLayoutManager(this));
        adaptadorCliente=new RecyclerViewAdaptador(obtenerClientes());
        recyclerViewCliente.setAdapter(adaptadorCliente);
    }

    public List<ClienteModelo> obtenerClientes(){
        List<ClienteModelo> cliente=new ArrayList<>();
        cliente.add(new ClienteModelo("Almacenes Exitos", "ABC123", "Llamar",
                R.drawable.cliente01 ));
        cliente.add(new ClienteModelo("Farmacia La Primera", "CDE1290", "Actualizar",
                R.drawable.cliente02));
        cliente.add(new ClienteModelo("Tienda La Rosa", "AST673","En inventario",
                 R.drawable.cliente03));
        cliente.add(new ClienteModelo("Ferreteria ", "TAT093", "Visitar",
                R.drawable.cliente04));
        return  cliente;
    }
}