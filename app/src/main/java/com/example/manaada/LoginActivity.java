package com.example.manaada;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.manaada.fragment.FragmentA;
import com.example.manaada.fragment.FragmentB;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {
//private EditText email, password;
//private  Button login;
//private TextView sigup;
//private  ProgressDialog progressDialog;
//private  FirebaseAuth firebaseAuth;
//ViewPager viewPager;
//TabLayout tabLayout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        viewPager = findViewById(R.id.view_pager);
//        setupViewPager(viewPager);
//        tabLayout = findViewById(R.id.tablayout);
//        tabLayout.setupWithViewPager(viewPager);
        button = findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                finish();
            }
        });



//        email=findViewById(R.id.user);
//        password=findViewById(R.id.password);
//        login= findViewById(R.id.btnlogin);
//        sigup = findViewById(R.id.gotosignup);
//        firebaseAuth = FirebaseAuth.getInstance();
//
//
//        sigup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
//            }
//        });
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                progressDialog = new ProgressDialog(LoginActivity.this);
//                progressDialog.setMessage("Tunggu :)");
//                progressDialog.show();
//
//                String mail = email.getText().toString().trim();
//                String pwd = password.getText().toString().trim();
//
//                if (TextUtils.isEmpty(mail)||TextUtils.isEmpty(pwd)){
//                    Toast.makeText(getApplicationContext(),"Tidak Bolleh Kosong",Toast.LENGTH_SHORT).show();
//                }else {
//                    firebaseAuth.createUserWithEmailAndPassword(mail,pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if (task.isSuccessful()){
//                                DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(firebaseAuth.getCurrentUser().getUid());
//                                databaseReference.addValueEventListener(new ValueEventListener() {
//                                    @Override
//                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
//                                        progressDialog.dismiss();
//                                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
//                                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                                        startActivity(intent);
//                                        finish();
//                                    }
//
//                                    @Override
//                                    public void onCancelled(@NonNull DatabaseError error) {
//                                        progressDialog.dismiss();
//
//                                    }
//                                });
//                            }else {
//                                progressDialog.dismiss();
//                                Toast.makeText(LoginActivity.this, "Fehler"+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                            }
//
//                        }
//                    });
//                }
//            }
//        });
//    }
//    private void setupViewPager(ViewPager viewPager) {
//        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
//        adapter.addFragment(FragmentA.newInstance(), "Phone");
//        adapter.addFragment(FragmentB.newInstance(), "Email");
//        viewPager.setAdapter(adapter);
//    }
//    private class SectionPagerAdapter extends FragmentStatePagerAdapter {
//
//        private final List<Fragment> mFragmentList = new ArrayList<>();
//        private final List<String> mFragmentTitleList = new ArrayList<>();
//
//        SectionPagerAdapter(FragmentManager manager) {
//            super(manager);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            switch (position) {
//                case 0:
//                    return new FragmentA();
//                case 1:
//                    return new FragmentB();
//            }
//            //return mFragmentList.get(position);
//            return null;
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        void addFragment(Fragment fragment, String title) {
//            mFragmentList.add(fragment);
//            mFragmentTitleList.add(title);
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mFragmentTitleList.get(position);
//        }
    }
}