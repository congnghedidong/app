package com.nhc.cuongnguyen.trip;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC on 3/20/2018.
 */

public class NotifiAdapter extends RecyclerView.Adapter<NotifiAdapter.ViewHolder> {
    private List<Notifi> notifis;

    public NotifiAdapter(List<Notifi> notifis) {
        this.notifis = notifis;
    }

    public List<Notifi> getNotifis() {
        return notifis;
    }

    public void setNotifis(List<Notifi> notifis) {
        this.notifis = notifis;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dong_notifi,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Notifi notifi = notifis.get(position);
        holder.image_notifi.setImageResource(notifi.getImage_Notifi());
        holder.notifi.setText(notifi.getNotifi());
    }

    @Override
    public int getItemCount() {
        return notifis.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image_notifi;
        TextView notifi;
        public ViewHolder(View itemView) {
            super(itemView);
            image_notifi = (ImageView) itemView.findViewById(R.id.image_notifi);
            notifi = (TextView) itemView.findViewById(R.id.notifi);
        }
    }
}
