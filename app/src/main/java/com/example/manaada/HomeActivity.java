package com.example.manaada;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.example.manaada.fragment.FourFragment;
import com.example.manaada.fragment.OneFragment;
import com.example.manaada.fragment.ThreeFragment;
import com.example.manaada.fragment.TwoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
    Fragment fragment1 = new OneFragment();
    Fragment fragment2 = new TwoFragment();
    Fragment fragment3 = new ThreeFragment();
    Fragment fragment4 = new FourFragment();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(navigationItemSelectedListener);
        bottomNavigationView.clearAnimation();
        fm.beginTransaction().add(R.id.fragment_container,fragment4,"4").hide(fragment4).commit();
        fm.beginTransaction().add(R.id.fragment_container, fragment3, "3").hide(fragment3).commit();
        fm.beginTransaction().add(R.id.fragment_container, fragment2, "2").hide(fragment2).commit();
        fm.beginTransaction().add(R.id.fragment_container,fragment1, "1").commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.nav_home:
                    fm.beginTransaction().hide(active).show(fragment1).commit();
                    active = fragment1;
                    return true;
                case R.id.nav_search:
                    fm.beginTransaction().hide(active).show(fragment2).commit();
                    active = fragment2;
                    return true;
                case R.id.nav_shop:
                    fm.beginTransaction().hide(active).show(fragment3).commit();
                    active = fragment3;
                    return true;
                case R.id.nav_plus:
                    startActivity(new Intent(HomeActivity.this, PostActivity.class));
                    return true;
                case R.id.nav_profile:
//                    SharedPreferences.Editor editor = getSharedPreferences("PREFS",MODE_PRIVATE).edit();
//                    editor.putString("profileid", FirebaseAuth.getInstance().getCurrentUser().getUid());
//                    editor.apply();
                    fm.beginTransaction().hide(active).show(fragment4).commit();
                    active = fragment4;
                    return true;

            }
            if (active != null){
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,active).commit();
            }
            return true;
        }
    };
}