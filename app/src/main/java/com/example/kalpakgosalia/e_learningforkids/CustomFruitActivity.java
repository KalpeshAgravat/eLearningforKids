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

public class CustomFruitActivity extends BaseAdapter {

    private Activity context;
    private  String[] fruit_name;
    private Integer[] fruit_iamge;

    public CustomFruitActivity(Activity context, String[] fruit_name, Integer[] fruit_iamge) {
        this.context = context;
        this.fruit_name = fruit_name;
        this.fruit_iamge = fruit_iamge;
    }



    @Override
    public int getCount() {
        return fruit_iamge.length ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return fruit_iamge[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View r = convertView;
        ViewHolder5 viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.activity_custom_fruit_iamge,null);
            viewHolder=new ViewHolder5(r);
            r.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder5)r.getTag();
        }
        viewHolder.img.setImageResource(fruit_iamge[position]);
        viewHolder.txt.setText(fruit_name[position]);
        return r;
    }
}
class ViewHolder5
{
    ImageView img;
    TextView txt;
    ViewHolder5(View v){
        txt = v.findViewById(R.id.textview);
        img =  v.findViewById(R.id.imageView);

    }
}