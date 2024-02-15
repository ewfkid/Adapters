package com.example.testandroid1502.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;


import com.example.testandroid1502.R;
import com.example.testandroid1502.domain.Person;

import java.util.List;

public class PersonAdapter extends ArrayAdapter<Person> {

    public PersonAdapter(Context context, List<Person> personList) {
        super(context, R.layout.item_person, personList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_person, null);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.tv_name);
        TextView tvId = (TextView) convertView.findViewById(R.id.tv_id);
        TextView tvPhone = (TextView) convertView.findViewById(R.id.tv_phone);
        tvName.setText((person.getName()));
        tvId.setText(String.valueOf(person.getId()));
        tvPhone.setText(person.getPhone());

        return convertView;

    }


}

