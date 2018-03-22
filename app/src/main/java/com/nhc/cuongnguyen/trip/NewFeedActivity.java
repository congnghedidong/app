package com.nhc.cuongnguyen.trip;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NewFeedActivity extends Fragment {

    RecyclerView.LayoutManager layoutManager;
    RecyclerView lv_thongtin;
    RecyclerView.Adapter adapter ;

        ArrayList<ThongTin> thongTins;
       View rootView;
    Button dang_bai;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         rootView = inflater.inflate(R.layout.activity_new_feed, container, false);
        lv_thongtin = (RecyclerView) rootView.findViewById(R.id.List_newfeed);
        layoutManager = new LinearLayoutManager(getActivity());
        lv_thongtin.setLayoutManager(layoutManager);

        thongTins = new ArrayList<>();
        thongTins.add(new ThongTin("Admin","Núi Thần Tài",R.drawable.logo2,R.drawable.nui_than_tai,Float.parseFloat("4.5")));
        thongTins.add(new ThongTin("Admin","Núi Thần Tài",R.drawable.logo2,R.drawable.nui_than_tai,Float.parseFloat("4.5")));
        thongTins.add(new ThongTin("Admin","Núi Thần Tài",R.drawable.logo2,R.drawable.nui_than_tai,Float.parseFloat("4.5")));
        thongTins.add(new ThongTin("Admin","Núi Thần Tài",R.drawable.logo2,R.drawable.nui_than_tai,Float.parseFloat("4.5")));
        thongTins.add(new ThongTin("Admin","Núi Thần Tài",R.drawable.logo2,R.drawable.nui_than_tai,Float.parseFloat("4.5")));
        //Toast.makeText(getActivity(), thongTins.toString(), Toast.LENGTH_SHORT).show();
        adapter = new ThongTinAdapter(thongTins);
        lv_thongtin.setAdapter(adapter);

        dang_bai = (Button) rootView.findViewById(R.id.dang_bai);
        dang_bai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog_nhap();
            }
        });
        return rootView;
    }

    private void dialog_nhap() {
        Dialog dialog = new Dialog(getActivity());
        dialog.setCancelable(true);
        dialog.setTitle("Đăng bài");
        dialog.setContentView(R.layout.dialog_dangbai);
        dialog.show();
    }

}
