package com.example.ojboba.animationdemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Torab on 20-May-16.
 */
public class customSwip extends PagerAdapter {
    private int [] imageResources ={R.drawable.capture1,R.drawable.capture2,R.drawable.capture3,R.drawable.capture4,R.drawable.capture5};
    private String[] imageText = {"one", "two", "three", "four", "five"};
    private String[] imageDifferent = {"61236", "612361", "612361", "612361", "612361"};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public customSwip(Context c) {
        ctx=c;
    }

    @Override
    public int getCount() {
        return imageResources.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=layoutInflater.inflate(R.layout.activity_custom_swip,container,false);
        ImageView imageView=(ImageView) itemView.findViewById(R.id.swip_image_view);
        TextView textHmong=(TextView) itemView.findViewById(R.id.different);
        TextView textEnglish=(TextView) itemView.findViewById(R.id.english);
        imageView.setImageResource(imageResources[position]);
        final String dummytext = imageText[position];
        textHmong.setText(imageDifferent[position]);
        textEnglish.setText(imageText[position]);
        container.addView(itemView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "" + dummytext, Toast.LENGTH_SHORT).show();
            }
        });
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return  (view==object);
    }
}
