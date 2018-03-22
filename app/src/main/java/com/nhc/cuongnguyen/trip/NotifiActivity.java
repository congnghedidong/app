package com.nhc.cuongnguyen.trip;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NotifiActivity extends Fragment {

    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    RecyclerView lv_notifi;
    List<Notifi> notifis;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_notifi, container, false);

        lv_notifi = (RecyclerView) rootView.findViewById(R.id.lv_notifi);
        layoutManager = new LinearLayoutManager(getContext());
        lv_notifi.setLayoutManager(layoutManager);
        notifis = new ArrayList<>();
        notifis.add(new Notifi(R.drawable.nui_than_tai,"[Chú ý!] Chuyến đi Núi thần tài 15 ngày nữa sẽ bắt đầu."));
        notifis.add(new Notifi(R.drawable.nui_than_tai,"[Chú ý!] Chuyến đi Núi thần tài 15 ngày nữa sẽ bắt đầu."));
        notifis.add(new Notifi(R.drawable.nui_than_tai,"[Chú ý!] Chuyến đi Núi thần tài 15 ngày nữa sẽ bắt đầu."));
        notifis.add(new Notifi(R.drawable.nui_than_tai,"[Chú ý!] Chuyến đi Núi thần tài 15 ngày nữa sẽ bắt đầu."));
        notifis.add(new Notifi(R.drawable.nui_than_tai,"[Chú ý!] Chuyến đi Núi thần tài 15 ngày nữa sẽ bắt đầu."));
        notifis.add(new Notifi(R.drawable.nui_than_tai,"[Chú ý!] Chuyến đi Núi thần tài 15 ngày nữa sẽ bắt đầu."));
        notifis.add(new Notifi(R.drawable.nui_than_tai,"[Chú ý!] Chuyến đi Núi thần tài 15 ngày nữa sẽ bắt đầu."));
        notifis.add(new Notifi(R.drawable.nui_than_tai,"[Chú ý!] Chuyến đi Núi thần tài 15 ngày nữa sẽ bắt đầu."));
        adapter = new NotifiAdapter(notifis);
        lv_notifi.setAdapter(adapter);
        return rootView;
    }
}
