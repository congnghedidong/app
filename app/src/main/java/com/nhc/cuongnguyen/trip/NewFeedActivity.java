package com.nhc.cuongnguyen.trip;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NewFeedActivity extends Fragment {

    ListView lv_thongtin;
    ArrayList<ThongTin> thongTins;
    ThongTinAdapter thongTinAdapter;
    ArrayList<String> strings;
    ArrayAdapter adapter;
    View rootView;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         rootView = inflater.inflate(R.layout.activity_new_feed, container, false);
        lv_thongtin = (ListView) rootView.findViewById(R.id.List_newfeed);
        thongTins = new ArrayList<>();
        thongTins.add(new ThongTin("Admin","Núi Thần Tài",R.drawable.logo2,R.drawable.nui_than_tai,Float.parseFloat("4.5")));
        Toast.makeText(getActivity(), thongTins.toString(), Toast.LENGTH_SHORT).show();
        thongTinAdapter = new ThongTinAdapter(getActivity(),R.layout.dong_thong_tin,thongTins);
        lv_thongtin.setAdapter(thongTinAdapter);

        return rootView;
    }
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        lv_thongtin = (ListView) rootView.findViewById(R.id.List_newfeed);
//        thongTins = new ArrayList<>();
//
//        thongTins.add(new ThongTin("Admin","Núi Thần Tài",R.drawable.logo2,R.drawable.nui_than_tai,Float.parseFloat("4.5")));
//
//        thongTinAdapter = new ThongTinAdapter(getActivity(),R.layout.dong_thong_tin,thongTins);
//
//        lv_thongtin.setAdapter(thongTinAdapter);
//
////        strings = new ArrayList<>();
////
////        strings.add("nui than tai");
////        strings.add("nui than tai2");
////        strings.add("nui than tai3");
////        strings.add("nui than tai");
////        strings.add("nui than tai2");
////        strings.add("nui than tai3");
////        strings.add("nui than tai");
////        strings.add("nui than tai2");
////        strings.add("nui than tai3");
////        strings.add("nui than tai");
////        strings.add("nui than tai2");
////        strings.add("nui than tai3");
////        strings.add("nui than tai");
////        strings.add("nui than tai2");
////        strings.add("nui than tai3");
////        strings.add("nui than tai");
////        strings.add("nui than tai2");
////        strings.add("nui than tai3");
////        strings.add("nui than tai");
////        strings.add("nui than tai2");
////        strings.add("nui than tai3");
////
////        adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,strings);
////
////        lv_thongtin.setAdapter(adapter);
//        super.onActivityCreated(savedInstanceState);
//    }
}
