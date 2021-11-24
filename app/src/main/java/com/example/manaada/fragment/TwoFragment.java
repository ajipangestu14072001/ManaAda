package com.example.manaada.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.manaada.R;
import com.example.manaada.adapter.MerchandiseAdapter;
import com.example.manaada.model.Merchandise;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class TwoFragment extends Fragment {
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container,false);
        recyclerView= view.findViewById(R.id.main_ccontainer);
        recyclerView.setHasFixedSize(true);
        List<Merchandise> mList = new ArrayList<>();
        mList.add(new Merchandise(R.drawable.img2));
        mList.add(new Merchandise(R.drawable.img1));
        mList.add(new Merchandise(R.drawable.img3));
        mList.add(new Merchandise(R.drawable.img5));
        mList.add(new Merchandise(R.drawable.img7));
        mList.add(new Merchandise(R.drawable.img6));
        mList.add(new Merchandise(R.drawable.img4));
        mList.add(new Merchandise(R.drawable.img8));
        mList.add(new Merchandise(R.drawable.img9));
        mList.add(new Merchandise(R.drawable.image10));
        mList.add(new Merchandise(R.drawable.image9));
        mList.add(new Merchandise(R.drawable.img11));
        mList.add(new Merchandise(R.drawable.img12));
        mList.add(new Merchandise(R.drawable.img13));
        mList.add(new Merchandise(R.drawable.img15));
        mList.add(new Merchandise(R.drawable.img14));
        mList.add(new Merchandise(R.drawable.img16));


        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        MerchandiseAdapter merchandiseAdapter = new MerchandiseAdapter(mList);
        recyclerView.setAdapter(merchandiseAdapter);
        return view;
    }
}