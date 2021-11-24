package com.example.manaada;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.manaada.adapter.ImageAdapter;
import com.example.manaada.model.Image;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private Button login, regis;
private FirebaseUser firebaseUser;
//private ViewPager2 viewPager2;
//private List<Image> imageList;
//private ImageAdapter imageAdapter;
//private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.tologin);
        regis = findViewById(R.id.toregis);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
                finish();
            }
        });
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                finish();
            }
        });
//        viewPager2 = findViewById(R.id.viewpager2);
//        imageList = new ArrayList<>();
//
//        imageList.add(new Image(R.drawable.banner1));
//        imageList.add(new Image(R.drawable.banner2));
//        imageList.add(new Image(R.drawable.banner3));
//        imageList.add(new Image(R.drawable.banner4));
//
//        imageAdapter = new ImageAdapter(imageList, viewPager2);
//        viewPager2.setAdapter(imageAdapter);
//
//        viewPager2.setOffscreenPageLimit(3);
//        viewPager2.setClipChildren(false);
//        viewPager2.setClipToPadding(false);
//        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
//        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
//        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
//        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
//            @Override
//            public void transformPage(@NonNull View page, float position) {
//                float r = 1 - Math.abs(position);
//                page.setScaleX(0.85f + r * 0.14f);
//
//            }
//        });
//        viewPager2.setPageTransformer(compositePageTransformer);
//        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageSelected(int position) {
//                super.onPageSelected(position);
//                handler.removeCallbacks(runnable);
//                handler.postDelayed(runnable,2000);
//            }
//        });
//        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
//
//        if(firebaseUser != null){
//            startActivity(new Intent(MainActivity.this, HomeActivity.class));
//        }
//
//        regis.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
//            }
//        });
//
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, LoginActivity.class));
//            }
//        });

    }
//    private Runnable runnable = new Runnable() {
//        @Override
//        public void run() {
//            viewPager2.setCurrentItem(viewPager2.getCurrentItem()+1);
//        }
//    };
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        handler.removeCallbacks(runnable);
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        handler.postDelayed(runnable,2000);
//    }
}