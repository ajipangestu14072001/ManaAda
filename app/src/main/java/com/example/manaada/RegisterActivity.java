package com.example.manaada;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegisterActivity extends AppCompatActivity {
//    private Button btnregis;
//    private EditText editTextnama, editTextemail, editTextpassword, editTextuser;
//    private TextView textView;
//    private FirebaseAuth firebaseAuth;
//    private DatabaseReference databaseReference;
//    private ProgressDialog progressDialog;
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        viewPager = findViewById(R.id.view_pager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
//        btnregis = findViewById(R.id.btnregis);
//        editTextnama = findViewById(R.id.nametxt);
//        editTextemail = findViewById(R.id.emailtxt);
//        editTextpassword = findViewById(R.id.passwordtxt);
//        editTextuser = findViewById(R.id.txtuser);
//        textView = findViewById(R.id.gotologin);
//        firebaseAuth = FirebaseAuth.getInstance();


//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
//            }
//        });
//        btnregis.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                progressDialog = new ProgressDialog(RegisterActivity.this);
//                progressDialog.setMessage("Tunggu :)");
//                progressDialog.show();
//
//                String username = editTextnama.getText().toString();
//                String fullname = editTextuser.getText().toString();
//                String email = editTextemail.getText().toString();
//                String password = editTextpassword.getText().toString();
//
//                if (TextUtils.isEmpty(username)|| TextUtils.isEmpty(fullname)|| TextUtils.isEmpty(email)||TextUtils.isEmpty(password)){
//                    Toast.makeText(getApplicationContext(),"Semua Harus Terrisi",Toast.LENGTH_SHORT).show();
//                }else if (password.length() < 6){
//                    Toast.makeText(getApplicationContext(),"Passwor Terlalu Pendek", Toast.LENGTH_SHORT).show();
//                }else{
//                    Registration(username,fullname,email,password);
//
//                }
//            }
//        });
//    }
//    private  void Registration(String username1, String fullname1, String email1, String password1){
//        firebaseAuth.createUserWithEmailAndPassword(email1, password1).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful()){
//                    FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
//                    String userid = firebaseUser.getUid();
//                    databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(userid);
//                    HashMap<String, Object> hashMap = new HashMap<>();
//                    hashMap.put("id",userid);
//                    hashMap.put("username",username1);
//                    hashMap.put("fullname",fullname1);
//                    hashMap.put("bio","");
//                    hashMap.put("imageurl","https://firebasestorage.googleapis.com/v0/b/jdgapps-b3972.appspot.com/o/person.png?alt=media&token=b88b88f6-bc19-4bfe-98f4-0d4fa5e8c757");
//
//                    databaseReference.setValue(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
//                        @Override
//                        public void onComplete(@NonNull Task<Void> task) {
//                         if (task.isSuccessful()){
//                             progressDialog.dismiss();
//                             Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
//                             startActivity(intent);
//
//                         }
//                        }
//                    });
//                }else{
//                    progressDialog.dismiss();
//                    Toast.makeText(getApplicationContext(),"Registrasi Gagal",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }
    private void setupViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(FragmentA.newInstance(), "Phone");
        adapter.addFragment(FragmentB.newInstance(), "Email");
        viewPager.setAdapter(adapter);
    }
    private class SectionPagerAdapter extends FragmentStatePagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        SectionPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new FragmentA();
                case 1:
                    return new FragmentB();
            }
            //return mFragmentList.get(position);
            return null;
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}