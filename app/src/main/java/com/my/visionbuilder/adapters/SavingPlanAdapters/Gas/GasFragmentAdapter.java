package com.my.visionbuilder.adapters.SavingPlanAdapters.Gas;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.my.visionbuilder.R;
import com.my.visionbuilder.fragments.Meetings.TodayFragment;
import com.my.visionbuilder.fragments.Meetings.UpcomingFragment;
import com.my.visionbuilder.fragments.SavingPlan.Gas.MonthlyFragment;
import com.my.visionbuilder.fragments.SavingPlan.Gas.WeeklyFragment;

public class GasFragmentAdapter extends FragmentStatePagerAdapter {

    Context context;

    public GasFragmentAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new WeeklyFragment();
            case 1:
                return new MonthlyFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return context.getResources().getString(R.string.title_Weekly);
            case 1:
                return context.getResources().getString(R.string.title_Monthly);
            default:
                return null;
        }
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
