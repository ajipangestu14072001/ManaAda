package com.example.manaada.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.manaada.R;
import com.example.manaada.model.Shop;

import java.util.List;

public class ShopAdapter extends PagerAdapter {
    private Context context;
    private List<Shop> listShop;

    public ShopAdapter(Context context, List<Shop> listShop) {
        this.context = context;
        this.listShop = listShop;
    }

    @Override
    public int getCount() {
        return listShop.size();
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
       View view = LayoutInflater.from(context).inflate(R.layout.item_shop,container,false);
        ImageView imageView = view.findViewById(R.id.iv_image);
        ImageView imageView1 = view.findViewById(R.id.decoration);
        TextView title = view.findViewById(R.id.title);
        TextView subTitle = view.findViewById(R.id.subTitle);
        TextView desc = view.findViewById(R.id.description);
        RelativeLayout relativeLayout = view.findViewById(R.id.relative_back);

        imageView.setImageResource(listShop.get(position).getImage());
        imageView1.setImageResource(listShop.get(position).getImage());
        relativeLayout.setBackgroundResource(listShop.get(position).getBackground());
        title.setText(listShop.get(position).getTitle());
        subTitle.setText(listShop.get(position).getSubTitle());
        desc.setText(listShop.get(position).getDescription());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,""+listShop, Toast.LENGTH_SHORT).show();
            }
        });
        container.addView(view);
        return view;

    }

}
