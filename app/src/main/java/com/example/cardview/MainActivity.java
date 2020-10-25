package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> list = new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addData();
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.idrecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,list,list.size());
        recyclerView.setAdapter(adapter);

    }

    private void addData(){
        list.add(new Model(R.drawable.cris, "Cristiano Ronaldo", "dos Santos Aveiro", R.string.descCristiano));
        list.add(new Model(R.drawable.messi, "Lionel Andrés", "Messi Cuccittini",  R.string.desmessi));
        list.add(new Model(R.drawable.paolo, "José Paolo", "Guerrero Gonzales",  R.string.despaolo));
        list.add(new Model(R.drawable.ibra, "Zlatan", "Ibrahimović",  R.string.desibrahimovic));
        list.add(new Model(R.drawable.cris, "Cristiano Ronaldo", "dos Santos Aveiro", R.string.descCristiano));
        list.add(new Model(R.drawable.messi, "Lionel Andrés", "Messi Cuccittini",  R.string.desmessi));
        list.add(new Model(R.drawable.paolo, "José Paolo", "Guerrero Gonzales",  R.string.despaolo));
        list.add(new Model(R.drawable.ibra, "Zlatan", "Ibrahimović",  R.string.desibrahimovic));
        list.add(new Model(R.drawable.mbappe, "Kylian", "Mbappé Lottin",  R.string.descripcion));
        list.add(new Model(R.drawable.mbappe, "Kylian", "Mbappé Lottin",  R.string.descripcion));
    }
}