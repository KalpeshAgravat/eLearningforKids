package com.example.kalpakgosalia.e_learningforkids;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class CustomBrid2Activity extends BaseAdapter {
    private String[] bird_name;
    private Integer[] bird_image;
    private Activity context;

    public CustomBrid2Activity(Activity context, String[] bird_name, Integer[] bird_image) {
        this.context = context;
        this.bird_name = bird_name;
        this.bird_image = bird_image;

    }

    @Override
    public int getCount() {
        return bird_image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return bird_image[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View r = convertView;
        ViewHolder6 viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.activity_custom_brid2_image,null);
            viewHolder=new ViewHolder6(r);
            r.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder6)r.getTag();
        }
        viewHolder.img.setImageResource(bird_image[position]);
        viewHolder.txt.setText(bird_name[position]);
        return r;
    }
}
class ViewHolder6
{
    ImageView img;
    TextView txt;
    ViewHolder6(View v){
        txt = v.findViewById(R.id.textview);
        img =  v.findViewById(R.id.imageView);

    }
}

