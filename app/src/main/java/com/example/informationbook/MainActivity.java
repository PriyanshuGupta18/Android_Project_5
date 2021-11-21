package com.example.informationbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arrayList;
    private AdapterClass adapterClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList=new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        ModelClass modelClass=new ModelClass("physics","Physics");
        ModelClass modelClass1=new ModelClass("chem2","Chemistry");
        ModelClass modelClass2=new ModelClass("math","Mathematics");
        ModelClass modelClass3=new ModelClass("bio","Biology");
        arrayList.add(modelClass);
        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        adapterClass=new AdapterClass(arrayList,this);
        recyclerView.setAdapter(adapterClass);

    }
}