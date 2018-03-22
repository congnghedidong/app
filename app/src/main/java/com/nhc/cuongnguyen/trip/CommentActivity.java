package com.nhc.cuongnguyen.trip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CommentActivity extends AppCompatActivity {
    RecyclerView lv_comment;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    List<comment> comments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        lv_comment = (RecyclerView) findViewById(R.id.lv_comment);
        layoutManager = new LinearLayoutManager(CommentActivity.this);
        lv_comment.setLayoutManager(layoutManager);
        comments = new ArrayList<>();
        comments.add(new comment(R.drawable.hinh_nen_2,"Admin","Hay lắm!","2 giờ trước"));
        comments.add(new comment(R.drawable.hinh_nen_2,"Admin","Hay lắm!","2 giờ trước"));
        comments.add(new comment(R.drawable.hinh_nen_2,"Admin","Hay lắm!","2 giờ trước"));
        comments.add(new comment(R.drawable.hinh_nen_2,"Admin","Hay lắm!","2 giờ trước"));
        comments.add(new comment(R.drawable.hinh_nen_2,"Admin","Hay lắm!","2 giờ trước"));
        comments.add(new comment(R.drawable.hinh_nen_2,"Admin","Hay lắm!","2 giờ trước"));
        comments.add(new comment(R.drawable.hinh_nen_2,"Admin","Hay lắm!","2 giờ trước"));

        adapter = new CommentAdapter(comments);
        lv_comment.setAdapter(adapter);
    }
}
