package com.example.kalpakgosalia.e_learningforkids;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KalpakGosalia on 12-04-2018.
 */

public class CustomAlphabet extends BaseAdapter {
    private String[] alphabeat_names;
    private Integer[] alphabeat_img;
    private Activity context;

    public CustomAlphabet(Activity context, String[] alphabeat_names, Integer[] alphabeat_img) {
        this.context = context;
        this.alphabeat_names = alphabeat_names;
        this.alphabeat_img = alphabeat_img;
    }

    @Override
    public int getCount() {
        return alphabeat_img.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return alphabeat_img[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View r = convertView;
        ViewHolder1 viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.alpabeatimage,null);
            viewHolder=new ViewHolder1(r);
            r.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder1)r.getTag();
        }
        viewHolder.img.setImageResource(alphabeat_img[position]);
        viewHolder.txt.setText(alphabeat_names[position]);
        return r;
    }
}
class ViewHolder1
{
    ImageView img;
    TextView txt;
    ViewHolder1(View v){
        txt = v.findViewById(R.id.textview);
        img =  v.findViewById(R.id.imageView);

    }
}






