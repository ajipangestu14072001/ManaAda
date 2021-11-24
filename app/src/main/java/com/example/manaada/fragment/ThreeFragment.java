package com.example.manaada.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.manaada.R;
import com.example.manaada.adapter.MerchandiseAdapter;
import com.example.manaada.adapter.ShopAdapter;
import com.example.manaada.model.Image;
import com.example.manaada.model.Merchandise;
import com.example.manaada.model.Shop;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class ThreeFragment extends Fragment {
    ImageView imageViewlogo;
    Animation animationLogo, animationTransition;
    RelativeLayout relativeLayoutMain;
    HorizontalInfiniteCycleViewPager viewPager;
    List<Shop> listShop = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three,container,false);

        imageViewlogo = view.findViewById(R.id.logo);
        viewPager = view.findViewById(R.id.viewpager);
        relativeLayoutMain = view.findViewById(R.id.relative_main);
        animationLogo = AnimationUtils.loadAnimation(view.getContext(),R.anim.move);
        animationTransition = AnimationUtils.loadAnimation(view.getContext(),R.anim.transition);
        initData();
        ShopAdapter shopAdapter = new ShopAdapter(view.getContext(), listShop);
        viewPager.setAdapter(shopAdapter);
        imageViewlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewlogo.setVisibility(View.VISIBLE);
                imageViewlogo.startAnimation(animationLogo);

                viewPager.setVisibility(View.VISIBLE);
                viewPager.startAnimation(animationTransition);
            }
        });
        return view;
    }
    private void initData(){
    listShop.add(new Shop("Content","Content","Now, when you write code and type lore (which represents the name attribute value of the template tag above), and hit CTRL + SPACE , then it will automatically insert the lorem",R.drawable.cup_capucino,R.drawable.back_cappu,R.drawable.coffee, Color.parseColor("#2d181c")));
    listShop.add(new Shop("Content","Content","Now, when you write code and type lore (which represents the name attribute value of the template tag above), and hit CTRL + SPACE , then it will automatically insert the lorem",R.drawable.cup_greentea,R.drawable.back_green,R.drawable.tea, Color.parseColor("#2d181c")));
    listShop.add(new Shop("Content","Content","Now, when you write code and type lore (which represents the name attribute value of the template tag above), and hit CTRL + SPACE , then it will automatically insert the lorem",R.drawable.cup_mocha,R.drawable.back_mocha,R.drawable.choco, Color.parseColor("#2d181c")));
    }
}