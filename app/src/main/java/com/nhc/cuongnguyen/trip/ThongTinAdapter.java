package com.nhc.cuongnguyen.trip;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC on 3/4/2018.
 */

public class ThongTinAdapter extends RecyclerView.Adapter<ThongTinAdapter.ViewHolder> {
    private List<ThongTin> thongTins;

    public ThongTinAdapter(List<ThongTin> thongTins) {
        this.thongTins = thongTins;
    }

    public List<ThongTin> getThongTins() {
        return thongTins;
    }

    public void setThongTins(List<ThongTin> thongTins) {
        this.thongTins = thongTins;
    }

    @Override
    public ThongTinAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dong_thong_tin,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ThongTinAdapter.ViewHolder holder, int position) {
        ThongTin thongTin = thongTins.get(position);
        holder.nameUser.setText(thongTin.getNameUser());
        holder.imageUser.setImageResource(thongTin.getImageUser());
        holder.namePosition.setText(thongTin.getNamePosition());
        holder.imagePosition.setImageResource(thongTin.getImagePosition());
       // holder.rate.setText(thongTin.getRate()+"/5");
    }

    @Override
    public int getItemCount() {
        return thongTins.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageUser ;
        TextView nameUser ;
        TextView namePosition ;
        ImageView imagePosition ;
        TextView rate ;
        Button btn_comment;
        public ViewHolder(final View itemView) {
            super(itemView);
            imageUser = (ImageView) itemView.findViewById(R.id.image_user);
            nameUser = (TextView) itemView.findViewById(R.id.name_user);
            namePosition = (TextView) itemView.findViewById(R.id.name_position);
            imagePosition = (ImageView) itemView.findViewById(R.id.image_position);
            btn_comment = (Button) itemView.findViewById(R.id.btn_comment);
            btn_comment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(),CommentActivity.class);
                    itemView.getContext().startActivity(intent);
                }
            });
         //   rate = (TextView) itemView.findViewById(R.id.rate);
        }
    }


}
