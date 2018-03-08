package com.nhc.cuongnguyen.trip;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC on 3/4/2018.
 */

public class ThongTinAdapter extends ArrayAdapter {
    private Context context;
    private int layout;
    private List<ThongTin> thongTins;

    public ThongTinAdapter(Context context, int layout, List<ThongTin> thongTins) {
        super(context,layout,thongTins);
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public ThongTin getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        ImageView imageUser = (ImageView) view.findViewById(R.id.image_user);
        TextView nameUser = (TextView) view.findViewById(R.id.name_user);
        TextView namePosition = (TextView) view.findViewById(R.id.name_position);
        ImageView imagePosition = (ImageView) view.findViewById(R.id.image_position);
        TextView rate = (TextView) view.findViewById(R.id.rate);

        ThongTin thongTin = thongTins.get(i);
        imageUser.setImageResource(thongTin.getImageUser());
        nameUser.setText(thongTin.getNameUser());
        namePosition.setText(thongTin.getNamePosition());
        imagePosition.setImageResource(thongTin.getImagePosition());
        rate.setText(thongTin.getRate()+"");

        return null;
    }
}
