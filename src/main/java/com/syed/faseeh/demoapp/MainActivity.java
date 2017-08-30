package com.syed.faseeh.demoapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.darwindeveloper.horizontalscrollmenulibrary.custom_views.HorizontalScrollMenuView;

public class MainActivity extends AppCompatActivity {

    HorizontalScrollMenuView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu =(HorizontalScrollMenuView) findViewById(R.id.menu);

        initMenu();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

    }

    private void initMenu(){
        menu.addItem("Tab 1",R.drawable.ico);
        menu.addItem("Tab 2",R.drawable.ico);
        menu.addItem("Tab 3",R.drawable.ico);
        menu.addItem("Tab 4",R.drawable.ico);
        menu.addItem("Tab 5",R.drawable.ico);

        menu.setOnHSMenuClickListener(new HorizontalScrollMenuView.OnHSMenuClickListener() {
            @Override
            public void onHSMClick(com.darwindeveloper.horizontalscrollmenulibrary.extras.MenuItem menuItem, int position) {
                Toast.makeText(MainActivity.this,""+menuItem.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }

}

