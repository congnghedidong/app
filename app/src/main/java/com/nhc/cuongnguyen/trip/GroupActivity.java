package com.nhc.cuongnguyen.trip;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GroupActivity extends Fragment {
    RecyclerView.LayoutManager layoutManager;
    RecyclerView lv_group;
    RecyclerView.Adapter adapter ;
    List<group> groups;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_group, container, false);
        lv_group = (RecyclerView) rootView.findViewById(R.id.list_group);
        layoutManager = new LinearLayoutManager(getContext());
        lv_group.setLayoutManager(layoutManager);
        groups = new ArrayList<>();
        groups.add(new group(R.drawable.nui_than_tai,"Núi thần tài"));
        groups.add(new group(R.drawable.nui_than_tai,"Núi thần tài"));
        groups.add(new group(R.drawable.nui_than_tai,"Núi thần tài"));
        groups.add(new group(R.drawable.nui_than_tai,"Núi thần tài"));
        groups.add(new group(R.drawable.nui_than_tai,"Núi thần tài"));
        groups.add(new group(R.drawable.nui_than_tai,"Núi thần tài"));

        adapter = new GroupAdapter(groups);
        lv_group.setAdapter(adapter);

        return rootView;
    }
}
