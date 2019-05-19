package com.education.leotech.hackingtutorial;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ContentAdapter extends ArrayAdapter<content> {

    public ContentAdapter(Activity context, ArrayList<content> Content) {
        super(context, 0, Content);
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        content Content = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.content_layout,parent,false);
        }

        TextView contenttitle =  convertView.findViewById(R.id.contentTitle);
        ImageView contentimage =  convertView.findViewById(R.id.image);


        contenttitle.setText(Content.getmContentName());
        contentimage.setImageResource(Content.getmImage());

        return convertView;
    }
}

