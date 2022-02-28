package com.my.visionbuilder.activities.Finance.HouseFinance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.tabs.TabLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.FinanceAdapters.HouseFinanceAdapters.HouseFinanceFragmentAdapter;
import com.my.visionbuilder.adapters.GoalsAdapters.GoalsFragmentsAdapter;

public class HouseFinanceActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    HouseFinanceFragmentAdapter adapter;
    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_finance);

        back_Sign = findViewById(R.id.back_Sign);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tabbed_layout);
        adapter = new HouseFinanceFragmentAdapter(getSupportFragmentManager(), getApplicationContext());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}