package com.nhc.cuongnguyen.trip;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC on 3/22/2018.
 */

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {
    private List<comment> comments;

    public CommentAdapter(List<comment> comments) {
        this.comments = comments;
    }

    public List<comment> getComments() {
        return comments;
    }

    public void setComments(List<comment> comments) {
        this.comments = comments;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dong_comment,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        comment comment = comments.get(position);
        holder.image_comment.setImageResource(comment.getImage_user());
        holder.username_comment.setText(comment.getName());
        holder.context.setText(comment.getContext());
        holder.datetime.setText(comment.getDatetime());
    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image_comment;
        TextView username_comment,context,datetime;
        public ViewHolder(View itemView) {
            super(itemView);
            image_comment = (ImageView) itemView.findViewById(R.id.image_comment);
            username_comment = (TextView) itemView.findViewById(R.id.username_comment);
            context = (TextView) itemView.findViewById(R.id.context_comment);
            datetime = (TextView) itemView.findViewById(R.id.datetime_comment);
        }
    }
}
