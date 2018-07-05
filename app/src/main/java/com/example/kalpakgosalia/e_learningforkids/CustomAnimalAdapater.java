package com.example.kalpakgosalia.e_learningforkids;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KalpakGosalia on 13-04-2018.
 */

public class CustomAnimalAdapater  extends BaseAdapter{
    private Activity context;
    private String[] animal_name;
    private Integer[] animals_img;


    public CustomAnimalAdapater(Activity context, String[] animal_name, Integer[] animals_img) {
        this.context = context;
        this.animal_name = animal_name;
        this.animals_img = animals_img;
    }

    @Override
    public int getCount() {
        return animals_img.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return animals_img[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View r = convertView;
        ViewHolder2 viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.customanimalimag,null);
            viewHolder=new ViewHolder2(r);
            r.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder2)r.getTag();
        }
        viewHolder.img.setImageResource(animals_img[position]);
        viewHolder.txt.setText(animal_name[position]);
        return r;
    }
}
class ViewHolder2
{
    ImageView img;
    TextView txt;
    ViewHolder2(View v){
        txt = v.findViewById(R.id.textview);
        img =  v.findViewById(R.id.imageView);

    }
}