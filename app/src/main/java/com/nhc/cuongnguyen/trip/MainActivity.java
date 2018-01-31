package com.nhc.cuongnguyen.trip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("t1");
        tab1.setIndicator("",getResources().getDrawable(R.drawable.icon_newfeed));
        tab1.setContent(R.id.tabNewFeed);
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("t2");
        tab2.setIndicator("",getResources().getDrawable(R.drawable.icon_group));
        tab2.setContent(R.id.tabGroup);
        tabHost.addTab(tab2);

        TabHost.TabSpec tab3 = tabHost.newTabSpec("t1");
        tab3.setIndicator("",getResources().getDrawable(R.drawable.icon_notife));
        tab3.setContent(R.id.tabNotifi);
        tabHost.addTab(tab3);

        TabHost.TabSpec tab4 = tabHost.newTabSpec("t1");
        tab4.setIndicator("",getResources().getDrawable(R.drawable.icon_profile));
        tab4.setContent(R.id.tabProfile);
        tabHost.addTab(tab4);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
