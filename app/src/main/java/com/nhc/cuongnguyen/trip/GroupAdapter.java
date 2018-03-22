package com.nhc.cuongnguyen.trip;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC on 3/20/2018.
 */

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {

    private List<group> groups;

    public GroupAdapter(List<group> groups) {
        this.groups = groups;
    }

    public List<group> getGroups() {
        return groups;
    }

    public void setGroups(List<group> groups) {
        this.groups = groups;
    }

    @Override
    public GroupAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dong_group,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GroupAdapter.ViewHolder holder, int position) {
        group group = groups.get(position);
        holder.image_position.setImageResource(group.getImage());
        holder.name_position.setText(group.getName_position());
    }

    @Override
    public int getItemCount() {
        return groups.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image_position;
        TextView name_position;
        RelativeLayout group_mes;
        public ViewHolder(final View itemView) {
            super(itemView);
            image_position = (ImageView) itemView.findViewById(R.id.image_group);
            name_position = (TextView) itemView.findViewById(R.id.name_group);
            group_mes = (RelativeLayout) itemView.findViewById(R.id.group_mes);
            group_mes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(),MessengerActivity.class);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
