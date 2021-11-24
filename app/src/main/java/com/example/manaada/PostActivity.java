package com.example.manaada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.manaada.adapter.MerchandiseAdapter;
import com.example.manaada.model.Merchandise;

import java.util.ArrayList;
import java.util.List;

public class PostActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
//        recyclerView= findViewById(R.id.main_ccontainer);
//        recyclerView.setHasFixedSize(true);
//        List<Merchandise> mList = new ArrayList<>();
//        mList.add(new Merchandise(R.drawable.img1));
//        mList.add(new Merchandise(R.drawable.img2));
//        mList.add(new Merchandise(R.drawable.img3));
//        mList.add(new Merchandise(R.drawable.img4));
//        mList.add(new Merchandise(R.drawable.img5));
//        mList.add(new Merchandise(R.drawable.img6));
//
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
//        MerchandiseAdapter merchandiseAdapter = new MerchandiseAdapter(mList);
//        recyclerView.setAdapter(merchandiseAdapter);
    }
}