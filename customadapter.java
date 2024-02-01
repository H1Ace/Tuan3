package com.example.myapplication.Tuan3;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;
import static android.graphics.Color.GREEN;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.myapplication.R;

import java.util.List;

public class customadapter extends ArrayAdapter<contact> {
    private Context context;
    private int resource;
    private List<contact> objects;
    private LayoutInflater inflater;
    public customadapter(Context context, int resource, List<contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder = new ViewHolder();
        if(convertView==null)
        {
            convertView = inflater.inflate(R.layout.item_listview,null);
            holder.tvAvatar=(TextView)convertView.findViewById(R.id.tvAvatar);
            holder.tvName=(TextView)convertView.findViewById(R.id.tvName);
            holder.tvPhone=(TextView)convertView.findViewById(R.id.tvPhone);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder)convertView.getTag();
        }
        contact contact = objects.get(position);
        holder.tvAvatar.setText(String.valueOf(position));
        holder.tvName.setText(contact.getName());
        holder.tvPhone.setText(contact.getPhone());

        return convertView;
    }
    public class ViewHolder{
        TextView tvAvatar,tvName,tvPhone;
    }
}
