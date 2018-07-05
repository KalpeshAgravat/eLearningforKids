package com.example.kalpakgosalia.e_learningforkids;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KalpakGosalia on 12-04-2018.
 */

public class CustomNumberAdapter extends BaseAdapter {
    private Activity context;
    private  String[] numbers_name;
    private Integer[] numbers_image;

    public CustomNumberAdapter(Activity context, String[] numbers_name, Integer[] numbers_image) {
        this.context = context;
        this.numbers_name = numbers_name;
        this.numbers_image = numbers_image;
    }

    @Override
    public int getCount() {
        return numbers_image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return numbers_image[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.numberimage,null);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder)r.getTag();
        }
        viewHolder.img.setImageResource(numbers_image[position]);
        viewHolder.txt.setText(numbers_name[position]);
        return r;
    }
    }
    class ViewHolder
    {
        ImageView img;
        TextView txt;
        ViewHolder(View v){
            txt = v.findViewById(R.id.textview);
            img =  v.findViewById(R.id.imageView);

        }
    }

