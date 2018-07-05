package com.example.kalpakgosalia.e_learningforkids;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomColorActivity extends BaseAdapter {

    private Activity context;
    private String[] color_name;
    private Integer[] color_image;

    public CustomColorActivity(ColorsActivity context, String[] color_name, Integer[] color_image) {
        this.context=context;
        this.color_name=color_name;
        this.color_image=color_image;
    }

    @Override
    public int getCount() {
        return color_image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return color_image[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View r = convertView;
        ViewHolder3 viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.activity_custom_color_image,null);
            viewHolder=new ViewHolder3(r);
            r.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder3)r.getTag();
        }
        viewHolder.img.setImageResource(color_image[position]);
        viewHolder.txt.setText(color_name[position]);
        return r;
    }
}
class ViewHolder3
{
    ImageView img;
    TextView txt;
    ViewHolder3(View v){
        txt = v.findViewById(R.id.textview);
        img =  v.findViewById(R.id.imageView);

    }
}
